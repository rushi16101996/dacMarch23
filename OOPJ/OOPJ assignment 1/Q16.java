class Q16
{
    public static void main(String args[])
    {
        int a= 20;
        String z="45";
        String b=String.valueOf(a);
        System.out.println(b);

        Integer c= new Integer(a); //instance 
        System.out.println(c);

        String x= new String(z); //instance
        Integer y=new Integer(x);//instance
        System.out.println(y);

        System.out.println("Binary value : "+Integer.toBinaryString(a));
        System.out.println("Octal value : "+Integer.toOctalString(a));
        System.out.println("Hexadecimal value : "+Integer.toHexString(a));

    }
}