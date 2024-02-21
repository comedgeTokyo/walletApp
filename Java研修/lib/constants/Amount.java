package lib.constants;

import static lib.constants.AppConstants.*;

    /**
     * 通貨金額enum
     */
    public enum Amount {

        /** 1円 */
        OneYen(CURRENCY_ONE_YEN, CURRENCY_NAME_ICHIEN),

        /** 5円 */
        FiveYen(CURRENCY_FIVE_YEN, CURRENCY_NAME_GOEN),

        /** 10円 */
        TenYen(CURRENCY_TEN_YEN, CURRENCY_NAME_JUUEN),

        /** 50円 */
        FiftyYen(CURRENCY_FIFTY_YEN, CURRENCY_NAME_GOJUUEN),

        /** 100円 */
        OneHundredYen(CURRENCY_ONE_HUNDRED_YEN, CURRENCY_NAME_HYAKUEN),

        /** 500円 */
        FiveHundredYen(CURRENCY_FIVE_HUNDRED_YEN, CURRENCY_NAME_GOHYAKUEN),

        /** 1000円 */
        OneThousandYen(CURRENCY_ONE_THOUSAND_YEN, CURRENCY_NAME_SENEN),

        /** 2000円 */
        TwoThousandYen(CURRENCY_TWO_THOUSAND_YEN, CURRENCY_NAME_NISENEN),

        /** 5000円 */
        FiveThousandYen(CURRENCY_FIVE_THOUSAND_YEN, CURRENCY_NAME_GOSENEN),

        /** 10000円 */
        TenThousandYen(CURRENCY_TEN_THOUSAND_YEN, CURRENCY_NAME_ICHIMANEN);

        private Amount(int amount, String amountName) {
            this.amount = amount;
            this.amountName = amountName;
        }

        /** 通貨金額 */
        private int amount;
        
        /** 通貨名 */
        private String amountName;

        /**
         * 通貨金額を取得
         */
        public int getAmount() {
            return this.amount;
        }
        
        /**
         * 通貨名を取得
         */
        public String getAmountName() {
            return this.amountName;
        }
    }
