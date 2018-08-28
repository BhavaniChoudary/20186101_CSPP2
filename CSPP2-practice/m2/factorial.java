class factorial
{
    public static int f(int b)
    {
        if(b==1)
        {
            return 1;
        }
        else
        {
            return b * f(b-1);
        }
    }
    public static void main(String args[])
    {
        int a = 10;
        System.out.print(f(a));
    }
}