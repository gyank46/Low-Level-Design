public class Client {
    public static void main(String[] args) {
//        BankAPIAdapter bankAPIAdapter = new ICICIBankAPIAdapter();
//        RechargeMobileAPIAdapter rechargeMobileAPIAdapter = new JioRechargeMobileAdapter();
        BankAPIAdapter bankAPIAdapter = new YesBankAPIAdapter();
        RechargeMobileAPIAdapter rechargeMobileAPIAdapter = new AirtelRechargeMobileAdapter();
        Phonepe phonepe = new Phonepe(bankAPIAdapter,rechargeMobileAPIAdapter);
        System.out.println(phonepe.getAccountBalance("1234"));
        System.out.println(phonepe.sendMoney("1234","5678"));
        System.out.println(phonepe.rechargeMobile("7002614683"));
    }
}
