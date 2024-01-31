package lib.constants;

/**
 * 定数クラス
 */
public class AppConstants {

    /**
     * コンストラクタ
     */
    private AppConstants() {
    }

    /**
     * 入金
     */
    public static final int CMD_DEPOSIT = 1;
    
    /**
     * 出金
     */
    public static final int CMD_WITHDRAW = 2;

    /**
     * 残高確認
     */    
    public static final int CMD_CHECK_BALANCE = 3;
    
    /**
     * 通貨種類確認
     */
    public static final int CMD_CHECK_CURRENCYTYPE = 4;
    
    /**
     * 肖像確認
     */
    public static final int CMD_CHECK_PATTERN = 5;
    
    /**
     * 図柄確認
     */
    public static final int CMD_CHECK_PORTRAIT = 6;




    /**
     * 1円
     */
    public static final int CURRENCY_ONE_YEN = 1;

    /**
     * 10円
     */
    public static final int  CURRENCY_TEN_YEN = 10;

    /**
     * 100円
     */    
    public static final int CURRENCY_ONEHUNDRED_YEN = 100;

    /**
     * 1000円
     */    
    public static final int CURRENCY_ONETHOUSAND_YEN = 1000;

    /**
     * 5000円
     */    
    public static final int CURRENCY_FIVETHOUSAND_YEN = 5000;

    /**
     * 10000円
     */    
    public static final int CURRENCY_TENTHOUSAND_YEN = 10000;

}