package lib.function.wallet;

import java.util.*;
import static lib.constants.AppConstants.*;
import static lib.function.wallet.Conversion.*;
import lib.function.currency.CurrencyAgm;
import lib.function.currency.Currency;
import lib.function.currency.FiveThousandYen;
import lib.function.currency.OneHundredYen;
import lib.function.currency.OneThousandYen;
import lib.function.currency.OneYen;
import lib.function.currency.TenThousandYen;
import lib.function.currency.TenYen;

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
     * @param currencyType 通貨クラス
     */
    public void setCurrencyList(Currency currency) {
        this.currencyList.add(currency);
    }


    /**
     * 入金処理
     * @param splitIntList 通貨情報クラスリスト
     */
    public void payment(List<CurrencyAgm> splitIntList) {

        for (CurrencyAgm commaSplitText : splitIntList) {

            // 通貨の種類を取得(10円,1000円等)
            int amount = commaSplitText.getCurrencyType();

            // 枚数を取得
            int howMany = commaSplitText.gethowMany();

            // 図柄を取得
            int portrait = commaSplitText.getportrait();

            // 通貨の情報によって分岐しインスタンス生成する
            setNewCurrency(amount, howMany, portrait);
        }
    }

    /**
     * 通貨の金額によって分岐しインスタンス生成する処理
     * @param amount 通貨の金額
     * @param howMany 枚数
     * @param portrait 肖像
     */
    public void setNewCurrency(int amount, int howMany, int portrait) {

            // TODO:currencyTypeを数値で渡さない方法を考える
            switch (amount) {
                case CURRENCY_ONE_YEN:
                    setCurrencyList(new OneYen(0, howMany, portrait));
                    break;

                case CURRENCY_TEN_YEN:
                    setCurrencyList(new TenYen(0, howMany, portrait));
                    break;

                case CURRENCY_ONEHUNDRED_YEN:
                    setCurrencyList(new OneHundredYen(0, howMany, portrait));
                    break;

                case CURRENCY_ONETHOUSAND_YEN:
                    setCurrencyList(new OneThousandYen(1, howMany, portrait));
                    break;

                case CURRENCY_FIVETHOUSAND_YEN:
                    setCurrencyList(new FiveThousandYen(1, howMany, portrait));
                    break;

                case CURRENCY_TENTHOUSAND_YEN:
                    setCurrencyList(new TenThousandYen(1, howMany, portrait));
                    break;
            
                default:
                    break;
            }
    }

    
    /**
     * クラス内情報確認処理(確認用)
     */
    public void checkBalance() {

        // 現在の通貨リストを取得
        List<Currency> checkCurrencyList = getCurrencyList();

        for (Currency currencydata : checkCurrencyList) {
            
            // クラス名を取得
            String className = returnCurrencyName(currencydata);
            
            // クラス名から通貨の金額を取得
            int amount = returnCurrencyNumber(className);
            
            // 通貨種類を取得(硬貨or紙幣)
            Integer currencyType = currencydata.getCurrencyType();

            // 枚数を取得
            Integer howMany = currencydata.gethowMany();

            // 肖像を取得
            Integer portrait = currencydata.getportrait();
            
            // 図柄を取得
            Integer design = currencydata.getdesign();

            // 確認用
            System.out.println(amount + "円の情報 " + "currencyType : " + currencyType + ", howMany : " + howMany + ", portrait : " + portrait + ", design : " + design);
        }
    }
}
