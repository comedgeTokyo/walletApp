package lib.function.currency;

import static lib.constants.AppConstants.*;

/**
 * 10000円クラス
 */
public class TenThousandYen extends Currency {

    public TenThousandYen(int howMany, int portrait, int design) {

        super(howMany, portrait, design);

        // 通貨金額
        this.amount = CURRENCY_TEN_THOUSAND_YEN;

        // 通貨種類
        this.currencyType = CURRENCY_TYPE_BILL;
    }
}
