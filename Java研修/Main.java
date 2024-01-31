import java.util.*;
import static lib.constants.AppConstants.*;
import static lib.function.wallet.SplitText.*;
import lib.function.wallet.Wallet;
/**
 * @author sunaga
 * @version 1.0
 */

class Main {
    public static void main(String[] args) {
        mainFunc();
    }
    
    /**
     * mainFuncメソッド
     */
    public static void mainFunc() {

        // Walletインスタンス生成
        Wallet wallet = new Wallet();
        
        try(Scanner scanner = new Scanner(System.in);) {
            
            while (true) {
                System.out.println("コマンドを入力してください");
                System.out.println("1. 入金 2. 出金 3. 残高確認 4. 通貨種類確認 5. 肖像確認 6. 図柄確認");
                
                // 入力された値をコマンドを代入
                int command = scanner.nextInt();
                
                // コマンドの値で処理を実行
                switch (command) {

                    case CMD_DEPOSIT:
                        System.out.println("入金する通貨を指定してください");
                    
                        Scanner scannerAmount = new Scanner(System.in);
                        String amountText = scannerAmount.nextLine();
                        List<List<Integer>> splitTextlist;

                        if (amountText != ""){

                            splitTextlist = splitText(amountText);
                            
                            currencyAgmfunc(splitTextlist);
                        } else {
                            System.out.println("入力を確認できませんでした");
                        }
                        
                        break;

                    case CMD_WITHDRAW:
                        System.out.println("出金する通貨を指定してください");
                        // TODO:入力した数字を判定する処理
                        // TODO:出金処理
                        break;

                    case CMD_CHECK_BALANCE:
                        // TODO:現在の財布の内容を表示させる
                        System.out.println("残高");
                        break;
                
                    case CMD_CHECK_CURRENCYTYPE:
                        // TODO:通貨種類確認処理
                        System.out.println("通貨種類を確認する通貨を指定してください");
                        break;
                                 
                    case CMD_CHECK_PORTRAIT:
                        // TODO:肖像確認処理
                        System.out.println("肖像を確認する通貨を指定してください");
                        break;

                    case CMD_CHECK_DESIGN:
                        // TODO:図柄確認処理
                        System.out.println("図柄を確認する通貨を指定してください");
                        break;
                            
                    
                    // 1~6外の数字が入力された場合
                    default:
                        System.out.println("無効なコマンドです");
                        break;
                }
            }
        }
    }
}
    