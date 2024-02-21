package lib.function.wallet;

import static lib.constants.AppConstants.*;
import java.util.*;
import lib.constants.Amount;
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

        // 返却用CurrencyInfo
        List<CurrencyInfo> currencyInfosList = new ArrayList<CurrencyInfo>();
        
        // 金額リスト
        List<Amount> amountList = Arrays.stream(AMOUNT_LIST).toList();
        
        for(Amount amount : amountList) {
            
            // 枚数リスト
            List<Integer> howManyList = new ArrayList<Integer>();

            // 枚数合計
            int howManyCount = 0;

            // 財布内に同じ金額があれば、枚数を取得する
            checkCurrencyList.stream()
            .filter(f -> amount == f.getAmount())
            .forEach(h -> howManyList.add(h.getHowMany())
            );

            // 枚数を合計
            for(int howMany : howManyList) {
                howManyCount = howManyCount + howMany;
            }

            // 枚数がある場合CurrencyInfoに情報を入れる
            if (howManyCount > 0) {
                currencyInfosList.add(new CurrencyInfo(amount, howManyCount, CURRENCY_PORTRAIT_NONE, CURRENCY_DESIGN_NONE));
            }
        }

        // 合計金額用
        int totalAmount = 0;

        // 金額、合計金額、枚数を表示させる
        for (CurrencyInfo currencyData : currencyInfosList) {
            
            // 金額名
            String amountName = currencyData.getAmount().getAmountName();

            // 金額
            int amount= currencyData.getAmount().getAmount();

            // 枚数
            int howMany = currencyData.getHowMany();

            totalAmount = totalAmount + amount*howMany;

            System.out.println(amountName  + "円　" + howMany + "枚");
        }

        // 合計はカンマ区切り
        System.out.println("合計　" + String.format("%,d",totalAmount) + "円");
    }
}