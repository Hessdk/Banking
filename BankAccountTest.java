import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class BankAccountTest {
    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount("123456789", 1000.0);
    }

    @Test
    public void testDeposit() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositNegativeAmount() {
        account.deposit(-200.0);
    }
}