import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    static int guess=0;
  static  int i=10, j=0;


    public static void main(String Args[])
    {
        Random new_num=new Random();
        int org_guess=new_num.nextInt(100);
        System.out.printf("\n<------------Welcome to Number guessing Game !!------------>\n");
        System.out.printf("\n\n              Guess the number from 1-100           \n\n");
        System.out.println("        <----You have maximum 10 Attempts!---->");
        Scanner sc=new Scanner(System.in);
        while(i>0)
        {
            System.out.printf("\nEnter the number to guess : ");
            guess=sc.nextInt();
            i--;j++;
            if(guess==org_guess)
            {
                break;
            }
            else if(guess<org_guess)
            {
                System.out.printf("Wrong Guess !!! \nYour number is less than original number !\n Re-try again!\n");
                System.out.println("Attempts remaining : "+i);
                
            }
            else if(guess>org_guess)
            {
                System.out.printf("Wrong Guess !!! \nYour number is greater than original number ! \nRe-try again!\n");
                System.out.println("Attempts remaining : "+i);
            }
        }
        if(guess==org_guess)
        {
            System.out.println("You won!!! in "+j+" attempts.");
            System.out.println("Your current Score out of 100 is : "+(100-10*j));
        }
        else{
            System.out.println("You lost !!! ");
            System.out.println("Number for guess was : "+org_guess);
        }
    }
}
