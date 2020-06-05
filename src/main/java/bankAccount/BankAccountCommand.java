package bankAccount;

public class BankAccountCommand implements AccountCommand{
    private BankAccount account;
    private Action action;
    private int amount;

    public BankAccountCommand(BankAccount account, Action action, int amount){
        this.account = account;
        this.action = action;
        this.amount = amount;
    }

    @Override
    public void call() {
        switch (action)
        {
            case DEPOSIT:
                account.deposit(amount);
                break;
            case WITHDRAW:
                account.withdraw(amount);
                break;
        }
    }
}
