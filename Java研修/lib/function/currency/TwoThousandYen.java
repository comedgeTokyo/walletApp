package lib.function.currency;

import static lib.constants.AppConstants.*;
import lib.constants.Amount;

/**
 * 2000円クラス
 */
public class TwoThousandYen extends Currency {

    public TwoThousandYen(int howMany, int portrait, int design) {
        super(howMany, portrait, design);
        this.amount = Amount.TwoThousandYen;
        this.currencyType = CURRENCY_TYPE_BILL;
    }
}
