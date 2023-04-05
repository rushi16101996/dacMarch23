import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

class Q1{
    public static void main(String args[])
    {
        Calendar c = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day : ");
        int day = sc.nextInt();
        System.out.println("Enter month : ");
        int month = sc.nextInt();
        System.out.println("Enter year : ");
        int year = sc.nextInt();
        System.out.println("Enter hour : ");
        int hour = sc.nextInt();
        System.out.println("Enter min : ");
        int min = sc.nextInt();
        System.out.println("Enter sec : ");
        int sec = sc.nextInt();    
        
        
        SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy ");
        SimpleDateFormat s2 = new SimpleDateFormat("MM/dd/yyyy ");
        SimpleDateFormat s3 = new SimpleDateFormat("yyyy/MM/dd ");

        SimpleDateFormat s4 = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat s5 = new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat s6 = new SimpleDateFormat("HH:mm");

        SimpleDateFormat s7 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        SimpleDateFormat s8 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
        SimpleDateFormat s9 = new SimpleDateFormat("yyyy/MM/dd HH:mm");

        c.set(year,(month+1),day,hour,min,sec);
        System.out.println("dd/mm/yyyy "+s1.format(c.getTime()));
        System.out.println("mm/dd/yyyy "+s2.format(c.getTime()));
        System.out.println("yyyy/mm/dd "+s3.format(c.getTime()));

        System.out.println("HH:mm:ss : "+s4.format(c.getTime()));
        System.out.println("hh:mm:ss a : "+s5.format(c.getTime()));
        System.out.println("HH:mm : "+s6.format(c.getTime()));

        System.out.println("dd/mm/yyy HH:mm:ss : "+s7.format(c.getTime()));
        System.out.println("mm/dd/yyyy hh:mm:ss a : "+s8.format(c.getTime()));
        System.out.println("yyyy/mm/dd HH:mm : "+s9.format(c.getTime()));
    }
}