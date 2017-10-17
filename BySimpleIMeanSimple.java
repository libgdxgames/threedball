
 import java.util.Random;

//The greatest game ever made follows.
class BySimpleIMeanSimple {
    
    
    
    
    public static void main(String[] args) {
    
        rollDie();
    
    } // ends main


    static void rollDie() {
    
        Random rand = new Random();
    
        // Assign a random number between 1 and 6 as dieValue
        int dieValue = rand.nextInt(6) + 1;
    
        System.out.println("You rolled a " + dieValue);
    
        // Why add 1? Think about it.
        testDieValue(dieValue);
    
    } // ends rollDie()


    static void testDieValue(int dieValue) {
    
        if (dieValue <= 2) {
            System.out.println("You Lose.");
        } // ends if
        
        else if (dieValue == 3 || dieValue == 4 || dieValue == 5) {
            System.out.println();
            System.out.println("Rerolling.");
            System.out.println();
            rollDie();
        } // ends else if 
        
        else if (dieValue == 6) {
            System.out.println("You win! Congratulations!");
        } // ends else if
        
    } // ends testDieValue()

}  // ends BySimpleIMeanSimple Class 
