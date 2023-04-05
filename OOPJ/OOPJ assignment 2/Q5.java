import java.util.Scanner;

class TelephoneBill{
    private String name;
    private long phoneNumber;
    private int callsmade;
    private double duration; 
    private double bill;

    public TelephoneBill(){
        this.name=null;
        this.phoneNumber=0;
        this.callsmade=0;
        this.duration=0.0;
        this.bill=0.0;
    }
    public void setName(String s){
        this.name=s;
    }
    public String getName(){
        return this.name;
    }
    public void setPhoneNumber(Long l){
        this.phoneNumber=l;
    }
    public long getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setCallsMade(int i){
        this.callsmade=i;
    }
    public int getCallsMade(){
        return this.callsmade;
    }
    public void setDuration(Double d){
        this.duration=d;
    }
    public double getDuration(){
        return this.duration;
    }
    public void calculateBillAmount(){
        if(callsmade<100){
            bill=10 + (callsmade * 0.50);
            System.out.println(name+" "+"your Telephone bill is : ");
            System.out.println("Calls made : "+callsmade);
            System.out.println("Duration : "+duration);
            System.out.println("Bill : "+bill+"$");
        }
        else{
            callsmade=callsmade-100;
            bill=60 + (callsmade * 0.50);
            System.out.println(name+" "+"your Telephone bill is : "+bill+"$");
            System.out.println("Calls made : "+(callsmade=callsmade+100));
            System.out.println("Duration : "+duration);
            System.out.println("Bill : "+bill+"$");
        }
    }

}

class Q5{
    public static void main(String args[]){
        TelephoneBill t1=new TelephoneBill();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name :");
        t1.setName(sc.nextLine());
        System.out.println("Enter your phone number :");
        t1.setPhoneNumber(sc.nextLong());
        System.out.println("Enter Number of calls made :");
        t1.setCallsMade(sc.nextInt());
        System.out.println("Enter total duration :");
        t1.setDuration(sc.nextDouble());
        t1.calculateBillAmount();

    }
}