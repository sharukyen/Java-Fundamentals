package Week5;
import java.util.Iterator;
/**
 *Define an inner member class named OddIterator which implements the Iterator<Integer> interface. The inner member class generates a sequence of odd numbers starting from 1 to maxValue. The inner member contains the following:
 *
 * A private int data field named nextIndex that defines the next value in the iterator.
 * A method named hasNext() which returns true if the iteration has more elements, and false otherwise.
 * A method named next() which returns the next element in the iteration.
 * A method named removes() which removes from the underlying collection the last element returned by this iterator. Note: Use "throw new UnsupportedOperationException();" in this method as you are not required to implement this method.
 */


public class NumberSequence implements Iterable<Integer> {
    private int maxValue;
    public NumberSequence(int n) { maxValue = n; }
    public Iterator<Integer> iterator() {
        return new OddIterator();
    }
    class OddIterator implements Iterator<Integer> {
        private int nextIndex = 1; //starts at 1
        public boolean hasNext() {return (nextIndex<maxValue);} //non-inclusive
        public Integer next() {
            Integer value = new Integer(nextIndex);
            nextIndex += 2;
            return value;
        }
        public void remove() { throw new UnsupportedOperationException();}
    }


    public static void main(String[] args) {
        NumberSequence ds = new NumberSequence(20);
        Iterator iterator  = ds.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
    }
}
