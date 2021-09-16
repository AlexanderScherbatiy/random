package sequence;

import org.junit.Assert;
import org.junit.Test;

import static sequence.SequenceTestUtil.RANDOM;

public class ConstantSequenceTest {

    private static final int N = 10;

    @Test
    public void testConstantSequence() {
        for (int initialValue = 0; initialValue < N; initialValue++) {
            Sequence constSeq = new ConstantSequence(initialValue);
            for (int j = 0; j < N; j++) {
                Assert.assertEquals(initialValue, constSeq.nextValue());
            }
        }
    }

    @Test
    public void testConstantSequenceWithRandomValues() {

        int constValue = RANDOM.nextInt();
        Sequence constSeq = new ConstantSequence(constValue);

        for (int i = 0; i < N; i++) {
            int value = constSeq.nextValue();
            Assert.assertEquals(constValue, value);
        }
    }
}
