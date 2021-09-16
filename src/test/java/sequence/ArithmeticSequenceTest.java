package sequence;

import org.junit.Assert;
import org.junit.Test;

import static sequence.SequenceTestUtil.RANDOM;

public class ArithmeticSequenceTest {

    private static final int N = 10;

    @Test
    public void testDefaultArithmeticSequence() {
        Sequence seq = new ArithmeticSequence();
        Assert.assertEquals(0, seq.nextValue());
        Assert.assertEquals(1, seq.nextValue());
        Assert.assertEquals(2, seq.nextValue());
        Assert.assertEquals(3, seq.nextValue());
        Assert.assertEquals(4, seq.nextValue());
        Assert.assertEquals(5, seq.nextValue());
    }

    @Test
    public void testArithmeticSequence() {
        for (int initialValue = 0; initialValue < N; initialValue++) {
            for (int difference = 0; difference < N; difference++) {
                Sequence arithmeticSeq = new ArithmeticSequence(initialValue, difference);
                int expectedValue = initialValue;
                for (int i = 0; i < N; i++) {
                    int value = arithmeticSeq.nextValue();
                    Assert.assertEquals(expectedValue, value);
                    expectedValue += difference;
                }
            }
        }
    }

    @Test
    public void testArithmeticSequenceWithRandomValues() {

        int currentValue = RANDOM.nextInt();
        int difference = RANDOM.nextInt();
        Sequence arithmeticSeq = new ArithmeticSequence(currentValue, difference);

        for (int i = 0; i < N; i++) {
            int value = arithmeticSeq.nextValue();
            Assert.assertEquals(currentValue, value);
            currentValue += difference;
        }
    }
}