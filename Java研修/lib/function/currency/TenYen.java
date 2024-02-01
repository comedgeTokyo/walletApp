package lib.function.currency;

/**
 * 10円クラス
 */
public class TenYen extends Currency {

    // コンストラクタ
    public TenYen(int currencyType, int howMany, int portrait) {

        // 通貨種類
        this.currencyType = currencyType;

        // 枚数
        this.howMany = howMany;

        // 肖像
        this.portrait = portrait;

        // 図柄
        this.design = portrait;
    }

    public int getCurrencyType() {
        return this.currencyType;
    }

    public int gethowMany() {
        return this.howMany;
    }

    public int getportrait() {
        return this.portrait;
    }

    public int getdesign() {
        return this.design;
    }
}
