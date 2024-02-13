package lib.function.currency;

import static lib.constants.AppConstants.*;

/**
 * 5000円クラス
 */
public class FiveThousandYen extends Currency {

    public FiveThousandYen(int howMany, int portrait, int design) {

        super(howMany, portrait, design);

        // 通貨金額
        this.amount = CURRENCY_FIVE_THOUSAND_YEN;

        // 通貨種類
        this.currencyType = CURRENCY_TYPE_BILL;
    }
}
