package lib.function.currency;

import lib.constants.Amount;

/**
 * 通貨クラス
 */
public abstract class Currency {

    public Currency(int howMany, int portrait, int design) {
        this.howMany = howMany;
        this.portrait = portrait;
        this.design = design;
    }


    /** 通貨金額 */
    protected Amount amount;

    /** 通貨種類 */
    protected int currencyType;

    /** 数量 */
    protected int howMany;

    /** 肖像 */
    protected int portrait;

    /** 図柄 */
    protected int design;


    /**
     * 金額getter
     */
    public Amount getAmount() {
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
     * 枚数setter
     */
    public void setHowMany(int howMany) {
        this.howMany = this.howMany + howMany;
    }
}