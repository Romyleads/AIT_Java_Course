package homeworks.hw_30.Task2;

/*** Author: Roman Romashko Date: 11.03.2025 ***/

// Класс электронного кошелька (можно выбрать валюту и задать курс)

public class ElectronicWallet implements PaymentSystem{
    private double balance;
    private final String currency;
    private final double exchangeRate; // Курс относительно евро


    // Конструктор, принимающий начальный баланс и валюту кошелька
    public ElectronicWallet(double startBalance, String currency) {
        this.balance = startBalance;
        this.currency = currency;
        this.exchangeRate = defineExchangeRate(currency);
    }

    // Метод для установки курса валют
    private double defineExchangeRate(String currency) {
        if (currency.equals("USD")) {
            return 1.1; // 1 EUR = 1.1 USD
        } else if (currency.equals("GBP")) {
            return 0.85; // 1 EUR = 0.85 GBP
        }
        return 1.0; // По умолчанию — евро
    }

    // Метод для снятия денег с электронного кошелька
    @Override
    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снято: " + amount + " " + currency + ". Новый баланс: " + balance + " " + currency + ".");
        } else {
            System.out.println("Ошибка: недостаточно средств или неверная сумма.");
        }
    }

    // Метод для пополнения электронного кошелька
    @Override
    public void depositTransfer(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Зачислено: " + amount + " " + currency + ". Новый баланс: " + balance + " " + currency + ".");
        } else {
            System.out.println("Ошибка: сумма должна быть положительной.");
        }
    }

    // Метод для проверки остатка в электронном кошельке
    @Override
    public double checkBalance() {
        return balance;
    }
    @Override
    public String getCurrency() {
        return currency;
    }
    @Override
    public double getExchangeRate() {
        return exchangeRate;
    }

    // Текущее состояние счета электронного кошелька в виде строки
    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", currency='" + currency + '\'' +
                '}';
    }
}
