package lib.function.wallet;

import java.util.*;
import lib.function.currency.Currency;
import lib.function.currency.CurrencyAgm;
import lib.function.currency.OneHundredYen;
import lib.function.currency.OneThousandYen;
import lib.function.currency.OneYen;
import lib.function.currency.TenThousandYen;
import lib.function.currency.TenYen;

import static lib.constants.AppConstants.*;

/**
 * 財布処理クラス
 */
public class Wallet {
    
    /**
     * 通貨クラス配列
     */
    private List<Currency> currencyList;

    // コンストラクタ
    public Wallet() {
        this.currencyList = new ArrayList<Currency>();
    }

    /**
     * Currencyリストgetter
     */
    public List<Currency> getCurrencyList() {
        return this.currencyList;
    }
    
    /**
     * Currencyリストsetter
     * @param currencyType 通貨種類
     * @param howMany 数量
     */
    public void setCurrencyList(int currencyType, int howMany, int portrait) {

        List<Currency> now = getCurrencyList();

        switch (currencyType) {
            case CURRENCY_ONE_YEN:
                if (now.contains(Currency)) {

                }
                this.currencyList.add(new OneYen(0, howMany, portrait));
                break;

            case CURRENCY_TEN_YEN:
                this.currencyList.add(new TenYen(0, howMany, portrait));
                break;

            case CURRENCY_ONEHUNDRED_YEN:
                this.currencyList.add(new OneHundredYen(0, howMany, portrait));
                break;

            case CURRENCY_ONETHOUSAND_YEN:
                this.currencyList.add(new OneThousandYen(1, howMany, portrait));
                break;

            case CURRENCY_FIVETHOUSAND_YEN:
                this.currencyList.add(new FiveThousandYen(1, howMany, portrait));
                break;

            case CURRENCY_TENTHOUSAND_YEN:
                this.currencyList.add(new TenThousandYen(1, howMany, portrait));
                break;
        
            default:
                break;
        }
    }

    /**
     * 判定＆入金処理
     * @param splitIntList 整数値リスト
     */
    public void payment(List<CurrencyAgm> splitIntList) {

        for (CurrencyAgm commaSplitText : splitIntList) {
            int currencyType = commaSplitText.getCurrencyType();
            int howMany = commaSplitText.gethowMany();
            int portrait = commaSplitText.getportrait();

            setCurrencyList(currencyType, howMany, portrait);
        }
    }

    /**
     * 残高確認処理
     */
    public void checkBalance() {
        List<Currency> checkCurrencyList = getCurrencyList();
        // TODO:残高確認処理
    }
}
