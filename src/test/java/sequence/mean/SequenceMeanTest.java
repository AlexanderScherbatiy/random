package sequence.mean;

import org.junit.Assert;
import org.junit.Test;
import sequence.ConstantSequence;
import sequence.Sequence;
import sequence.SequenceUtil;

import static sequence.SequenceTestUtil.DELTA;
import static sequence.SequenceTestUtil.N;

public class SequenceMeanTest {

    @Test
    public void testConstantMean() {
        for (int i = 0; i < N; i++) {
            Sequence constSeq = new ConstantSequence(i);
            double mean = SequenceUtil.mean(constSeq, N);
            Assert.assertEquals(i, mean, DELTA);
        }
    }
}
