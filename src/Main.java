import java.util.InputMismatchException;
import java.util.Scanner;
class Income
{
    public static void main(String args[])
    {
        double tax=0, it;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter income ");

        try {
            it= sc.nextDouble();
        } catch (InputMismatchException exception ) {
            System.out.println("Decimal number expected!");
            return;
        }
        if(it<=3.3000000)
            tax=0;
        else if(it>=3.3000000)
            tax=20;
        else if (it<=6.95000000)
            tax=20;
        else if (it>=6.95000000)
            tax=23;
        else if (it<=9000000)
            tax=23;
        else if (it>=9000000)
            tax=33;
        else if (it<=18000000)
            tax=33;



        System.out.println("Income tax amount is "+tax);


    }
}