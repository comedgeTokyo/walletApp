package lib.function.currency;

import static lib.constants.AppConstants.*;

/**
 * 500円クラス
 */
public class FiveHundredYen extends Currency {

    public FiveHundredYen(int howMany, int portrait, int design) {

        super(howMany, portrait, design);

        // 通貨金額
        this.amount = CURRENCY_FIVE_HUNDRED_YEN;

        // 通貨種類
        this.currencyType = CURRENCY_TYPE_COIN;
    }
}
