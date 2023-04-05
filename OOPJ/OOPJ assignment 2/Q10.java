import java.util.Scanner;

class CreditScoreCalculate{
    private int creditHistory;
    private double creditUtilization;
    private boolean paymentHistory;
    private int creditScore;

    CreditScoreCalculate(){
    int creditHistory=0;
    double creditUtilization=0;
    boolean paymentHistory=false;
    double creditScore=0;
    }

    public int getCreditHistory(){
        return this.creditHistory;
    }
    public double getCreditUtilization(){
        return this.creditUtilization;
    }
    public boolean getPaymentHistory(){
        return this.paymentHistory;
    }
    public int getCreditScore(){
        return this.creditScore;
    }
    
    public void setCreditHistory(int creditHistory){
        this.creditHistory=creditHistory;
    }
    public void setCreditUtilization(double creditUtilization){
        this.creditUtilization=creditUtilization;
    }
    public void setPaymentHistory(boolean paymentHistory){
        this.paymentHistory=paymentHistory;
    }
    public void setCreditScore(){
        if(this.getPaymentHistory()){
            this.creditScore=((this.getCreditHistory()*15)+((int)(this.getCreditUtilization()*30))+50);
        }
        else{
            this.creditScore=((this.getCreditHistory()*15)+((int)(this.getCreditUtilization()*30))+35);
        }
    }
}

class Q10{
    

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
    CreditScoreCalculate c1 = new CreditScoreCalculate();
    System.out.println("Enter Credit History : ");
    c1.setCreditHistory(sc.nextInt());
    System.out.println("Enter Credit Utilization : ");
    c1.setCreditUtilization(sc.nextDouble());
    System.out.println("Enter Payment History : ");
    c1.setPaymentHistory(sc.nextBoolean());
    c1.setCreditScore();

    System.out.println("Your credit Score : "+c1.getCreditScore());
    }
    
}