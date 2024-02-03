package lib.constants;

/**
 * 定数クラス
 */
public class AppConstants {

    // コンストラクタ
    private AppConstants() {
    }

    // ========================================================================
    // コマンド定数

    /**
     * 財布に入金
     */
    public static final int CMD_PUT_MONEY = 1;
    
    /**
     * 財布から出金
     */
    public static final int CMD_TAKEOUT_MONEY = 2;

    /**
     * 財布の残高確認
     */    
    public static final int CMD_CHECK_WALLETBALANCE = 3;
    
    /**
     * 通貨種類確認
     */
    public static final int CMD_CHECK_CURRENCYTYPE = 4;
    
    /**
     * 肖像確認
     */
    public static final int CMD_CHECK_PORTRAIT = 5;
    
    /**
     * 図柄確認
     */
    public static final int CMD_CHECK_DESIGN = 6;

    // ========================================================================
    // Yes,No定数

    /**
     * Yes
     */
    public static final int CMD_YES = 1;

    /**
     * No
     */
    public static final int CMD_NO = 2;

    // ========================================================================
    // 通貨金額定数

    /**
     * 1円
     */
    public static final int CURRENCY_ONE_YEN = 1;

    /**
     * 5円
     */
    public static final int CURRENCY_FIVE_YEN = 5;

    /**
     * 10円
     */
    public static final int  CURRENCY_TEN_YEN = 10;

    /**
     * 50円
     */
    public static final int  CURRENCY_FIFTY_YEN = 50;

    /**
     * 100円
     */    
    public static final int CURRENCY_ONE_HUNDRED_YEN = 100;

    /**
     * 500円
     */    
    public static final int CURRENCY_FIVE_HUNDRED_YEN = 500;

    /**
     * 1000円
     */    
    public static final int CURRENCY_ONE_THOUSAND_YEN = 1000;

    /**
     * 2000円
     */    
    public static final int CURRENCY_TWO_THOUSAND_YEN = 2000;

    /**
     * 5000円
     */    
    public static final int CURRENCY_FIVE_THOUSAND_YEN = 5000;

    /**
     * 10000円
     */    
    public static final int CURRENCY_TEN_THOUSAND_YEN = 10000;

    // ========================================================================
    // 通貨種類定数

    /**
     * 硬貨
     */    
    public static final int CURRENCY_TYPE_COIN = 0;

    /**
     * 紙幣
     */    
    public static final int CURRENCY_TYPE_BILL = 1;

}