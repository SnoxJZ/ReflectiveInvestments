import Entity.InvestmentDeposit;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        InvestmentDeposit deposit = new InvestmentDeposit.InvestmentDepositBuilder()
                .withToken("selectedToken")
                .withInvestmentPlan("selectedPlan")
                .withTokenAmount(35)
                .withUser("New User")
                .withUserId(1)
                .build();
        }
    }