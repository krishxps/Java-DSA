import java.util.Scanner;
import java.util.Random;

public class gameGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        int numToGuess = rn.nextInt(100);
        int guessCount = 0;

        do{
            System.out.print("Guess any number: ");
            int usrGuess = sc.nextInt();

            System.out.println();

            if(numToGuess == usrGuess){
                System.out.println("That's Right Baby Dall");
                break;
            }else if(numToGuess > usrGuess){
                System.out.println("Think about bigger Number");
                guessCount++;
            }else if(numToGuess < usrGuess){
                System.out.println("Think about smaller Number");
                guessCount++;
            }
            System.out.println("Guess count:" + guessCount + "\n");
        }while(true);
        
        System.out.println("You took " + guessCount + " Chance" );
        sc.close();
    }
}
