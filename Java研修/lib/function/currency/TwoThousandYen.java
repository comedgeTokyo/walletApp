package lib.function.currency;

import static lib.constants.AppConstants.*;

/**
 * 2000円クラス
 */
public class TwoThousandYen extends Currency {

    public TwoThousandYen(int howMany, int portrait, int design) {

        super(howMany, portrait, design);

        // 通貨金額
        this.amount = CURRENCY_TWO_THOUSAND_YEN;

        // 通貨種類
        this.currencyType = CURRENCY_TYPE_BILL;
    }
}
