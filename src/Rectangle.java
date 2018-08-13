public class Rectangle extends Figures
{
    private double a;
    private double b;

    public void SetA (double A)
    {
        this.a = A;
    }

    public void SetB (double B)
    {
        this.b = B;
    }

    public double Perimeter ()
    {
       return 2 * (a + b);
    }

    public double Square ()
    {
        return a * b;
    }

    public double Diagonal()
    {
        return Math.sqrt((a * a) + (b * b));
    }
}
