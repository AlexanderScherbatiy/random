package sequence;

public class SequenceUtil {

    public static double mean(Sequence seq, int size) {

        int s = 0;

        for (int i = 0; i < size; i++) {
            s += seq.nextValue();
        }

        return ((double) s) / size;
    }
}
