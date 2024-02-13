package lib.function.wallet;

import static lib.function.wallet.PutMoney.*;
import java.util.*;
import lib.function.currency.Currency;
import lib.function.currency.CurrencyInfo;

/**
 * 残高確認用クラス
 */
public class CheckBalance {

    /**
     * 残高表示処理
     */
    public static void displyBalance(List<Currency> checkCurrencyList) {

        // CurrencyInfo用リスト
        List<CurrencyInfo> currencyInfosList = new ArrayList<CurrencyInfo>();
        
        // 金額取得用リスト
        List<Integer> amountList = new ArrayList<Integer>();
        
        // 枚数取得用リスト
        List<Integer> howManyList = new ArrayList<Integer>();

        // Map→int型リストのリスト　変換リスト
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        
        // 金額と枚数のMap
        Map<Integer, Integer> currencyDataMap = new HashMap<Integer, Integer>();
        
        // 現在のCurrencyListの金額と枚数をそれぞれ取得
        for (Currency currencyData : checkCurrencyList) {
            amountList.add(currencyData.getAmount());
            howManyList.add(currencyData.getHowMany());
        }
        
        // 金額の重複があれば枚数を加算してMapに詰める処理
        // TODO:Map以外の方法で実装
        for (int i = 0; i < checkCurrencyList.size(); i++) {
            // 金額
            int amount = amountList.get(i);

            // 枚数
            int howMany = howManyList.get(i);

            // Map内に既にKey(金額)があれば、同じKeyの値を加算
            if (currencyDataMap.keySet().contains(amount)) {
                int countHowMany = currencyDataMap.get(amount);
                currencyDataMap.put(amount, howMany + countHowMany);
            } else {
                currencyDataMap.put(amount, howMany);
            }
        }
        
        // Mapからリストに変換
        for (Map.Entry<Integer, Integer> entry : currencyDataMap.entrySet()) {
            // 金額、枚数を一時格納用
            List<Integer> currencyData = new ArrayList<Integer>();
            
            // Key(金額)
            currencyData.add(entry.getKey());

            // Value(枚数)
            currencyData.add(entry.getValue());

            // CurrencyInfoに変換する用のintのリストのリスト
            resultList.add(currencyData);

        }

        // CurrencyInfoに変換
        // TODO:checkの引数はマジックナンバーにしない
        currencyInfosList = currencyConvert(resultList,1);

        // リストをまわして表示
        for (CurrencyInfo currencyData : currencyInfosList) {

            int amount = currencyData.getAmount();
            int howMany = currencyData.getHowMany();

            System.out.println(amount  + "円　" + howMany + "枚");
        }

    }
    
}