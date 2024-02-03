package lib.function.currency;

import static lib.constants.AppConstants.*;

/**
 * 5000円クラス
 */
public class FiveThousandYen extends Currency {

    // コンストラクタ
    public FiveThousandYen(int howMany, int portrait) {

        // 通貨金額
        this.amount = CURRENCY_FIVE_THOUSAND_YEN;

        // 通貨種類
        this.currencyType = CURRENCY_TYPE_BILL;

        // 枚数
        this.howMany = howMany;

        // 肖像
        this.portrait = portrait;

        // 図柄
        this.design = portrait;
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
