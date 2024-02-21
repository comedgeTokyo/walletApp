package lib.function.currency;

import static lib.constants.AppConstants.*;
import lib.constants.Amount;

/**
 * 50円クラス
 */
public class FiftyYen extends Currency {

    public FiftyYen(int howMany, int portrait, int design) {
        super(howMany, portrait, design);
        this.amount = Amount.FiftyYen;
        this.currencyType = CURRENCY_TYPE_COIN;
    }
}