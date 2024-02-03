package lib.function.currency;

/**
 * 通貨情報クラス
 */
public class CurrencyInfo {
    
    private int amount;
    
    private int howMany;
    
    private int portrait;
    
    public CurrencyInfo(int amount, int howMany, int portrait) {

        this.amount = amount;

        this.howMany = howMany;
    
        this.portrait = portrait;
    }


    public int getAmount() {
        return this.amount;
    }


    public int gethowMany() {
        return this.howMany;
    }


    public int getportrait() {
        return this.portrait;
    }
}