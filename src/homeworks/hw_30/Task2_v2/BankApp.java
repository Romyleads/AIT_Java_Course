package homeworks.hw_30.Task2_v2;

/*** Author: Roman Romashko Date: 11.03.2025 ***/

public class BankApp {
    public static void main(String[] args) {

    BankAccount bank = new BankAccount("AlphaBank");
    System.out.println(bank);

    bank.withdrawMoney(500);
    bank.depositTransfer(10000);
    System.out.println(bank);

    System.out.println("====================");

    ElectronicWallet wallet= new ElectronicWallet("Binance");
    System.out.println(wallet);

    wallet.withdrawMoney(1);

    wallet.depositTransfer(0.1);
    System.out.println(wallet);

    wallet.depositTransfer(0.2);
    System.out.println(wallet);

    System.out.println("====================");

    BankAccount bank2 = new BankAccount("SuperBank");
    bank.transferMoney(5000, bank2);

    System.out.println("====================");

    bank2.transferMoney(4500, wallet);


    }
}
