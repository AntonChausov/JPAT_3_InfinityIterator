import java.util.Iterator;
import java.util.Random;

public class IntegerIterator implements Iterator<Integer> {

    protected Random random;
    int max, min;

    public IntegerIterator(int max, int min, Random random) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int diff = max - min;
        random = new Random();
        return random.nextInt(diff + 1) + min;
    }
}
