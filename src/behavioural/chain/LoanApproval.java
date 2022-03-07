package behavioural.chain;

public abstract class LoanApproval {

    protected LoanApproval nextLoanApproval;

    public void setNextLoanApproval(LoanApproval loanApproval){
        this.nextLoanApproval = loanApproval;
    }

    public abstract void approveLoan(Loan loan);
}
