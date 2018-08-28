class area_of_Circle
{
    public static double area(int r)
    {
        double p = pi();
        double area = p * r * r;
        return area;
    }
    public static double pi()
    {
        return 3.14;
    }
    public static void main(String[] args) {
        //area_of_Circle a = new area_of_Circle();
        double b = area(5);
        System.out.println(b);
    }
}