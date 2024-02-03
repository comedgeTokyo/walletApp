package lib.function.currency;

import static lib.constants.AppConstants.*;

/**
 * 100円クラス
 */
public class OneHundredYen extends Currency {

    // コンストラクタ
    public OneHundredYen(int howMany, int portrait) {

        // 通貨金額
        this.amount = CURRENCY_ONE_HUNDRED_YEN;

        // 通貨種類
        this.currencyType = CURRENCY_TYPE_COIN;

        // 枚数
        this.howMany = howMany;

        // 肖像
        this.portrait = portrait;

        // 図柄
        this.design = 0;
    }

    /**
     * 通貨金額getter
     */
    public int getAmount() {
        return this.amount;
    }

    /**
     * 通貨種類getter
     */
    public int getCurrencyType() {
        return this.currencyType;
    }

    /**
     * 枚数getter
     */
    public int gethowMany() {
        return this.howMany;
    }

    /**
     * 肖像getter
     */
    public int getportrait() {
        return this.portrait;
    }

    /**
     * 図柄getter
     */
    public int getdesign() {
        return this.design;
    }
}
