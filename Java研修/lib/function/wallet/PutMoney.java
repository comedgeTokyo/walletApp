package lib.function.wallet;

import static lib.constants.AppConstants.*;
import lib.function.currency.CurrencyInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 入金処理クラス
 */
public class PutMoney {

    /**
     * 整数のリストをCurrencyInfoクラスに変換する処理
     * @param intList 金額と枚数がセットの整数リストのリスト
     * @return 通貨情報のリスト
     */
    public static List<CurrencyInfo> currencyAgmConvert(List<List<Integer>> intListList) {

        List<CurrencyInfo> resultList = new ArrayList<CurrencyInfo>();
        
        for (List<Integer> intList : intListList) {

            // 通貨の金額
            int amount = intList.get(0);

            // 枚数
            int howMany = intList.get(1);

            // 肖像
            int portrait = -1;

            // 枚数が0以下であればリストに追加しない
            if (howMany > 0) {
                switch (amount) {
                    case CURRENCY_ONE_YEN:
                        resultList.add(new CurrencyInfo(amount, howMany, portrait));
                        break;
    
                    case CURRENCY_FIVE_YEN:
                        resultList.add(new CurrencyInfo(amount, howMany, portrait));
                        break;
    
                    case CURRENCY_TEN_YEN:
                        resultList.add(new CurrencyInfo(amount, howMany, portrait));
                        break;
    
                    case CURRENCY_FIFTY_YEN:
                        resultList.add(new CurrencyInfo(amount, howMany, portrait));
                        break;
    
                    case CURRENCY_ONE_HUNDRED_YEN:
                        resultList.add(new CurrencyInfo(amount, howMany, portrait));
                        break;
    
                    case CURRENCY_FIVE_HUNDRED_YEN:
                        resultList.add(new CurrencyInfo(amount, howMany, portrait));
                        break;
    
                    case CURRENCY_ONE_THOUSAND_YEN:
    
                        Scanner scanner1000 = new Scanner(System.in);
    
                        System.out.println("千円の肖像を選択してください");
                        System.out.println("1. 野口英世 2. 北里柴三郎");
    
                        portrait = scanner1000.nextInt();
    
                        // TODO:1,2以外の場合は再度入力させたい
                        if (portrait == 1 || portrait == 2) {
                            resultList.add(new CurrencyInfo(amount, howMany, portrait));
                        }
                        break;
    
                    case CURRENCY_TWO_THOUSAND_YEN:
                        resultList.add(new CurrencyInfo(amount, howMany, portrait));
                        break;
    
                    case CURRENCY_FIVE_THOUSAND_YEN:
    
                        Scanner scanner5000 = new Scanner(System.in);
    
                        System.out.println("五千円の肖像を選択してください");
                        System.out.println("1. 樋口一葉 2. 津田梅子");
    
                        portrait = scanner5000.nextInt();
    
                        // TODO:1,2以外の場合は再度入力させたい
                        if (portrait == 1 || portrait == 2) {
                            resultList.add(new CurrencyInfo(amount, howMany, portrait));
                        }
                        break;
    
                    case CURRENCY_TEN_THOUSAND_YEN:
    
                        Scanner scanner10000 = new Scanner(System.in);
    
                        System.out.println("壱万円の肖像を選択してください");
                        System.out.println("1. 福沢諭吉 2. 渋沢栄一");
    
                        portrait = scanner10000.nextInt();
    
                        // TODO:1,2以外の場合は再度入力させたい
                        if (portrait == 1 || portrait == 2) {
                            resultList.add(new CurrencyInfo(amount, howMany, portrait));
                        }
                        break;
                
                    default:
                        System.out.println(amount + "円は存在しない通貨な為、入金できません");
                        break;
                }
            } else {
                System.out.println(amount + " " + howMany + "の入力では入金できません");
            }
        }
        return resultList;
    }
}
