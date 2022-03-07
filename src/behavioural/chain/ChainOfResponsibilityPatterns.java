package behavioural.chain;


/*
As the name suggests, the chain of responsibility pattern creates a chain of receiver objects for a request.
This pattern decouples sender and receiver of a request based on type of request.
This pattern comes under behavioral patterns.

In this pattern, normally each receiver contains reference to another receiver.
If one object cannot handle the request then it passes the same to the next receiver and so on.
 */

public class ChainOfResponsibilityPatterns {

    public static void main(String[] args) {

        Loan loan = new Loan(5000000);
        LoanApproval manager = new Manager();
        LoanApproval md = new MangingDirector();
        LoanApproval vp = new VicePresident();

        manager.setNextLoanApproval(md);
        md.setNextLoanApproval(vp);

        manager.approveLoan(loan);
    }
}
