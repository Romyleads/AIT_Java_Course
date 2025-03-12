package homeworks.hw_30.Task2_v2;

/*** Author: Roman Romashko Date: 11.03.2025 ***/

public interface PaymentSystem {

    void withdrawMoney(double amount);

    void depositTransfer(double amount);

    double checkBalance();

    void transferMoney(double amount, PaymentSystem recipient);
    String getCurrency();
    String getTitle();

    // Получение курса Валюта счета к евро
    double getCourseToEur();

}
