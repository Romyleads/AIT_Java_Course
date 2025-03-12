package homeworks.hw_30.Task2_v2;

/*** Author: Roman Romashko Date: 12.03.2025 ***/

public class ElectronicWallet extends BankAccount{

    public ElectronicWallet(String title) {
        super(title);
        currency = "BTC";
        typeAccount = "CryptoWallet";
    }

    @Override
    public double getCourseToEur() {
        return 80_000;
    }
}
