package lib.function.wallet;

import java.util.Map;
import java.util.HashMap;

public class Wallet {
    // 金額用配列
    // public static final int[] CURRENCIES = {10000, 5000, 1000, 500, 100, 50, 10, 5, 1};

    public static Map<Integer, Integer> saihuMap = new HashMap<>();


     // 入力文字分割処理
    public static void nyuukin(String string) {
        String[] inputStrings = string.split(",");

        for (String inputString : inputStrings) {
            String[] bunkatu = inputString.split(" ");
            
            Integer kingaku = 0;
            Integer kazu = 0;
            boolean flag = true;
            
            for (String bunkatugo : bunkatu) {
                if (flag) {
                    kingaku = Integer.parseInt(bunkatugo);
                    flag = false;
                } else {
                        kazu = Integer.parseInt(bunkatugo);
                }
            
            nyuukin2(kingaku, kazu);
            }
        }
    }


    // 入金処理
    public static void nyuukin2(int price, int payment) {
        saihuMap.put(price, payment);
    }

}