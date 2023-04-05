class Q8
{
    public static void main(String args[])
    {
        byte a= 2;
        String b=String.valueOf(a);
        System.out.println(b);
        String c=Byte.toString(a);
        System.out.println(c);
        Byte d=new Byte(a);
        System.out.println(d);
        String s= "180";
        Byte x= Byte.parseByte(s);
        System.out.println(x);

    }
}