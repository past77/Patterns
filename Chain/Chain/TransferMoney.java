package Chain.Chain;

import java.util.Currency;

public interface TransferMoney {
    void SetNextChain(TransferMoney next);
    void transfer(Currency cur);
}
