class Q24
{
    public static void main(String args[])
    {
        float a= 23.3f;
        String z="45";
        String b=String.valueOf(a);
        System.out.println(b);

        Float c= new Float(a); //instance 
        System.out.println(c);

        String x= new String(z); //instance
        Float y=new Float(x);//instance
        System.out.println(y);

        System.out.println("Hexadecimal value : "+Float.toHexString(a));

    }
}