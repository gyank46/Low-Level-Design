public class ICICIBankAPIAdapter implements BankAPIAdapter{
    ICICIBankAPI iciciBankAPI = new ICICIBankAPI();
    @Override
    public float getBalance(String BankAccountNumber) {
        return Float.parseFloat(iciciBankAPI.fetchBalance(Long.parseLong(BankAccountNumber)));
    }

    @Override
    public boolean sendMoney(String sourceBankAccountNumber, String targetBankAccountNumber) {
        if(iciciBankAPI.sendMoney(Long.parseLong(sourceBankAccountNumber),Long.parseLong(targetBankAccountNumber))=="OK")
            return true;
        return false;
    }
}
