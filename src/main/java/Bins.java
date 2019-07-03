import static java.lang.System.out;

public class Bins {
    private int[] results;
    private int die = 0;
    private int rolls = 0;

    public Bins() {
        results = new int[1];
    }

    public Bins(int dice, int roll) {
        this.die = dice;
        this.rolls = roll;
        Dice rollDieResults = new Dice(die);
        results = new int[(die * 6 + 1)];
        for (int i = 0; i < rolls; i++) {
            int diceRollNumber = rollDieResults.rollAndSum();
            results[diceRollNumber]++;
        }
    }

    public int getResults(int query) {
        return results[query];
    }

    public void increment(int index) {
        results[index]++;
    }

    public void printResults(){

        out.println("***");
        out.printf("Simulation of %2d dice tossed for %2d times. \n", die, rolls);
        out.println("***");
        out.println(" ");

        for (int i = die; i < results.length; i++) {
            double rate = (double)results[i]/(double)rolls;

            String star = "";
            double starNum = rate*100;
            for (int j = 0; j < starNum; j++) {
                star += "*";
            }
            out.printf("%2d : %9d : %1.2f %s \n", i, results[i], rate, star );
        }
    }
}
