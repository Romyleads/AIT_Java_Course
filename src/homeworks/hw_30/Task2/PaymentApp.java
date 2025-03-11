package homeworks.hw_30.Task2;

/*** Author: Roman Romashko Date: 11.03.2025 ***/

public class PaymentApp {
    public static void main(String[] args) {

        // Создаем счет в банке и ложим туда 1000 евро
        PaymentSystem bankAccount = new BankAccount(1000); // Банк в EUR

        // Создаем счет в электронном кошельке и ложим туда 500 долларов
        PaymentSystem eWallet = new ElectronicWallet(500, "USD"); // Кошелек в USD


        // Создадим счет на зачисление 100 евро в электронный кошелек и в банк
        System.out.println("Перевод 100 EUR из банка в EUR на кошелек в USD:");

        // Конвертируем 100 EUR в валюту кошелька (USD) по текущему курсу
        double convertedAmount = 100 * eWallet.getExchangeRate();

        // Зачисляем полученную сумму в валюте кошелька
        eWallet.depositTransfer(convertedAmount);

        // Списываем 100 EUR с банковского счета
        bankAccount.withdrawMoney(100);

        // Выводим информацию
        System.out.println("Текущий баланс электронного кошелька: " + eWallet.checkBalance() + " USD");
        System.out.println("\nТекущий баланс банковского счета: " + bankAccount.checkBalance() + " EUR");


        // Переводим 100 USD с электронного кошелька обратно в банк

        System.out.println("\nПеревод 100 USD на банковский счет:");

        // Конвертируем 100 USD в евро
        convertedAmount = 100 / eWallet.getExchangeRate();

        // Зачисляем конвертированную сумму на банковский счет
        bankAccount.depositTransfer(convertedAmount);

        // Списываем 100 USD с электронного кошелька
        eWallet.withdrawMoney(100);

        // Выводим информацию
        System.out.println("\nТекущий баланс банковского счета: " + bankAccount.checkBalance() + " EUR");
        System.out.println("Текущий баланс электронного кошелька: " + eWallet.checkBalance() + " USD");


    }
}
