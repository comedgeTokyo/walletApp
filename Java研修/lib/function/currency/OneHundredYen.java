package lib.function.currency;

import static lib.constants.AppConstants.*;

/**
 * 100円クラス
 */
public class OneHundredYen extends Currency {

    public OneHundredYen(int howMany, int portrait, int design) {

        super(howMany, portrait, design);

        // 通貨金額
        this.amount = CURRENCY_ONE_HUNDRED_YEN;

        // 通貨種類
        this.currencyType = CURRENCY_TYPE_COIN;
    }
}
