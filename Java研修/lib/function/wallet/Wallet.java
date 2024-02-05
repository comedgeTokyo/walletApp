package lib.function.wallet;

import java.util.*;
import static lib.constants.AppConstants.*;
import static lib.function.wallet.PutMoney.*;
import static lib.function.wallet.Conversion.*;

import lib.function.currency.CurrencyInfo;
import lib.function.currency.FiftyYen;
import lib.function.currency.FiveHundredYen;
import lib.function.currency.Currency;
import lib.function.currency.FiveThousandYen;
import lib.function.currency.FiveYen;
import lib.function.currency.OneHundredYen;
import lib.function.currency.OneThousandYen;
import lib.function.currency.OneYen;
import lib.function.currency.TenThousandYen;
import lib.function.currency.TenYen;
import lib.function.currency.TwoThousandYen;

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
     */
    public void putMoney(String inputText) {
        // 整数型のリストに変換
        List<List<Integer>> splitIntlist = splitTextConvert(inputText);

        // 通貨情報用クラスに変換
        List<CurrencyInfo> currencyInfoList = currencyConvert(splitIntlist);

        // 入金処理
        for (CurrencyInfo currentCurrencyInfo : currencyInfoList) {

            // 通貨の金額を取得
            int amount = currentCurrencyInfo.getAmount();

            // 枚数を取得
            int howMany = currentCurrencyInfo.gethowMany();

            // 肖像を取得
            int portrait = currentCurrencyInfo.getportrait();

            // 通貨の金額によって分岐しインスタンス生成する
            switch (amount) {
                case CURRENCY_ONE_YEN:
                    setCurrencyList(new OneYen(howMany, portrait));
                    break;

                case CURRENCY_FIVE_YEN:
                    setCurrencyList(new FiveYen(howMany, portrait));
                    break;

                case CURRENCY_TEN_YEN:
                    setCurrencyList(new TenYen(howMany, portrait));
                    break;

                case CURRENCY_FIFTY_YEN:
                    setCurrencyList(new FiftyYen(howMany, portrait));
                    break;

                case CURRENCY_ONE_HUNDRED_YEN:
                    setCurrencyList(new OneHundredYen(howMany, portrait));
                    break;

                case CURRENCY_FIVE_HUNDRED_YEN:
                    setCurrencyList(new FiveHundredYen(howMany, portrait));
                    break;

                case CURRENCY_ONE_THOUSAND_YEN:
                    setCurrencyList(new OneThousandYen(howMany, portrait));
                    break;

                case CURRENCY_TWO_THOUSAND_YEN:
                    setCurrencyList(new TwoThousandYen(howMany, portrait));
                    break;

                case CURRENCY_FIVE_THOUSAND_YEN:
                    setCurrencyList(new FiveThousandYen(howMany, portrait));
                    break;

                case CURRENCY_TEN_THOUSAND_YEN:
                    setCurrencyList(new TenThousandYen(howMany, portrait));
                    break;
            
                default:
                    break;
            }
        }
    }





    
    /**
     * クラス内情報確認処理(確認用)
     */
    public void checkBalance() {

        // 現在の通貨リストを取得
        List<Currency> checkCurrencyList = getCurrencyList();

        for (Currency currencydata : checkCurrencyList) {

            // 通貨の金額を取得
            Integer amount = currencydata.getAmount();

            // 通貨種類を取得(硬貨or紙幣)
            Integer currencyType = currencydata.getCurrencyType();

            // 枚数を取得
            Integer howMany = currencydata.gethowMany();

            // 肖像を取得
            Integer portrait = currencydata.getportrait();
            
            // 図柄を取得
            Integer design = currencydata.getdesign();

            // 確認用
            System.out.println("amount : " + amount  + ", currencyType : " + currencyType + ", howMany : " + howMany + ", portrait : " + portrait + ", design : " + design);
        }
    }
}
