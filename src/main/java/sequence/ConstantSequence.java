package sequence;

public class ConstantSequence implements Sequence {

    private final int value;

    public ConstantSequence(int value) {
        this.value = value;
    }

    @Override
    public int nextValue() {
        return value;
    }
}
