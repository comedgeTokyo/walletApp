package lib.function.currency;

/**
 * 通貨クラス
 */
public abstract class Currency {

    public Currency(int howMany, int portrait, int design) {
        // 枚数
        this.howMany = howMany;

        // 肖像
        this.portrait = portrait;

        // 図柄
        this.design = design;
    }


    /**
     * 通貨金額
     */
    protected int amount;

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


    /**
     * 金額getter
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
    public int getHowMany() {
        return this.howMany;
    }

    /**
     * 肖像getter
     */
    public int getPortrait() {
        return this.portrait;
    }
    
    /**
     * 図柄getter
     */
    public int getDesign() {
        return this.design;
    }

    /**
     * 金額setter
     */
    public void setHowMany(int howMany) {
        this.howMany = this.howMany + howMany;
    }
}