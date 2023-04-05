import java.util.Scanner;

class ElectricityBill{
    private String name;
    private double unitsConsumed;
    private double bill;

    public ElectricityBill(){
        this.name=null;
        this.unitsConsumed=0.0;
        this.bill=0.0;
    }
    public void setUnits(Double u){
        this.unitsConsumed=u;
    }
    public double getUnits(){
        return this.unitsConsumed;
    }
    public void setName(String s){
        this.name=s;
    }
    public String getName(){
        return this.name;
    }
    public void calculateBillAmount(){
        if (unitsConsumed<=100){
            bill=unitsConsumed * 5;
            System.out.println(this.name+" "+"Your bill is : "+bill);
        }
        else if(unitsConsumed>100 && unitsConsumed<200){
            unitsConsumed=unitsConsumed - 100;
            bill=500 + (unitsConsumed * 7);
            System.out.println(this.name+" "+"Your bill is : "+bill);
        }
        else{
            unitsConsumed=unitsConsumed - 200;
            bill=500 + 700 + (unitsConsumed * 10);
            System.out.println(this.name+" "+"Your bill is : "+bill);
        }
    }
}
class Q4{
    public static void main(String args[]){
        ElectricityBill e1=new ElectricityBill();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name : ");
        e1.setName(sc.nextLine());
        System.out.println("Enter units consumed : ");
        e1.setUnits(sc.nextDouble());
        e1.calculateBillAmount();

    }
}