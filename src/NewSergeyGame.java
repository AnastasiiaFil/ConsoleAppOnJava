import java.util.Scanner;
public class NewSergeyGame
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int x_bleft = in.nextInt();
        int y_bleft = in.nextInt();

        int x_bright = in.nextInt();
        int y_bright = in.nextInt();


        int x_wleft = in.nextInt();
        int y_wleft = in.nextInt();

        int x_wright = in.nextInt();
        int y_wright = in.nextInt();

        int x = in.nextInt();
        int y = in.nextInt();

        if (y <= y_wleft && y >= y_wright && x <= x_wright && x >= x_wleft)
        {
            System.out.println("SAD");
        }
        else if (y <= y_bleft && y >= y_bright && x <= x_bright && x >= x_bleft)
        {
            System.out.println("HAPPY");
        }
        else
        {
            System.out.println("SAD");
        }
    }
}
