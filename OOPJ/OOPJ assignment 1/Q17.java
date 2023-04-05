class Q17
{
    public static void main(String args[])
    {
        int a=25;
        Integer b= new Integer(a);

        byte b1=b.byteValue();
        System.out.println(b1);

        short s1=b.shortValue();
        System.out.println(s1);

        int i1=b.intValue();
        System.out.println(i1);

        long l1=b.longValue();
        System.out.println(l1);
        
        float f1=b.floatValue();
        System.out.println(f1);

        double d1=b.doubleValue();
        System.out.println(d1);

    }
}