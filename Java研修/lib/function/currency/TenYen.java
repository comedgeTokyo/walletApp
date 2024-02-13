package lib.function.currency;

import static lib.constants.AppConstants.*;

/**
 * 10円クラス
 */
public class TenYen extends Currency {

    public TenYen(int howMany, int portrait, int design) {

        super(howMany, portrait, design);

        // 通貨金額
        this.amount = CURRENCY_TEN_YEN;

        // 通貨種類
        this.currencyType = CURRENCY_TYPE_COIN;
    }

}
