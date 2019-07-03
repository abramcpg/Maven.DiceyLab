public class Dice {
    private int numberOfDice;

    public Dice(){ this.numberOfDice = 1; }

    public Dice(int numberOfDice){
        this.numberOfDice = numberOfDice;
    }
    public int rollAndSum() {
        int sum = 0;
        for (int i = 0; i < numberOfDice ; i++) {
            sum += (int) (Math.random()*6+1);
        };
        return sum;
    }
}
