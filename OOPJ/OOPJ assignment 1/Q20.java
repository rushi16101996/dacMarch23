class Q20
{
    public static void main(String args[])
    {
        long a= 255L;
        String z="45";
        String b=String.valueOf(a);
        System.out.println(b);

        Long c= new Long(a); //instance 
        System.out.println(c);

        String x= new String(z); //instance
        Long y=new Long(x);//instance
        System.out.println(y);

        System.out.println("Binary value : "+Long.toBinaryString(a));
        System.out.println("Octal value : "+Long.toOctalString(a));
        System.out.println("Hexadecimal value : "+Long.toHexString(a));

    }
}