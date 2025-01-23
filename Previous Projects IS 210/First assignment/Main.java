//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double credit,creditUsed,availableCredit  = 0;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("What is your maximum amount of credit?");
        credit = scanner.nextDouble();

        System.out.println("How much credit have you used?");
        creditUsed = scanner.nextDouble();

        availableCredit = credit - creditUsed;
        System.out.println("Your available credit is: " + availableCredit);

        scanner.close();
        }
    }
