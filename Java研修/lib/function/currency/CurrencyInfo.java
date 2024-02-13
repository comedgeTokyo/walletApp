package lib.function.currency;

/**
 * 通貨情報クラス
 */
public class CurrencyInfo {

    public CurrencyInfo(int amount, int howMany, int portrait, int design) {
        // 金額
        this.amount = amount;

        // 枚数
        this.howMany = howMany;
        
        // 肖像
        this.portrait = portrait;

        // 図柄
        this.design = design;
    }
    
    /**
     * 金額
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

    /**
     * 図柄
     */
    private int design;
    
    
    /**
     * 金額getter
     */
    public int getAmount() {
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