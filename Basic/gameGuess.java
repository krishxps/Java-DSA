import java.util.Scanner;
import java.util.Random;

public class gameGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        int numToGuess = rn.nextInt(101);
        int guessCount = 1;

        do {
            try {
                System.out.print("Guess any number: ");
                int usrGuess = sc.nextInt();
                if(usrGuess < 101 && usrGuess > -1){
                    System.out.println();
    
                    if (numToGuess == usrGuess) {
                        System.out.println("+------------------------+");
                        System.out.println("| That's Right Baby Dall |");
                        System.out.println("| You took " + guessCount + " Chance      |");
                        System.out.println("+------------------------+");
                        dragon();
                        break;
                    } else if (numToGuess > usrGuess) {
                        System.out.println("Think about bigger Number");
                    } else if (numToGuess < usrGuess) {
                        System.out.println("Think about smaller Number");
                    }
    
                    System.out.println("Guess count:" + guessCount + "\n");
                    guessCount++;
                }
                else{
                    System.out.println("ERROR: INVALID INPUT MORON\n");
                }
            } catch (Exception e) {
                System.out.println("ERROR: INT BOUND SURPASSED\n");
                break;
            }

        } while (true);

        sc.close();
    }

    public static void dragon() {
        System.out.println("      \\                    / \\  //\\");
        System.out.println("       \\    |\\___/|      /   \\//  \\\\");
        System.out.println("            /0  0  \\__  /    //  | \\ \\    ");
        System.out.println("           /     /  \\/_/    //   |  \\  \\  ");
        System.out.println("           @_^_@'/   \\/_   //    |   \\   \\ ");
        System.out.println("           //_^_/     \\/_ //     |    \\    \\");
        System.out.println("        ( //) |        \\///      |     \\     \\");
        System.out.println("      ( / /) _|_ /   )  //       |      \\     _\\");
        System.out.println("    ( // /) '/,_ _ _/  ( ; -.    |    _ _\\.-~        .-~~~^-. ");
        System.out.println("  (( / / )) ,-{        _      `-.|.-~-.           .~         `.");
        System.out.println(" (( // / ))  '/\\      /                 ~-. _ .-~      .-~^-.  \\");
        System.out.println(" (( /// ))      `.   {            }                   /      \\  \\");
        System.out.println("  (( / ))     .----~-\\.        \\-'                 .~         \\  `. \\^-.");
        System.out.println("             ///.----..>        \\             _ -~             `.  ^-`  ^-_");
        System.out.println("               ///-._ _ _ _ _ _ _}^ - - - - ~                     ~-- ,.-~");
        System.out.println("                                                                  /.-~\\");
    }
}
