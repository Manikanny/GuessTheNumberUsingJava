import java.util.Scanner;import
java.util.Random;
public class GuessNumber {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Min: ");
        int lowerLimit = sc.nextInt();
        System.out.print("Max: ");
        int upperLimit = sc.nextInt();
        int myNumber = rand.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
        int count = 0;
        while (true) {
                    count++;
                System.out.print("Guess the number: ");
                int userNumber = sc.nextInt();
                if (userNumber < myNumber) {
                System.out.println("Too small!");
            } else if (myNumber < userNumber) {
                System.out.println("Too large!");
                } else {
            System.out.println("Yeeee ! You got it in " + count + " tries!");
            break;
        }
}
sc.close();
}
}
