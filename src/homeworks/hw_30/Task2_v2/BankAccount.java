package homeworks.hw_30.Task2_v2;

/*** Author: Roman Romashko Date: 12.03.2025 ***/

public class BankAccount extends Account{

    public BankAccount(String title) {
        super(title);
        currency = "EUR";
        typeAccount = "Bank";
    }

    @Override
    public double getCourseToEur() {
        return 1;
    }

    // Вывод денег - сумма которую переводим - всегда в валюте счета
    // Проверяем валюту счета получателя. Высчитываем курс пересчета
    // Отправляем получателю сумму к валюте счета получателя

    @Override
    public void transferMoney(double amountEur, PaymentSystem recipient) {
        if (amountEur> checkBalance()){
            System.out.printf("Недостаточно средств! Трансфер %.2f | Баланс: %.2f\n",amountEur,checkBalance());
            return;
        }

    if (recipient.getCurrency().equals("EUR")){

        // перевод на евро счет (ковертация не нужна)
        withdrawMoney(amountEur);
        recipient.depositTransfer(amountEur);
        System.out.printf("Успех! Перевод (%s -> %s) %.2f EUR завершен", getTitle(), recipient.getTitle(),amountEur);
        return;
    }

    if (recipient.getCurrency().equals("BTC")){

            // Конвертировать EUR в BTC

            double amountBTC = amountEur / recipient.getCourseToEur();

            withdrawMoney(amountEur);
            recipient.depositTransfer(amountBTC);

            System.out.printf("Успех! Перевод (%s -> %s) %.2f EUR -> %.5f %s завершен",
                    getTitle(), recipient.getTitle(),amountEur,amountBTC, recipient.getCurrency());
            return;
        }

    }
}
