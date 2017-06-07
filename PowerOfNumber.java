package power;

import java.util.Scanner;

public class PowerOfNumber {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=sc.nextInt();
	System.out.println("Enter the power of number");
	int power=sc.nextInt();
	double result=Math.pow(num,power);
	System.out.println(result);
}

}
