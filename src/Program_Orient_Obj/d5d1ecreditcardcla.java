package Program_Orient_Obj;

import java.util.Locale;
import java.util.Scanner;

class CreditCard{
    public String holderName;
    public long cardNumber;
    public float accountBalance;
    public float spendingLimit;
}
public class d5d1ecreditcardcla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        CreditCard creditCard = new CreditCard();

        creditCard.holderName = scanner.nextLine();
        creditCard.cardNumber = scanner.nextLong();
        creditCard.accountBalance = scanner.nextFloat();
        creditCard.spendingLimit = scanner.nextFloat();

        System.out.println(creditCard.holderName.toUpperCase());
        System.out.println(String.valueOf(creditCard.cardNumber).replaceAll(".{4}","$0 "));
        System.out.println("Saldo: " + creditCard.accountBalance);
        System.out.println("Limit: " + creditCard.spendingLimit);
    }
}