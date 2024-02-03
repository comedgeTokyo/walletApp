package lib.function.wallet;

import java.util.*;
import static lib.constants.AppConstants.*;
import lib.function.currency.Currency;

/**
 * 変換処理クラス
 */
public class Conversion {

    // TODO:入金処理以外でも使うのであればCommonFuncにする
    /**
     * splitTextメソッド
     * 文字列を","で分割し、その文字列を" "で分割した文字列を整数値に変換しリストに詰める処理
     * 戻り値の例：[[1000,20],[5000,7],[10000,2]]
     * @param inputText {String}
     * @return 整数リストのリスト
     */
    public static List<List<Integer>> splitTextConvert(String inputText) {

        // 整数値のリストのリスト
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        
        // カンマ区切りされた文字列リスト
        String[] commaSplitList = inputText.split(",");
        
        for (String commaSplitText : commaSplitList) {
            
            // 空白スペース区切りされた文字列リスト
            String[] spaceSplitList = commaSplitText.split(" ");
            
            // 空白スペース区切りリストの長さ
            int spaceSplitListLen = spaceSplitList.length;

            // intのリスト 例[1000,90]
            List<Integer> intList = new ArrayList<Integer>();

            // リスト内の文字列を一つずつ数値へ変換する
            for (int i=0; i<spaceSplitListLen; i++) {
                intList.add(Integer.parseInt(spaceSplitList[i]));
            }

            // intリストの長さ取得
            int intListLen = intList.size();

            // リストの長さが"2"つまり種類と枚数のセットであれば追加する
            if (intListLen == 2) {
                resultList.add(intList);
            }
        }
        return resultList;
    }


    // ==============================================================================
    // 現在使用していないメソッド
    // getterでインスタンスのプロパティ(金額、肖像)を取得して判別する予定なので使わない

    /**
     * クラス名を返す処理
     * @param currency Currency型のクラス
     * @return クラス名を返す
     */
    public static String returnCurrencyName(Currency currency){
        
        // クラス名を取得
        String resultName = currency.getClass().getSimpleName();
        
        return resultName;
    }


    /**
     * クラス名から通貨金額を返す処理
     * @param currencyName Currency型のクラス名
     * @return 通貨の金額を返す
     */
    public static int returnCurrencyNumber(String currencyName){

        int resultInt = 0;

        switch (currencyName) {
            case "OneYen":
                resultInt = CURRENCY_ONE_YEN;
                break;

            case "TenYen":
                resultInt = CURRENCY_TEN_YEN;
                break;

            case "OneHundredYen":
                resultInt = CURRENCY_ONE_HUNDRED_YEN;
                break;

            case "OneThousandYen":
                resultInt = CURRENCY_ONE_THOUSAND_YEN;
                break;

            case "FiveThousandYen":
                resultInt = CURRENCY_FIVE_THOUSAND_YEN;
                break;

            case "TenThousandYen":
                resultInt = CURRENCY_TEN_THOUSAND_YEN;
                break;
        
            default:
                break;
        }
        return resultInt;
    }
}
