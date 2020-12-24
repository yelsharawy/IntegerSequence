import java.util.*;

public class ArraySequence implements IntegerSequence {

    private int index = 0;
    private int[] data;

    public ArraySequence(int[] arr) {
        data = Arrays.copyOf(arr, arr.length);
    }

    public ArraySequence(IntegerSequence otherSeq) {
        otherSeq.reset();
        data = new int[otherSeq.length()];
        for (int i = 0; i < data.length; i++) {
            data[i] = otherSeq.next();
        }
        otherSeq.reset();
    }

    public void reset() {
        index = 0;
    }

    public int length() {
        return data.length;
    }

    public boolean hasNext() {
        return index < length();
    }

    //@throws NoSuchElementException
    public int next() {
        if (!hasNext()) {
            throw new NoSuchElementException("cannot exceed end of array");
        }
        return data[index++];
    }

}
