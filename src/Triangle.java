public class Triangle extends Figures
{
    private double a;
    private double b;
    private double c;

    public void SetA (double A)
    {
        this.a = A;
    }

    public void SetB (double B)
    {
        this.b = B;
    }

    public void SetC (double C)
    {
        this.c = C;
    }

    public double Perimeter ()
    {
        return a + b + c;
    }

    public double Square ()
    {
        double p = 0.5 * (a + b + c);
        double h = (2/a) * Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return 0.5 * a * h;
    }

    public double Diagonal ()
    {
        return 0;
    }
}
