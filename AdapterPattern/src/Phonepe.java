public class Phonepe {
    BankAPIAdapter bankAPIAdapter;
    RechargeMobileAPIAdapter rechargeMobileAPIAdapter;
    public Phonepe(BankAPIAdapter bankAPIAdapter, RechargeMobileAPIAdapter rechargeMobileAPIAdapter){
        this.bankAPIAdapter = bankAPIAdapter;
        this.rechargeMobileAPIAdapter = rechargeMobileAPIAdapter;
    }
    public float getAccountBalance(String BankAccount){
        return bankAPIAdapter.getBalance(BankAccount);
    }

    public boolean rechargeMobile(String MobileNumber){
        return rechargeMobileAPIAdapter.rechargeMobile(MobileNumber);
    }

    public boolean sendMoney(String SourceBankAccount, String TargetBankAccount){
        return bankAPIAdapter.sendMoney(SourceBankAccount,TargetBankAccount);
    }
}
