package lib.function.currency;

/**
 * 通貨情報保持クラス
 */
public class CurrencyAgm {
    
    /**
     * 金額の種類
     */
    private int amount;

    /**
     * 枚数
     */
    private int howMany;

    /**
     * 肖像
     */
    private int portrait;

    // コンストラクタ
    public CurrencyAgm(int amount, int howMany, int portrait) {
        // 金額の種類
        this.amount = amount;

        // 枚数
        this.howMany = howMany;

        // 肖像
        this.portrait = portrait;
    }

    /**
     * 金額の種類getter
     */
    public int getCurrencyType() {
        return this.amount;
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
}
