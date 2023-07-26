public interface BankAPIAdapter {

    public float getBalance(String BankAccountNumber);
    public boolean sendMoney(String sourceBankAccountNumber, String targetBankAccountNumber);
}
