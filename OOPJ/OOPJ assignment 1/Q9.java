class Q9
{
    public static void main(String args[])
    {
        Byte a= Byte.valueOf("9");
        byte b= Byte.valueOf(a);
        short c=Short.valueOf(a);
        int d=Integer.valueOf(a);
        float e=Float.valueOf(a);
        Double f=Double.valueOf(a);

        System.out.println("Byte :" +b);
        System.out.println("Short :" +c);
        System.out.println("Int :" +d);
        System.out.println("Float :" +e);
        System.out.println("Double :" +f);
    }
}