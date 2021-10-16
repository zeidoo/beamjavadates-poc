import org.apache.beam.sdk.schemas.TestAvro;
import org.apache.beam.sdk.schemas.TestAvroNested;
import org.apache.beam.sdk.schemas.utils.AvroUtils;
import org.apache.beam.sdk.testing.PAssert;
import org.apache.beam.sdk.testing.TestPipeline;
import org.apache.beam.sdk.transforms.Create;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.TypeDescriptor;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;

public class JavaDatesTest {
    static final TestAvro[] ITEMS = new TestAvro[]{
            TestAvro.newBuilder()
                    .setRow(TestAvroNested.newBuilder().setDateInner(LocalDate.of(1979, 3, 16)).build())
                    .setDateOuter(LocalDate.of(1979, 3, 15))
                    .build()
    };


    @Test
    public void simpleTest() {
        var beamSchema = AvroUtils.toBeamSchema(TestAvro.getClassSchema());

        var p = TestPipeline.create();
        var input = p
                .apply(Create.of(Arrays.asList(ITEMS)))
                .setSchema(beamSchema,
                        TypeDescriptor.of(TestAvro.class),
                        AvroUtils.getToRowFunction(TestAvro.class, TestAvro.getClassSchema()),
                        AvroUtils.getFromRowFunction(TestAvro.class));

        var output = input.apply(ParDo.of(new FooDoFn()));

        PAssert.that(output).containsInAnyOrder(ITEMS);

        p.run();
    }

    public static class FooDoFn extends DoFn<TestAvro, TestAvro> {
        @ProcessElement
        public void apply(ProcessContext ctx) {
            var el = ctx.element();
            ctx.output(el);
        }
    }
}
