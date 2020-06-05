//import BankAccount.Account;
//import BankAccount.Action;
//import BankAccount.BankAccountCommand;
import org.junit.Assert;
import org.junit.Test;


//public class Evaluate
//{
//    @Test
//    public void test()
//    {
//        Account a = new Account();
//
//        BankAccountCommand command = new BankAccountCommand(Action.DEPOSIT, 100);
//        a.process(command);
//
//        Assert.assertEquals(100, a.balance);
//        Assert.assertTrue(command.success);
//
//        command = new BankAccountCommand(Action.WITHDRAW, 50);
//        a.process(command);
//
//        Assert.assertEquals(50, a.balance);
//        Assert.assertTrue(command.success);
//
//        command = new BankAccountCommand(Action.WITHDRAW, 150);
//        a.process(command);
//
//        Assert.assertEquals(50, a.balance);
//        Assert.assertFalse(command.success);
//        }
//    }