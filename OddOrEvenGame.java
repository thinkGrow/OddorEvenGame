import java.util.*;

public class OddOrEvenGame {


    public static void main (String[] args)
    {
        System.out.println("Let's play a game. Where if you choose odd or even. Then you choose number of fingers. Your opponent chooses number of fingers aswell. ");
        System.out.println("We will add both your number of fingers and your opponent's. If the sum is odd and you have initially chosen odd, you win, orelse you lose.");
        System.out.println("If you chose even initially, and the sum turns out to be even, then you win, orelse you lose.");;
        Scanner input = new Scanner(System.in);
        int a = -1, c, d, e, b = -1, f;


        c = chooseOddorEven(a); //from method call, if c = 1, odd and if c = 0, you chose even



        if (c== 0 || c== 1) {
            System.out.print("Choose number of fingers");

            int noOfFingers = input.nextInt();

            if (numberOfFingersChosenByYouIsValid(noOfFingers)) {
                d = noOfFingers;

                e = numberOfFingerChosenByPCAndSumOfYourFingersAndPC(d); // e means sum of fingers

                f = sumOddorEven(e); //f = 0 means even, f = 1 means odd, whether sum is odd or even is being determined

                if (c == 1 && f == 1 || c == 0 && f == 0) { //c is what you chose as odd or even. If you chose odd and if the sum of your fingers
                                                            //and PC's fingers is odd, you win and vice-versa. Therefore we compare the sum and what you chose
                    System.out.println("You win");
                } else System.out.println("You Lose");
            }
        }

        else System.out.println("Invalid input of odd or even");;

}

    public static int chooseOddorEven (int a)
    {   int chosen;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter \"Odd\" for choosing odd or \"Even\" for Even");
        String chooseOddEvent = input.next();

        if (chooseOddEvent.equals("Odd"))
        {
            chosen = 1;
        }
        else if (chooseOddEvent.equals("Even")) { chosen = 0;}
        else {chosen = 2;}

        return chosen;
    }

    public static boolean numberOfFingersChosenByYouIsValid (int noOfFingers)
    {
        if (noOfFingers < 6) {
                        return true;
        } else System.out.println("Invalid! Your hand has maximum 5 fingers"); return false;
    }

    public static int numberOfFingerChosenByPCAndSumOfYourFingersAndPC (int noOfFingers)
    {       Random rand = new Random();
            int noOfFingersByPC = rand.nextInt(6);
            System.out.println("Number of fingers chosen by your opponent: " + noOfFingersByPC);
            int SumOfFingers = noOfFingers + noOfFingersByPC;
            System.out.println("Sum of fingers chosen by both: " + SumOfFingers);



        return SumOfFingers;
    }

    public static int sumOddorEven ( int sumCheck)
    {
        if ((sumCheck%2)==0)
        {
            sumCheck = 0;
        }

        else sumCheck = 1;

        return sumCheck;
    }


}
