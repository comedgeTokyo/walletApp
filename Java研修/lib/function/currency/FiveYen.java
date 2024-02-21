package lib.function.currency;

import static lib.constants.AppConstants.*;
import lib.constants.Amount;

/**
 * 5円クラス
 */
public class FiveYen extends Currency {

    public FiveYen(int howMany, int portrait, int design) {
        super(howMany, portrait, design);
        this.amount = Amount.FiveYen;
        this.currencyType = CURRENCY_TYPE_COIN;
    }
}
