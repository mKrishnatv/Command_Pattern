import bankAccount.Action;
import bankAccount.BankAccount;
import bankAccount.BankAccountCommand;
import org.junit.Test;

import java.util.List;

public class BankAccountTest {

    @Test
    public void accountTest(){
        BankAccount ba = new BankAccount();
        System.out.println(ba);

        //List<BankAccountCommand> commands = List.of()
        BankAccountCommand depositCommand = new BankAccountCommand(ba, Action.DEPOSIT, 100);
        BankAccountCommand withdrawCommand = new BankAccountCommand(ba, Action.WITHDRAW, 100);
        depositCommand.call();
        //System.out.println("Balance after Deposit: "+ba);
        withdrawCommand.call();
        //System.out.println("Balance after Withdraw: "+ba);

    }
}
