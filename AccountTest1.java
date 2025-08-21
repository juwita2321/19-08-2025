public class AccountTest1 {

    public static void main(String[] args) {

        // membuat object

        SavingAccount2 account1 = new SavingAccount2();

        account1.name = "asep";

        account1.balance = 2000.0;

        account1.interestRate = 0.03;

        SavingAccount2 account2 = new SavingAccount2();

        account2.name = "juju";

        account2.balance = 300.0;

        account2.interestRate = 0.01;

        // menapilkan object

        account1.displayCustomer();

        account2.displayCustomer();

    }

}