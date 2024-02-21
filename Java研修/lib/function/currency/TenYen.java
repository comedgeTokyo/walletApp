package lib.function.currency;

import static lib.constants.AppConstants.*;
import lib.constants.Amount;

/**
 * 10円クラス
 */
public class TenYen extends Currency {

    public TenYen(int howMany, int portrait, int design) {
        super(howMany, portrait, design);
        this.amount = Amount.TenYen;
        this.currencyType = CURRENCY_TYPE_COIN;
    }

}
