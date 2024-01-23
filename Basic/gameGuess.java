import java.util.Scanner;
import java.util.Random;

public class gameGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        int numToGuess = rn.nextInt(101);
        int guessCount = 1;

        do {
            System.out.print("Guess any number: ");
            int usrGuess = sc.nextInt();

            System.out.println();

            if (numToGuess == usrGuess) {
                System.out.println("+------------------------+");
                System.out.println("| That's Right Baby Dall |");
                System.out.println("| You took "+ guessCount+ " Chance      |");
                System.out.println("+------------------------+");
                dragon();
                break;
            } else if (numToGuess > usrGuess) {
                System.out.println("Think about bigger Number");
                guessPrint(guessCount);
                guessCount++;
            } else if (numToGuess < usrGuess) {
                System.out.println("Think about smaller Number");
                guessPrint(guessCount);
                guessCount++;
            }
        } while (true);

        sc.close();
    }
    public static void guessPrint(int guessCount){
        System.out.println("Guess count:" + guessCount + "\n");
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
