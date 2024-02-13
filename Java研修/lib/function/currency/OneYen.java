package lib.function.currency;

import static lib.constants.AppConstants.*;

/**
 * 1円クラス
 */
public class OneYen extends Currency {

    public OneYen(int howMany, int portrait, int design) {

        super(howMany, portrait, design);

        // 通貨金額
        this.amount = CURRENCY_ONE_YEN;

        // 通貨種類
        this.currencyType = CURRENCY_TYPE_COIN;
    }
}
