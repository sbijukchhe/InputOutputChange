import java.util.Scanner;

public class InputOutputChange {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print( "First temperature? " );
        num1 = input.nextInt();

        System.out.print( "Second temperature? " );
        num2 = input.nextInt();

        System.out.print( "Third temperature? " );
        num3 = input.nextInt();

        int sum = num1 + num2 + num3;

        System.out.println("The Average temperature is : " + sum/3 );
    }
}
