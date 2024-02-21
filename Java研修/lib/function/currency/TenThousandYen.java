package lib.function.currency;

import static lib.constants.AppConstants.*;
import lib.constants.Amount;

/**
 * 10000円クラス
 */
public class TenThousandYen extends Currency {

    public TenThousandYen(int howMany, int portrait, int design) {
        super(howMany, portrait, design);
        this.amount = Amount.TenThousandYen;
        this.currencyType = CURRENCY_TYPE_BILL;
    }
}
