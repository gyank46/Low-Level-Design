public class YesBankAPIAdapter implements BankAPIAdapter{
    YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public float getBalance(String BankAccountNumber) {
        return yesBankAPI.fetchBalance(BankAccountNumber);
    }

    @Override
    public boolean sendMoney(String sourceBankAccountNumber, String targetBankAccountNumber) {
        return yesBankAPI.sendMoney(sourceBankAccountNumber,targetBankAccountNumber)==1;
    }
}
