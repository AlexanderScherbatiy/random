package sequence;

public class ArithmeticSequence implements Sequence {

    private int currentTerm;
    private final int difference;

    public ArithmeticSequence() {
        this(0, 1);
    }

    public ArithmeticSequence(int firstTerm, int difference) {
        this.currentTerm = firstTerm;
        this.difference = difference;
    }

    @Override
    public int nextValue() {
        int value = currentTerm;
        currentTerm += difference;
        return value;
    }
}
