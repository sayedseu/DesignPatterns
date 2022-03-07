package behavioural.chain;

public class MangingDirector extends LoanApproval{

    @Override
    public void approveLoan(Loan loan) {
        if (loan.getAmount() <= 100000){
            System.out.println("Loan approve by MangingDirector");
        }else {
            nextLoanApproval.approveLoan(loan);
        }
    }
}
