package lib.function.wallet;

import java.util.*;
import static lib.constants.AppConstants.*;
import static lib.commons.CommonFunc.*;
import static lib.function.wallet.PutMoney.*;
import static lib.function.wallet.CheckBalance.*;
import lib.function.currency.CurrencyInfo;
import lib.function.currency.FiftyYen;
import lib.function.currency.FiveHundredYen;
import lib.function.currency.Currency;
import lib.function.currency.FiveThousandYen;
import lib.function.currency.FiveYen;
import lib.function.currency.OneHundredYen;
import lib.function.currency.OneThousandYen;
import lib.function.currency.OneYen;
import lib.function.currency.TenThousandYen;
import lib.function.currency.TenYen;
import lib.function.currency.TwoThousandYen;

/**
 * 財布処理クラス
 */
public class Wallet {
    
    public Wallet() {
        this.currencyList = new ArrayList<Currency>();
    }

    /** 財布 */
    private List<Currency> currencyList;


    /**
     * Currencyリストgetter
     */
    public List<Currency> getCurrencyList() {
        return this.currencyList;
    }

    /**
     * Currencyリストsetter
     * @param currencyList 通貨クラスリスト
     */
    public void setCurrencyList(List<Currency> currencyList) {
        this.currencyList = currencyList;
    }

    /**
     * Currency追加処理
     * @param currency 通貨クラス
     */
    public void addCurrencyList(Currency currency) {
        this.currencyList.add(currency);
    }


    /**
     * 入金処理
     */
    public void putMoney(String inputText) {
        // 整数型のリストに変換
        List<List<Integer>> splitIntlist = splitTextConvert(inputText);

        // 通貨情報用クラスに変換
        List<CurrencyInfo> currencyInfoList = currencyConvert(splitIntlist);

        // 入金処理
        for (CurrencyInfo currentCurrencyInfo : currencyInfoList) {

            // 金額を取得
            int amount = currentCurrencyInfo.getAmount().getAmount();

            // 枚数を取得
            int howMany = currentCurrencyInfo.getHowMany();

            // 肖像を取得
            int portrait = currentCurrencyInfo.getPortrait();

            // デザインを取得
            int design = currentCurrencyInfo.getDesign();

            // 財布内に同じ金額、肖像の通貨があるか確認
            boolean isNotEmpty = getCurrencyList().stream().anyMatch(f -> amount == f.getAmount().getAmount() && portrait == f.getPortrait());

            if (isNotEmpty) {
                // 財布内に存在する場合

                // 現在の財布を取得
                List<Currency> currentCurrencyList = getCurrencyList();

                // 返却用
                List<Currency> resultCurrencyList = new ArrayList<Currency>();

                for (Currency currency : currentCurrencyList) {

                    // 金額の数値を取得
                    int currentAmount = currency.getAmount().getAmount();

                    // 肖像を取得
                    int currentPortrait = currency.getPortrait();

                    // 枚数を加算
                    int totalHowMany = howMany + currency.getHowMany();

                    if (amount == currentAmount && portrait == currentPortrait) {
                        // 同じ金額、肖像の場合枚数を加算した通貨クラスを生成

                        switch (currentAmount) {
                            case CURRENCY_ONE_YEN:
                                resultCurrencyList.add(new OneYen(totalHowMany, currentPortrait, design));
                                break;
                            case CURRENCY_FIVE_YEN:
                                resultCurrencyList.add(new FiveYen(totalHowMany, currentPortrait, design));
                                break;
                            case CURRENCY_TEN_YEN:
                                resultCurrencyList.add(new TenYen(totalHowMany, currentPortrait, design));
                                break;
                            case CURRENCY_FIFTY_YEN:
                                resultCurrencyList.add(new FiftyYen(totalHowMany, currentPortrait, design));
                                break;
                            case CURRENCY_ONE_HUNDRED_YEN:
                                resultCurrencyList.add(new OneHundredYen(totalHowMany, currentPortrait, design));
                                break;
                            case CURRENCY_FIVE_HUNDRED_YEN:
                                resultCurrencyList.add(new FiveHundredYen(totalHowMany, currentPortrait, design));
                                break;
                            case CURRENCY_ONE_THOUSAND_YEN:
                                resultCurrencyList.add(new OneThousandYen(totalHowMany, currentPortrait, design));
                                break;
                            case CURRENCY_TWO_THOUSAND_YEN:
                                resultCurrencyList.add(new TwoThousandYen(totalHowMany, currentPortrait, design));
                                break;
                            case CURRENCY_FIVE_THOUSAND_YEN:
                                resultCurrencyList.add(new FiveThousandYen(totalHowMany, currentPortrait, design));
                                break;
                            case CURRENCY_TEN_THOUSAND_YEN:
                                resultCurrencyList.add(new TenThousandYen(totalHowMany, currentPortrait, design));
                                break;
                            default:
                                break;
                        }
                    } else {
                        resultCurrencyList.add(currency);
                    }

                }

                setCurrencyList(resultCurrencyList);
            } else {
                // 財布内に存在しない場合

                switch (amount) {
                    case CURRENCY_ONE_YEN:
                        addCurrencyList(new OneYen(howMany, portrait, design));
                        break;
                    case CURRENCY_FIVE_YEN:
                        addCurrencyList(new FiveYen(howMany, portrait, design));
                        break;
                    case CURRENCY_TEN_YEN:
                        addCurrencyList(new TenYen(howMany, portrait, design));
                        break;
                    case CURRENCY_FIFTY_YEN:
                        addCurrencyList(new FiftyYen(howMany, portrait, design));
                        break;
                    case CURRENCY_ONE_HUNDRED_YEN:
                        addCurrencyList(new OneHundredYen(howMany, portrait, design));
                        break;
                    case CURRENCY_FIVE_HUNDRED_YEN:
                        addCurrencyList(new FiveHundredYen(howMany, portrait, design));
                        break;
                    case CURRENCY_ONE_THOUSAND_YEN:
                        addCurrencyList(new OneThousandYen(howMany, portrait, design));
                        break;
                    case CURRENCY_TWO_THOUSAND_YEN:
                        addCurrencyList(new TwoThousandYen(howMany, portrait, design));
                        break;
                    case CURRENCY_FIVE_THOUSAND_YEN:
                        addCurrencyList(new FiveThousandYen(howMany, portrait, design));
                        break;
                    case CURRENCY_TEN_THOUSAND_YEN:
                        addCurrencyList(new TenThousandYen(howMany, portrait, design));
                        break;
                    default:
                        break;
                }
            }
        }
    }

    
        
    /**
     * 残高確認処理
     */
    public void checkBalance() {

        // 現在の通貨リストを取得
        List<Currency> checkCurrencyList = getCurrencyList();
        
        // 残高表示処理呼び出し
        displyBalance(checkCurrencyList);
        
    }
}
