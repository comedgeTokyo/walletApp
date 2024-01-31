package lib.function.currency;

import java.util.List;

/**
 * 通貨情報クラス
 */
public class CurrencyAgm {
    
    /**
     * 通貨種類
     */
    private int currencyType;

    /**
     * 数量
     */
    private int howMany;

    /**
     * 肖像
     */
    private int portrait;

    // コンストラクタ
    public CurrencyAgm(int currencyType, int howMany, int portrait) {
        // 通貨種類
        this.currencyType = currencyType;

        // 数量
        this.howMany = howMany;

        // 肖像
        this.portrait = portrait;
    }

    /**
     * getter
     */
    public int getCurrencyType() {
        return this.currencyType;
    }

    /**
     * getter
     */
    public int gethowMany() {
        return this.howMany;
    }

    /**
     * getter
     */
    public int getportrait() {
        return this.portrait;
    }
}
