package lib.function.currency;

import static lib.constants.AppConstants.*;
import lib.constants.Amount;

/**
 * 1円クラス
 */
public class OneYen extends Currency {

    public OneYen(int howMany, int portrait, int design) {
        super(howMany, portrait, design);
        this.amount = Amount.OneYen;
        this.currencyType = CURRENCY_TYPE_COIN;
    }
}
