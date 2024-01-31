package lib.function.currency;

/**
 * 通貨クラス
 */
public class Currency {
    /**
     * 通貨種類
     */
    protected int currencyType;

    /**
     * 数量
     */
    protected int howMany;

    /**
     * 肖像
     */
    protected int portrait;

    /**
     * 図柄
     */
    protected int design;

    // コンストラクタ
    public Currency(int currencyType, int howMany, int portrait) {
        // 通貨種類
        this.currencyType = currencyType;

        // 数量
        this.howMany = howMany;

        // 肖像
        this.portrait = portrait;
    }

}