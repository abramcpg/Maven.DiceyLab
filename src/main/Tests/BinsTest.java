import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinsTest {
    @Test
    public void getResults(){
        Bins results = new Bins(2,10);
        int test = results.getResults(5);
        boolean expected = true;
        boolean actual = false;
        if (test <= 12 || test > 2) {
            actual = true;
        }
        assertEquals(expected, actual);
    }
    @Test
    public void getResults2(){
        Bins results = new Bins(4,10);
        int test = results.getResults(5);
        boolean expected = true;
        boolean actual = false;
        if (test <= 24 || test > 2) {
            actual = true;
        }
        assertEquals(expected, actual);
    }
    @Test
    public void getResults3(){
        Bins results = new Bins(3,10);
        int test = results.getResults(5);
        boolean expected = true;
        boolean actual = false;
        if (test <= 24 || test > 2) {
            actual = true;
        }
        assertEquals(expected, actual);
    }
    @Test
    public void incerement(){
        Bins test = new Bins();

        test.increment(0);
        int expected = test.getResults(0);
        int actual = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void incerement2(){
        Bins test = new Bins();

        test.increment(0);
        test.increment(0);
        int expected = test.getResults(0);
        int actual = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void incerement3(){
        Bins test = new Bins();

        test.increment(0);
        test.increment(0);
        test.increment(0);
        int expected = test.getResults(0);
        int actual = 3;
        assertEquals(expected, actual);
    }
}
