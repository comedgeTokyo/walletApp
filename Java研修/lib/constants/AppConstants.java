package lib.constants;

/**
 * 定数クラス
 */
public class AppConstants {

    private AppConstants() {
    }

    // ========================================================================
    // コマンド
    // ========================================================================

    /** 財布に入金 */
    public static final int CMD_PUT_MONEY = 1;
    
    /** 財布から出金 */
    public static final int CMD_TAKEOUT_MONEY = 2;

    /** 財布の残高確認 */
    public static final int CMD_CHECK_WALLETBALANCE = 3;
    
    /** 通貨種類確認 */
    public static final int CMD_CHECK_CURRENCYTYPE = 4;
    
    /** 肖像確認 */
    public static final int CMD_CHECK_PORTRAIT = 5;
    
    /** 図柄確認 */
    public static final int CMD_CHECK_DESIGN = 6;


    // ========================================================================
    // Yes,No
    // ========================================================================

    /** Yes */
    public static final int CMD_YES = 1;

    /** No */
    public static final int CMD_NO = 2;


    // ========================================================================
    // 通貨金額
    // ========================================================================

    /** 1円 */
    public static final int CURRENCY_ONE_YEN = 1;

    /** 5円 */
    public static final int CURRENCY_FIVE_YEN = 5;

    /** 10円 */
    public static final int  CURRENCY_TEN_YEN = 10;

    /** 50円 */
    public static final int  CURRENCY_FIFTY_YEN = 50;

    /** 100円 */
    public static final int CURRENCY_ONE_HUNDRED_YEN = 100;

    /** 500円 */ 
    public static final int CURRENCY_FIVE_HUNDRED_YEN = 500;

    /** 1000円 */
    public static final int CURRENCY_ONE_THOUSAND_YEN = 1000;

    /** 2000円 */
    public static final int CURRENCY_TWO_THOUSAND_YEN = 2000;

    /** 5000円 */  
    public static final int CURRENCY_FIVE_THOUSAND_YEN = 5000;

    /** 10000円 */  
    public static final int CURRENCY_TEN_THOUSAND_YEN = 10000;

    /** 通貨金額List(int型) */
    public static final int[] AMOUNT_INT_LIST = {CURRENCY_TEN_THOUSAND_YEN, CURRENCY_FIVE_THOUSAND_YEN, CURRENCY_TWO_THOUSAND_YEN, CURRENCY_ONE_THOUSAND_YEN, 
        CURRENCY_FIVE_HUNDRED_YEN, CURRENCY_ONE_HUNDRED_YEN, CURRENCY_FIFTY_YEN, CURRENCY_TEN_YEN, CURRENCY_FIVE_YEN, CURRENCY_ONE_YEN};

    /** 通貨金額List(Amount型) */
    public static final Amount[] AMOUNT_LIST = {Amount.OneYen, Amount.FiveYen, Amount.TenYen, Amount.FiftyYen, Amount.OneHundredYen, Amount.FiveHundredYen, Amount.OneThousandYen,
        Amount.FiveThousandYen, Amount.TenThousandYen};

    // ========================================================================
    // 通貨名
    // ========================================================================

    /** １円 */   
    public static final String CURRENCY_NAME_ICHIEN = "１";

    /** ５円 */
    public static final String CURRENCY_NAME_GOEN = "５";

    /** １０円 */
    public static final String CURRENCY_NAME_JUUEN = "１０";

    /** ５０円 */ 
    public static final String CURRENCY_NAME_GOJUUEN = "５０";

    /** １００円 */
    public static final String CURRENCY_NAME_HYAKUEN = "１００";

    /** ５００円 */
    public static final String CURRENCY_NAME_GOHYAKUEN = "５００";

    /** 千円 */ 
    public static final String CURRENCY_NAME_SENEN = "千";

    /** 二千円 */
    public static final String CURRENCY_NAME_NISENEN = "二千";

    /** 五千円 */
    public static final String CURRENCY_NAME_GOSENEN = "五千";

    /** 壱万円 */
    public static final String CURRENCY_NAME_ICHIMANEN = "壱万";
        
    // ========================================================================
    // 通貨種類
    // ========================================================================

    /** 硬貨 */
    public static final int CURRENCY_TYPE_COIN = 0;

    /** 紙幣 */
    public static final int CURRENCY_TYPE_BILL = 1;


    // ========================================================================
    // 肖像
    // ========================================================================

    /** 肖像無し */
    public static final int CURRENCY_PORTRAIT_NONE = 0;
    

    // ========================================================================
    // 図柄
    // ========================================================================
 
    /** 図柄無し */ 
    public static final int CURRENCY_DESIGN_NONE = 0;

    /** 図柄(初期値) */   
    public static final int CURRENCY_DESIGN_DEFAULT = 1;

}