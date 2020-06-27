import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        
        System.out.print("Annual Interest Rate: ");
        double interestRate = scanner.nextDouble()/100/12;
        
        System.out.print("Period (years): ");
        int period = scanner.nextInt()*12;
        
        double mortagePayment = principal*((interestRate*Math.pow(1+interestRate, period))/(Math.pow(1+interestRate, period)-1));
        
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String output = "Mortgage: " + currency.format(mortagePayment);
        System.out.println(output);
    }
}