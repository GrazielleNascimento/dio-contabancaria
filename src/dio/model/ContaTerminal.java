package dio.model;

import java.util.Scanner;
import dio.util.Colors;

/**
 *
 * @author Grazirlle Ferreira
 */
public class ContaTerminal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("********************************");
        System.out.println(Colors.ANSI_GREEN_BACKGROUND + Colors.TEXT_WHITE_BOLD + "\tWelcome to PayBank\t\n" + Colors.TEXT_RESET);
        System.out.print("Enter the account number: " + Colors.TEXT_RESET);
        int numberAccount = input.nextInt();

        System.out.print("Enter the Agency: " + Colors.TEXT_RESET);
        String agency = input.next();

        System.out.print("Enter your Name: " + Colors.TEXT_RESET);
        String name = input.next();

        name = Character.toUpperCase(name.charAt(0)) + name.substring(1);

        System.out.print("Enter the Balance: " + Colors.TEXT_RESET);
        double balance = input.nextDouble();

        System.out.println("\nHello " + Colors.TEXT_PURPLE_BOLD + name + Colors.TEXT_RESET + ", \nthanks for creating \nan account at the bank.\nYour agency is " + agency + ", account number " + numberAccount + ", \nand your balance of " + balance + "\nis already available for withdrawal." + Colors.TEXT_RESET);
        System.out.println("********************************");
    }

}
