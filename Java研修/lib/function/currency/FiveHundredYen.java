package lib.function.currency;

import static lib.constants.AppConstants.*;
import lib.constants.Amount;

/**
 * 500円クラス
 */
public class FiveHundredYen extends Currency {

    public FiveHundredYen(int howMany, int portrait, int design) {
        super(howMany, portrait, design);
        this.amount = Amount.FiveHundredYen;
        this.currencyType = CURRENCY_TYPE_COIN;
    }
}
