package homeworks.hw_30.Task2;

/*** Author: Roman Romashko Date: 11.03.2025 ***/

/*
    Task 2
    Платежные системы

    Создайте

    интерфейс PaymentSystem с методами:
    withdrawMoney(double amount) (снятие со счета) - списываются деньги со счета
    depositTransfer(double amount) (поступление денег на счет);
    checkBalance() (остаток на счете).


    Напишите классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.

    Банк предоставляет счета, например, в евро, а электронный кошелек в другой валюте
    Убедитесь, что каждый класс корректно выполняет каждую из операций.

 */

public interface PaymentSystem {
    void withdrawMoney(double amount); // Метод для снятия денег со счета
    void depositTransfer(double amount); // Метод для пополнения счета
    double checkBalance(); // Метод для проверки остатка на счете
    String getCurrency(); // Получение валюты счета
    double getExchangeRate(); // Получение курса обмена
}
