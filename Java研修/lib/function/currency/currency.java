package lib.function.currency;

/**
 * 通貨クラス
 */
public class Currency {

    private int currencyType;

    private int howMany;

    /**
     * コンストラクタ
     * @param currencyType 通貨種類
     * @param howMany 数量
     */
    public Currency(int currencyType, int howMany) {
        // 金額
        this.currencyType = currencyType;
        // 枚数
        this.howMany =howMany;
    }


}