package com.anilstack.singleresponsibility.compliant;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */

/**
 * Here Below code has multiple reason to change for example currently this bank is providing loanType is PersonalLoan
 * and GoldLoan in future bank will decide to change to support new loan type called HomeLoan also. in that case we need to
 * modify the code. similarly if you observe sendOTP method this bank service supports email now in future they decided to send
 * otp in whatsapp then again we need to did modify the code. here this class has lot of responsibilities. This is against to SOLID
 * so we have to split the below each task into each and individual class which is responsible for only one task/job.
 */
public class BankService {

    public long deposit (long amount, String accountNumber) {
        //logic
        return 0;
    }

    public long withDraw(long amountToWithDraw, String accountNumber) {
        //logic
        return 0;
    }

    public void printPassBook() {

    }

    public void findLoanInterestInformation(String loanType) {
        //logic
    }

    public void sendOTP(String platform) {
        //logic
    }


}
