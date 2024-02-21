package lib.constants;

    /**
     * 通貨enum
     */
    public enum Amount {

        /** 1円 */
        OneYen(1,"１"),

        /** 5円 */
        FiveYen(5,"５"),

        /** 10円 */
        TenYen(10,"１０"),

        /** 50円 */
        FiftyYen(50,"５０"),

        /** 100円 */
        OneHundredYen(100,"１００"),

        /** 500円 */
        FiveHundredYen(500,"５００"),

        /** 1000円 */
        OneThousandYen(1000,"千"),

        /** 2000円 */
        TwoThousandYen(2000,"二千"),

        /** 5000円 */
        FiveThousandYen(5000,"五千"),

        /** 10000円 */
        TenThousandYen(10000,"壱万");

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
