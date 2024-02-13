package lib.commons;

import java.util.ArrayList;
import java.util.List;
import lib.function.currency.Currency;

/**
 * 共通処理クラス
 */
public class CommonFunc {

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

    /**
     * クラス名を返す処理
     * @deprecated 使わない処理
     * @param currency Currency型のクラス
     * @return クラス名を返す
     */
    public static String returnCurrencyName(Currency currency){
        
        // クラス名を取得
        String resultName = currency.getClass().getSimpleName();
        
        return resultName;
    }

}
