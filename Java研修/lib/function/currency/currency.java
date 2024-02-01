package lib.function.currency;

/**
 * 通貨クラス
 */
public abstract class Currency {
    
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