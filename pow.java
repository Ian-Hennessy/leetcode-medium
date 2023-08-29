public class pow
{
    /*
     recursive algorithm to quickly and efficiently generate the
     value of an integer raised to some power
     Input: double x, int n
     Output: double x^(n)
     */
    private static double power(double  val)
    {
        double out = val * val;
        return out;
    }

    public static double main(double x, int n)
    {
        double hold = x;
        int power = 1;
        while(power <= (n/2))
        {
            power *= 2;
            x = power(x);
        }
        if (power == (n/2))
        {
            System.out.println(power(x));
            return power(x);
        }

        else
        {
            System.out.println(power(x) * hold);
            return (power(x) * hold);
        }


    }

}