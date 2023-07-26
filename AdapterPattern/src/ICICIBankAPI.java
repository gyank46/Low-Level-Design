public class ICICIBankAPI {

    public String sendMoney(long sourceBankAccountNumber,long targetBankAccountNumber){
        return "OK";
    }

    public String fetchBalance(long bankAccountNumber){
        return "150";
    }
}
