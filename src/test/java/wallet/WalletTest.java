package wallet;

import com.edu.model.Wallet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WalletTest {

    @Test
    public void addMoney() {
        Wallet w = new Wallet();
        w.addMoney("RUB", 12.8);
        w.addMoney("RUB", 12.8);

        Assertions.assertEquals(w.removeMoney("RUB", 12.8), arr);
    }
}
