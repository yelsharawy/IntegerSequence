public class ArraySequence implements IntegerSequence {

    private int index;
    private int[] arr;

    public ArraySequence(int[] arr) {
        this.arr = arr;
        index = 0;
    }

    public void reset() {
        index = 0;
    }

    public int length() {
        return arr.length;
    }

    public boolean hasNext() {
        return index < length();
    }

    //@throws NoSuchElementException
    public int next() {
        return 0;
    }

}
