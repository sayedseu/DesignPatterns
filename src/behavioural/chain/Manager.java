package behavioural.chain;

public class Manager extends LoanApproval{

    @Override
    public void approveLoan(Loan loan) {
        if (loan.getAmount() <= 50000){
            System.out.println("Loan approve by Manager");
        }else {
            nextLoanApproval.approveLoan(loan);
        }
    }
}
