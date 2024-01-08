package Entity;

public class InvestmentDeposit {
    private String token;
    private String investmentPlan;
    private double tokenAmount;
    private String user;
    private int userId;

    private InvestmentDeposit(InvestmentDepositBuilder builder) {
        this.token = builder.token;
        this.investmentPlan = builder.investmentPlan;
        this.tokenAmount = builder.tokenAmount;
        this.user = builder.user;
        this.userId = builder.userId;
    }

    public static class InvestmentDepositBuilder {
        private String token;
        private String investmentPlan;
        private double tokenAmount;
        private String user;
        private int userId;

        public InvestmentDepositBuilder withToken(String token) {
            this.token = token;
            return this;
        }

        public InvestmentDepositBuilder withInvestmentPlan(String investmentPlan) {
            this.investmentPlan = investmentPlan;
            return this;
        }

        public InvestmentDepositBuilder withTokenAmount(double tokenAmount) {
            this.tokenAmount = tokenAmount;
            return this;
        }

        public InvestmentDepositBuilder withUser(String user) {
            this.user = user;
            return this;
        }

        public InvestmentDepositBuilder withUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public InvestmentDeposit build() {
            return new InvestmentDeposit(this);
        }
    }
}
