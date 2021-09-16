package sample;

import sequence.Sequence;
import sequence.ArithmeticSequence;

public class Main {

    public static void main(String[] args) {
        int N = 11;
        Sequence evenSeq = new ArithmeticSequence(0, 2);
        for (int i = 0; i < N; i++) {
            int value = evenSeq.nextValue();
            System.out.printf("even number for %d is %d%n", i, value);
        }
    }
}