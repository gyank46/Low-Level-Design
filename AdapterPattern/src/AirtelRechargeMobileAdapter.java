public class AirtelRechargeMobileAdapter implements RechargeMobileAPIAdapter{

    AirtelRechargeAPI airtelRechargeAPI = new AirtelRechargeAPI();
    @Override
    public boolean rechargeMobile(String mobile) {
        if(airtelRechargeAPI.recharge(Long.parseLong(mobile)) == "Success")
            return true;
        return false;
    }
}
