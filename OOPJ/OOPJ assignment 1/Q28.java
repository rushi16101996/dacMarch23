class Q28
{
    public static void main(String args[])
    {
        double a= 23.33333;
        String z="45";
        String b=String.valueOf(a);
        System.out.println(b);

        Double c= new Double(a); //instance 
        System.out.println(c);

        String x= new String(z); //instance
        Double y=new Double(x);//instance
        System.out.println(y);

        Long d=Double.doubleToLongBits(a);
        System.out.println("Binary value : "+Long.toBinaryString(d));
        System.out.println("Octal value : "+Long.toOctalString(d));
        System.out.println("Hexadecimal value : "+Long.toHexString(d));

    }
}