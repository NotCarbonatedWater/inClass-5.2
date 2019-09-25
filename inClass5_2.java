import java.util.Scanner;

public class inClass5_2
{
	public static void main(String [] args)
	{
        BlogEntry B1 = new BlogEntry();

        B1.set_BlogEntry();
        System.out.println(B1);
        System.out.println();
        System.out.print("The following shows get summary: ");
        B1.getSummary();
    }
}