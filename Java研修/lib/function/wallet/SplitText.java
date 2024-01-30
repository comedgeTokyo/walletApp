package lib.function.wallet;
import java.util.*;

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

        List<List<Integer>> resultIntList = new ArrayList<List<Integer>>();
        
        String[] commaSplitList = inputText.split(",");
        
        for (String commaSplitText : commaSplitList) {
            
            String[] spaceSplitList = commaSplitText.split(" ");

            Integer convert;
            Integer first;
            Integer second;
            boolean turnFlag = true;

            List<Integer> splitTextList = new ArrayList<Integer>();
            for (String spaceSplitText : spaceSplitList) { 

                convert = Integer.parseInt(spaceSplitText);

                if (turnFlag) {
                    first = convert;
                    splitTextList.add(first);
                    turnFlag = false;
                } else {
                    second = convert;
                    splitTextList.add(second);
                    resultIntList.add(splitTextList);
                    turnFlag = true;
                }
            }
        }
        return resultIntList;
    }
}
