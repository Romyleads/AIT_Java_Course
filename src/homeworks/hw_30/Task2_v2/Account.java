package homeworks.hw_30.Task2_v2;

/*** Author: Roman Romashko Date: 11.03.2025 ***/

public abstract class Account implements PaymentSystem{
    private String title;
    private double balance;

    protected String currency;
    protected String typeAccount;


    public Account(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void withdrawMoney(double amount) {
    if (amount>balance) {
        System.out.printf("Недостаточно денег на счету для снятия %.2f %s\n", amount,currency);
        return;
    }
    balance-=amount;
    System.out.printf("%s %s. Снято со счета %.2f %s\n",typeAccount,title,amount,currency);

    }

    @Override
    public void depositTransfer(double amount) {
    if (amount<=0) return;

    balance+=amount;
    System.out.printf("%s %s. Зачислено на счет %.2f %s\n",typeAccount,title,amount,currency);
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    // Вводим курс
    // Получение курса Валюта счета к евро
    // abstract public double getCourseToEur();


    @Override
    public String toString() {
        return String.format("%s %s. Balance: %.2f %s",
                typeAccount,getTitle(),checkBalance(),currency);
    }
    @Override
    public String getCurrency() {
        return currency;
    }
}
