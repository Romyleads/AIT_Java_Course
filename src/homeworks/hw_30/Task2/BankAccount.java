package homeworks.hw_30.Task2;

/*** Author: Roman Romashko Date: 11.03.2025 ***/

public class BankAccount implements PaymentSystem{

    private double balance;
    private final String currency = "EUR"; // Фиксированная валюта
    private final double exchangeRate = 1.0; // Евро — базовая валюта


    // Конструктор, устанавливающий начальный баланс счета
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Метод для снятия денег со счета
    @Override
    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снято: " + amount + " " + currency + ". Новый баланс: " + balance + " " + currency + ".");
        } else {
            System.out.println("Ошибка: недостаточно средств или неверная сумма.");
        }
    }

    // Метод для пополнения счета
    @Override
    public void depositTransfer(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Зачислено: " + amount + " " + currency + ". Новый баланс: " + balance + " " + currency + ".");
        } else {
            System.out.println("Ошибка: сумма должна быть положительной.");
        }
    }

    // Метод для возврата остатка на счете
    @Override
    public double checkBalance() {
        return balance;
    }

    // Текущее состояние счета в виде строки
    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", currency='" + currency + '\'' +
                '}';
    }


    @Override
    public String getCurrency() {
        return currency;
    }

    @Override
    public double getExchangeRate() {
        return exchangeRate;
    }

}
