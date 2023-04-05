class Q13
{
    public static void main(String args[])
    {
        short a= 20;
        String z="45";
        String b=String.valueOf(a);
        System.out.println(b);

        Short c= new Short(a); //instance 
        System.out.println(c);

        String x= new String(z); //instance
        Short y=new Short(x);//instance
        System.out.println(y);


    }
}