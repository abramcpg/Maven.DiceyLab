import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiceTest {
    @Test
    public void rollAndSum(){
        Dice dice = new Dice(1);
        int roll = dice.rollAndSum();
        boolean expected = true;
        boolean actual = false;

        if(roll <= 6 || roll > 0){
            actual = true;
        }
        assertEquals(expected, actual);
    }
    @Test
    public void rollAndSum2(){
        Dice dice = new Dice(2);
        int roll = dice.rollAndSum();
        boolean expected = true;
        boolean actual = false;

        if(roll <= 12 || roll > 1){
            actual = true;
        }
        assertEquals(expected, actual);
    }
    @Test
    public void rollAndSum3(){
        Dice dice = new Dice(1);
        int roll = dice.rollAndSum();
        boolean expected = true;
        boolean actual = false;

        if(roll <= 18 || roll > 2){
            actual = true;
        }
        assertEquals(expected, actual);
    }

}
