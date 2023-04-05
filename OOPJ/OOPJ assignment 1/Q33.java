class Q33
{
    public static void main(String[] args)
    {
        
        int a = Integer.parseInt(args[0]);
        float b = Float.parseFloat(args[1]);
        double c = Double.parseDouble(args[2]);

        switch (args[3]) {
            case "+":
                System.out.println("Addition: " + (a + b + c));
                break;
            case "-":
                System.out.println("Subtraction: " + (a - b - c));
                break;
            case "*":
                System.out.println("MUltiplication: " + (a * b * c));
                break;
            case "/":
                System.out.println("Division: " + (a / b / c));
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}