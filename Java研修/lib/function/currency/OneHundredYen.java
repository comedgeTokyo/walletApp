package lib.function.currency;

import static lib.constants.AppConstants.*;
import lib.constants.Amount;

/**
 * 100円クラス
 */
public class OneHundredYen extends Currency {

    public OneHundredYen(int howMany, int portrait, int design) {
        super(howMany, portrait, design);
        this.amount = Amount.OneHundredYen;
        this.currencyType = CURRENCY_TYPE_COIN;
    }
}
