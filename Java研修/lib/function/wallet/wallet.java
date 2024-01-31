package lib.function.wallet;

import java.util.*;
import lib.function.currency.Currency;
import static lib.constants.AppConstants.*;

/**
 * 財布処理クラス
 */
public class Wallet {
    
    /**
     * 通貨クラス配列
     */
    private List<Currency> currencyList;

    /**
     * コンストラクタ
     */
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
    public void setCurrencyList(int currencyType, int howMany) {
        this.currencyList.add(new Currency(currencyType, howMany));
    }

    /**
     * 判定＆入金処理
     * @param splitIntList 整数値リスト
     */
    public void payment(List<List<Integer>> splitIntList) {

        for (List<Integer> commaSplitText : splitIntList) {

                Integer currencyType = 0;
                Integer howMany = 0;
                boolean turnFlag = true;

            for (Integer intdisp : commaSplitText) {

                    if (turnFlag) {
                        currencyType = intdisp;
                        turnFlag = false;
                    } else {
                        howMany = intdisp;
                        turnFlag = true;
                    }
            }

            if (currencyType == CURRENCY_ONE_YEN || currencyType == CURRENCY_TEN_YEN || currencyType == CURRENCY_ONEHUNDRED_YEN || currencyType == CURRENCY_ONETHOUSAND_YEN || currencyType == CURRENCY_FIVETHOUSAND_YEN || currencyType == CURRENCY_TENTHOUSAND_YEN) {
                setCurrencyList(currencyType, howMany);
            } else {
                // 存在しない通貨の場合
                System.out.println(currencyType + "は存在しない通貨/紙幣です");
            }
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
