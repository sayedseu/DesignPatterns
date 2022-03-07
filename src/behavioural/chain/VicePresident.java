package behavioural.chain;

public class VicePresident extends LoanApproval{

    @Override
    public void approveLoan(Loan loan) {
        if (loan.getAmount() >= 500000){
            System.out.println("Loan approve by VicePresident");
        }
    }
}
