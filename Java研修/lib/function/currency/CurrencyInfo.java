package lib.function.currency;

import lib.constants.Amount;

/**
 * 通貨情報クラス
 */
public class CurrencyInfo {

    public CurrencyInfo(Amount amount, int howMany, int portrait, int design) {
        this.amount = amount;
        this.howMany = howMany;
        this.portrait = portrait;
        this.design = design;
    }
    

    /** 金額 */
    private Amount amount;

    /** 枚数 */
    private int howMany;

    /** 肖像 */
    private int portrait;

    /** 図柄 */
    private int design;
    
    
    /**
     * 金額getter
     */
    public Amount getAmount() {
        return this.amount;
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
}