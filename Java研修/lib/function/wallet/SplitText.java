package lib.function.wallet;

import static lib.constants.AppConstants.*;

import java.util.*;

import lib.function.currency.CurrencyAgm;

/**
 * 入力文字処理クラス
 */
public class SplitText {
    
    /**
     * splitTextメソッド
     * 文字列を","で分割し、その文字列を" "で分割した文字列を整数値に変換しリストに詰める処理
     * @param inputText 文字列
     * @return 整数値のリストのリスト
     */
    public static List<List<Integer>> splitText(String inputText) {

        // 整数値のリストのリスト
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        
        // カンマ区切りされた文字列リスト
        String[] commaSplitList = inputText.split(",");
        
        for (String commaSplitText : commaSplitList) {
            
            // 空白スペース区切りされた文字列リスト
            String[] spaceSplitList = commaSplitText.split(" ");
            
            // 空白スペース区切りリストの長さ
            int intStdInLen = spaceSplitList.length;

            // intのリスト [1000,90]
            List<Integer> intSplit = new ArrayList<Integer>();

            //配列を一つずつ文字列から数値へ変換する
            for (int i=0; i<intStdInLen; i++) {
                intSplit.add(Integer.parseInt(spaceSplitList[i]));
            }

            // intリストの長さ
            int intListLen = intSplit.size();

            // リストの長さが種類と枚数のセットであれば
            if (intListLen == 2) {
                resultList.add(intSplit);
            }
        }
        return resultList;
    }

    // CurrencyAgmクラスに変換する
    public static List<CurrencyAgm> currencyAgmfunc(List<List<Integer>> intList) {

        List<CurrencyAgm> resuList = new ArrayList<CurrencyAgm>();
        
        for (List<Integer> commaSplitText : intList) {

            int unnkoman = commaSplitText.get(0);
            int unnkoman2 = commaSplitText.get(1);
            int portrait = 0;

            switch (unnkoman) {
                case CURRENCY_ONE_YEN:
                    resuList.add(new CurrencyAgm(unnkoman, unnkoman2, portrait));
                    break;

                case CURRENCY_TEN_YEN:
                    resuList.add(new CurrencyAgm(unnkoman, unnkoman2, portrait));
                    break;

                case CURRENCY_ONEHUNDRED_YEN:
                    resuList.add(new CurrencyAgm(unnkoman, unnkoman2, portrait));
                    break;

                case CURRENCY_ONETHOUSAND_YEN:
                Scanner scanner = new Scanner(System.in);
                System.out.println("千円の肖像を選択してください");
                System.out.println("1. 野口英世 2. 北里柴三郎");
                portrait = scanner.nextInt();
                if (portrait == 1 || portrait == 2) {
                    resuList.add(new CurrencyAgm(unnkoman, unnkoman2, portrait));
                }
                    break;

                case CURRENCY_FIVETHOUSAND_YEN:
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("五千円の肖像を選択してください");
                System.out.println("1. 樋口一葉 2. 津田梅子");
                portrait = scanner1.nextInt();
                if (portrait == 1 || portrait == 2) {
                    resuList.add(new CurrencyAgm(unnkoman, unnkoman2, portrait));
                }
                    break;

                case CURRENCY_TENTHOUSAND_YEN:
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("壱万円の肖像を選択してください");
                System.out.println("1. 福沢諭吉 2. 渋沢栄一");
                portrait = scanner2.nextInt();
                if (portrait == 1 || portrait == 2) {
                    resuList.add(new CurrencyAgm(unnkoman, unnkoman2, portrait));
                }
                    break;
            
                default:
                    break;
            }

        }
        return resuList;
    }
}
