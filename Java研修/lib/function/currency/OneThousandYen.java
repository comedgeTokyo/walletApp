package lib.function.currency;

import static lib.constants.AppConstants.*;
import lib.constants.Amount;

/**
 * 1000円クラス
 */
public class OneThousandYen extends Currency {

    public OneThousandYen(int howMany, int portrait, int design) {
        super(howMany, portrait, design);
        this.amount = Amount.OneThousandYen;
        this.currencyType = CURRENCY_TYPE_BILL;
    }
}
