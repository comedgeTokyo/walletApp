package lib.function.wallet;

import java.util.*;
import static lib.constants.AppConstants.*;
import lib.function.currency.CurrencyAgm;
import lib.function.currency.Currency;

/**
 * 変換処理クラス
 */
public class Conversion {
    
    /**
     * splitTextメソッド
     * 文字列を","で分割し、その文字列を" "で分割した文字列を整数値に変換しリストに詰める処理
     * @param inputText 文字列
     * @return 金額と枚数がセットの整数リストのリスト
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

            //配列を一つずつ文字列から数値へ変換する
            for (int i=0; i<spaceSplitListLen; i++) {
                intList.add(Integer.parseInt(spaceSplitList[i]));
            }

            // intリストの長さ
            int intListLen = intList.size();

            // リストの長さが種類と枚数のセットであれば
            if (intListLen == 2) {
                resultList.add(intList);
            }
        }
        return resultList;
    }


    /**
     * 整数のリストをCurrencyAgmクラスに変換する処理
     * @param intList 金額と枚数がセットの整数リストのリスト
     * @return 通貨情報のリスト
     */
    public static List<CurrencyAgm> currencyAgmConvert(List<List<Integer>> intList) {

        List<CurrencyAgm> resuList = new ArrayList<CurrencyAgm>();
        
        for (List<Integer> commaSplitText : intList) {

            // 通貨の金額
            int amount = commaSplitText.get(0);

            // 枚数
            int howMany = commaSplitText.get(1);

            // 肖像
            int portrait = 0;

            switch (amount) {
                case CURRENCY_ONE_YEN:
                    resuList.add(new CurrencyAgm(amount, howMany, portrait));
                    break;

                case CURRENCY_TEN_YEN:
                    resuList.add(new CurrencyAgm(amount, howMany, portrait));
                    break;

                case CURRENCY_ONEHUNDRED_YEN:
                    resuList.add(new CurrencyAgm(amount, howMany, portrait));
                    break;

                case CURRENCY_ONETHOUSAND_YEN:

                    Scanner scanner = new Scanner(System.in);

                    System.out.println("千円の肖像を選択してください");
                    System.out.println("1. 野口英世 2. 北里柴三郎");

                    portrait = scanner.nextInt();

                    // TODO:1,2以外の場合は再度入力させたい
                    if (portrait == 1 || portrait == 2) {
                        resuList.add(new CurrencyAgm(amount, howMany, portrait));
                    }
                    break;

                case CURRENCY_FIVETHOUSAND_YEN:

                    Scanner scanner1 = new Scanner(System.in);

                    System.out.println("五千円の肖像を選択してください");
                    System.out.println("1. 樋口一葉 2. 津田梅子");

                    portrait = scanner1.nextInt();

                    // TODO:1,2以外の場合は再度入力させたい
                    if (portrait == 1 || portrait == 2) {
                        resuList.add(new CurrencyAgm(amount, howMany, portrait));
                    }
                    break;

                case CURRENCY_TENTHOUSAND_YEN:

                    Scanner scanner2 = new Scanner(System.in);

                    System.out.println("壱万円の肖像を選択してください");
                    System.out.println("1. 福沢諭吉 2. 渋沢栄一");

                    portrait = scanner2.nextInt();

                    // TODO:1,2以外の場合は再度入力させたい
                    if (portrait == 1 || portrait == 2) {
                        resuList.add(new CurrencyAgm(amount, howMany, portrait));
                    }
                    break;
            
                default:
                    System.out.println(amount + "円は存在しない通貨な為、入金できませんでした");
                    break;
            }

        }
        return resuList;
    }


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
                resultInt = CURRENCY_ONEHUNDRED_YEN;
                break;

            case "OneThousandYen":
                resultInt = CURRENCY_ONETHOUSAND_YEN;
                break;

            case "FiveThousandYen":
                resultInt = CURRENCY_FIVETHOUSAND_YEN;
                break;

            case "TenThousandYen":
                resultInt = CURRENCY_TENTHOUSAND_YEN;
                break;
        
            default:
                break;
        }
        return resultInt;
    }
}
