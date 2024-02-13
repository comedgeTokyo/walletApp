package lib.function.currency;

import static lib.constants.AppConstants.*;

/**
 * 1000円クラス
 */
public class OneThousandYen extends Currency {

    public OneThousandYen(int howMany, int portrait, int design) {

        super(howMany, portrait, design);

        // 通貨金額
        this.amount = CURRENCY_ONE_THOUSAND_YEN;

        // 通貨種類
        this.currencyType = CURRENCY_TYPE_BILL;
    }
}
