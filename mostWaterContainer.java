public class mostWaterContainer
{
    private int area(int l, int r, int w)
    {
        if (l > r)
        {
            return(w * r);
        }
        else
        {
            return (l * w);
        }
    }
    public int maxArea(int[] height)
    {
        int max = 0;
        int rightPoint = height.length - 1;
        int leftPoint = 0;
        int len = height.length;
        int count = 0;
        while(count < len)
        {
            int l = height[leftPoint];
            int r = height[rightPoint];
            int w = rightPoint - leftPoint;
            int a = area(l,r,w);
            if (a > max)
            {
                max = a;
            }

            if(l > r)
            {
                rightPoint--;
                count++;
            }

            else if (r > l)
            {
                leftPoint++;
                count++;
            }

            else if (r == l)
            {
                leftPoint++;
                rightPoint--;
                count++;
            }
        }
        return max;
    }
}