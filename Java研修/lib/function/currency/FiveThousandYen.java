package lib.function.currency;

import static lib.constants.AppConstants.*;
import lib.constants.Amount;

/**
 * 5000円クラス
 */
public class FiveThousandYen extends Currency {

    public FiveThousandYen(int howMany, int portrait, int design) {
        super(howMany, portrait, design);
        this.amount = Amount.FiveThousandYen;
        this.currencyType = CURRENCY_TYPE_BILL;
    }
}
