
import java.util.Scanner;

import lib.function.wallet.Wallet;

class Main {
    public static void main(String[] args) {
        saihuMain();
    }
    
    
    public static void saihuMain() {

        Wallet wallet = new Wallet();
        // 財布情報保持Map
        // Map<String, Integer> saihuMap = new HashMap<>();

        try(Scanner scanner = new Scanner(System.in);) {

            
            while (true) {
            System.out.println("コマンドを入力してください");
            System.out.println("1. 入金 2. 出金 3. 残高確認 4. 通貨種類確認 5. 肖像確認 6. 図柄確認");
            
            // 入力されたコマンド
            int command = scanner.nextInt();
            

            // コマンドの数字ごとの処理を実行
            switch (command) {
                // 入金
                case 1:
                System.out.println("入金する通貨を指定してください");
                
                    Scanner scanner2 = new Scanner(System.in);
                    String nyukiScanner = scanner2.nextLine();

                    wallet.nyuukin(nyukiScanner);

                    

                    // 区切る処理
                    // String[] inputStrings = nyukiScanner.split(",");

                    // for (String inputString : inputStrings) {
                    //     String[] bunkatu = inputString.split(" ");
                        
                    //     String kingaku = "";
                    //     Integer kazu = 0;
                    //     boolean flag = true;
                        
                    //     for (String bunkatugo : bunkatu) {
                    //         if (flag) {
                    //             kingaku = bunkatugo;
                    //             flag = false;
                    //         } else {
                    //                 kazu = Integer.parseInt(bunkatugo);
                    //         }
                    //     }

                    //     saihuMap.put(kingaku, kazu);
                    // }
                        
                    
                    // 終了時
                    System.out.println("財布に入金しました");
                    break;

                    // 出金
                    case 2:
                    System.out.println("出金する通貨を指定してください");
                    // TODO:入力した数字を判定する処理

                    break;

                // 残高確認
                case 3:
                    // TODO:現在の財布の内容を表示させる
                    System.out.println("残高");

                    wallet.saihuMap.forEach((key, val) -> System.out.println(key + "円が" + val.toString() + "枚"));
                  
                    break;
                
                // 通貨種類確認
                case 4:
                    System.out.println("通貨種類を確認する通貨を指定してください");
                  
                    break;
                
                // 肖像確認            
                case 5:
                    System.out.println("肖像を確認する通貨を指定してください");
                    
                    break;

                // 図柄確認
                case 6:
                    System.out.println("図柄を確認する通貨を指定してください");
                    
                    break;
                
                // 1~6以外の数字が入力された場合
                default:
                    System.out.println("無効なコマンドです");
                    break;
            }
            
        }
        }
    }
}
    