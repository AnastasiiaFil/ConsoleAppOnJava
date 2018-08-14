import java.util.Scanner;
public class Divisibility
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a % b == 0)
            System.out.println("Divisible");
        else
        {
            int div_res = a / b;
            int rem = a - div_res*b;
            System.out.println(div_res + " " + rem);
        }
    }
}
