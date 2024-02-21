import java.util.*;
import static lib.constants.AppConstants.*;
import lib.function.wallet.Wallet;

/**
 * @author sunaga
 * @version 1.0
 */
class Main {
    public static void main(String[] args) {
        mainfunc();
    }
    
    /**
     * mainFuncメソッド
     */
    public static void mainfunc() {

        Wallet wallet = new Wallet();
        
        // try-with-resources
        try(Scanner scanner = new Scanner(System.in)) {
            
            while (true) {
            
                System.out.println("コマンドを入力してください");
                System.out.println("1. 入金 2. 出金 3. 残高確認 4. 通貨種類確認 5. 肖像確認 6. 図柄確認");
                
                // 入力された値をコマンドを代入
                int command = scanner.nextInt();
                
                // コマンドの値で処理を実行
                switch (command) {

                    // 財布に入金
                    case CMD_PUT_MONEY:
                    
                        Scanner scannerText = new Scanner(System.in);
                        
                        while (true) {
                            
                            // 再入力フラグ
                            boolean doContinue = false;
                            
                            System.out.println("入金する通貨と枚数を指定してください");
                            
                            try {
                                
                                String inputText = scannerText.nextLine();
                                
                                // 入金処理呼び出し
                                wallet.putMoney(inputText);

                            } catch (Exception e) {

                                System.out.println("不正な入力です");
                                System.out.println("再度入力しますか？");
                                System.out.println("1. はい 2. いいえ");

                                int againCommand = scanner.nextInt();

                                // TODO:2以上だと"いいえ"になってしまう
                                doContinue = againCommand == CMD_YES ? true : false;
                            }

                            if (doContinue) {
                                continue;
                            } else {
                                break;
                            }
                        }
                        break;

                    // 財布から出金
                    case CMD_TAKEOUT_MONEY:
                        System.out.println("出金する通貨を指定してください");
                        // TODO:入力した数字を判定する処理
                        // TODO:出金処理
                        break;
                    
                    // 財布の残高確認
                    case CMD_CHECK_WALLETBALANCE:
                        // TODO:現在の財布の内容を表示させる
                        System.out.println("財布内の情報を表示します");

                        // 現在のCurrencyリスト内の情報を表示させる(テスト用)
                        wallet.checkBalance();
                        break;

                    // 通貨種類確認
                    case CMD_CHECK_CURRENCYTYPE:
                        // TODO:通貨種類確認処理
                        System.out.println("通貨種類を確認する通貨を指定してください");
                        break;
                    
                    // 肖像確認
                    case CMD_CHECK_PORTRAIT:
                        // TODO:肖像確認処理
                        System.out.println("肖像を確認する通貨を指定してください");
                        break;

                    // 図柄確認
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
    