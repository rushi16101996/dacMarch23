import java.util.Scanner;

class BMI{
    double height;
    double weight;
    public BMI(){
        this.height=height;
        this.weight=weight;
    }
    public void setHeight(Double Height){
        this.height = Height;
    }
    public double getHeight(){
        return this.height;
    }
     public void setWeight(Double Weight){
        this.weight = Weight;
    }
    public double getWeight(){
        return this.weight;
    }
    public void calculateBMI(){
        double cbmi=weight/(height*height);
        System.out.println("Your BMI is : "+cbmi);
    }

}
class Q2{
    public static void main(String args[]){
        BMI b1= new BMI();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Height : ");
        b1.setHeight(sc.nextDouble());

        System.out.println("Enter your Weight : ");
        b1.setWeight(sc.nextDouble());

        b1.calculateBMI();
    }
}