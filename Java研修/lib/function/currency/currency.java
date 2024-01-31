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
     * コンストラクタ
     */
    public Currency(int currencyType, int howMany) {
        // 金額
        this.currencyType = currencyType;
        // 枚数
        this.howMany = howMany;
    }
}