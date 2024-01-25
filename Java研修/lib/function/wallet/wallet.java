package lib.function.wallet;

import java.util.*;
import lib.function.currency.Currency;
import lib.function.currency.OneYen;
import lib.function.currency.TenYen;
import lib.function.currency.OneHundredYen;
import lib.function.currency.OneThousandYen;
import lib.function.currency.FiveThousandYen;
import lib.function.currency.TenThousandYen;



public class Wallet {

    private List<Currency> currencyList;

    // コンストラクタ
    // 配列をインスタンス生成
    public Wallet() {
        this.currencyList = new ArrayList<Currency>();
    }


    // getter?
    public List<Currency> getCurrencyList() {
        return this.currencyList;
    }
    
    // setter?
    public void setCurrencyList(List<Currency> currencyList) {
        this.currencyList = currencyList;
    }


    // 文字分割処理
    public void splitText(String inputText) {

        String[] firstSplitList = inputText.split(",");

        for (String firstSplitText : firstSplitList) {

            String[] secondSplitList = firstSplitText.split(" ");
            int convert = 0;
            int first = 0;
            int second = 0;
            boolean turnFlag = true;

            for (String secondSplitText : secondSplitList) { 

                convert = Integer.parseInt(secondSplitText);

                if (turnFlag) {
                    first = convert;
                    turnFlag = false;
                } else {
                    second = convert;
                    if(first > 0 && second > 0) {
                        payment(first, second);
                    }
                    turnFlag = true;
                }
            }
        }
    }


    // 判定＆入金処理
    private void payment(int currencyType, int quantity) {

        switch (currencyType) {
            // 入金

            case 1:
                for (int i = 0; i < quantity; i++) {
                    this.currencyList.add(new OneYen());
                }
                displayAmount(currencyType, quantity);
            break;

            case 10:
                for (int i = 0; i < quantity; i++) {
                    this.currencyList.add(new TenYen());
                }
                displayAmount(currencyType, quantity);
            break;

            case 100:
                for (int i = 0; i < quantity; i++) {
                    this.currencyList.add(new OneHundredYen());
                }
                displayAmount(currencyType, quantity);
            break;

            case 1000:
                for (int i = 0; i < quantity; i++) {
                    this.currencyList.add(new OneThousandYen());
                }
                displayAmount(currencyType, quantity);
            break;

            case 5000:
                for (int i = 0; i < quantity; i++) {
                    this.currencyList.add(new FiveThousandYen());
                }
                displayAmount(currencyType, quantity);
            break;

            case 10000:
                for (int i = 0; i < quantity; i++) {
                    this.currencyList.add(new TenThousandYen());
                }
                displayAmount(currencyType, quantity);
            break;

            default:
                // 存在しない通貨の場合
                String unknownCurrency = Integer.toString(currencyType);

                System.out.println(unknownCurrency + "は存在しない通貨です");
            break;
        }
    }

    //
    private void displayAmount(int currencyType, int quantity) {
        int amount = currencyType*quantity;
        System.out.println(String.format("%,d", amount) + "円入金しました");
    }

}
