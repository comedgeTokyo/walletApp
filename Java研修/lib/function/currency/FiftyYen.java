package lib.function.currency;

import static lib.constants.AppConstants.*;

/**
 * 50円クラス
 */
public class FiftyYen extends Currency {

    public FiftyYen(int howMany, int portrait, int design) {

        super(howMany, portrait, design);

        // 通貨金額
        this.amount = CURRENCY_FIFTY_YEN;

        // 通貨種類
        this.currencyType = CURRENCY_TYPE_COIN;
    }
}