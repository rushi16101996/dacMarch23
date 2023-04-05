import java.util.Scanner;

class Book{
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year;
    private double price;
    private int quantity;
    int i;
    int d;
    double p;
    Scanner sc=new Scanner(System.in);

    public Book(){
        this.title="Think and grow Rich";
        this.author="Napoleon Hill";
        this.publisher="Amazon Reads";
        this.isbn="1234-56789";
        this.year=1937;
        this.price=150.00;
        this.quantity=5;
    }
    public int menulist(){
        System.out.println("If you want to increase quantity press 1 :");
        System.out.println("If you want to decrease quantity press 2 :");
        System.out.println("Enter your choice :");
        return sc.nextInt();
    }
    public void setIncrease(){
        System.out.print("Enter number of quantity to be increased :");
        i=sc.nextInt();  
    }
    public int getIncrease(){
        return this.i;
    }
    public void setDecrease(){
        System.out.print("Enter number of quantity to be decreased :");
        d=sc.nextInt();
    }
    public int getDecrease(){
        return this.d;
    }
    public void getInventoryValue(){
        if (i!=0){
            System.out.println("Before increasing quantity :");
            p=quantity*price;
            System.out.println(this.title+"\n"+this.author+"\n"+this.publisher+"\n"+this.isbn+"\n"+this.year+"\n"+p+"\n"+this.quantity);
            p=price *(quantity + i);
            quantity=quantity+i;
            System.out.println("After increasing quantity :");
            System.out.println(title+"\n"+author+"\n"+publisher+"\n"+isbn+"\n"+year+"\n"+p+"\n"+quantity);
        }
        else{
            System.out.println("Before decreasing quantity :");
            p=quantity*price;
            System.out.println(this.title+"\n"+this.author+"\n"+this.publisher+"\n"+this.isbn+"\n"+this.year+"\n"+p+"\n"+this.quantity);
            p=price *(quantity - d);
            quantity=quantity-d;
            System.out.println("After decreasing quantity :");
            System.out.println(title+"\n"+author+"\n"+publisher+"\n"+isbn+"\n"+year+"\n"+p+"\n"+quantity);
        }
    } 
}
public class Q3_1{
    public static void main(String args[]){
        int choice;
        Book b1=new Book();
        if(( choice = b1.menulist())!=0){
            switch (choice){
                case 1:
                    b1.setIncrease();
                    break;
                case 2:
                    b1.setDecrease();
                    break;
            }
        }
        b1.getInventoryValue();   
    }
}