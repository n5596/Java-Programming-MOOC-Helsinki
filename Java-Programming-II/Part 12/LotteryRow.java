
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        Random gen = new Random();
        int spots_left = 7;
        
        while (spots_left > 0){
            int newVal = gen.nextInt(40)+1;
            if (!this.containsNumber(newVal)){
                this.numbers.add(newVal);
                spots_left -= 1;
            }
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        for (int i=0; i<this.numbers.size(); i++){
            if (this.numbers.get(i) == number){
                return true;
            }
        }
        return false;
    }
}

