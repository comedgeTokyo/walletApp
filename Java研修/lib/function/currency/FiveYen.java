package lib.function.currency;

import static lib.constants.AppConstants.*;

/**
 * 5円クラス
 */
public class FiveYen extends Currency {

    public FiveYen(int howMany, int portrait, int design) {

        super(howMany, portrait, design);

        // 通貨金額
        this.amount = CURRENCY_FIVE_YEN;

        // 通貨種類
        this.currencyType = CURRENCY_TYPE_COIN;
    }
}
