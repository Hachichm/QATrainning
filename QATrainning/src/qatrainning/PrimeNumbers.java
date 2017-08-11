import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    int i =0;
    int Number =0;
    //Empty String
    String  primeNumbers = "";
      System.out.println("Enter the value of n:");
    int n = scanner.nextInt();
      for (i = 1; i <= n; i++)
    {
        int counter=0;
        for(Number =i; Number>=1; Number--)
        {
            if(i%Number==0)
            {
                counter++;
            }
        }
        if (counter ==2)
        {
            //Appended the Prime number to the String
            primeNumbers = primeNumbers + i + ",";
        }
    }
      System.out.println("Prime numbers: ");
      System.out.println(primeNumbers);

}}


