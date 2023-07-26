public class JioRechargeMobileAdapter implements RechargeMobileAPIAdapter{
    JioRechargeAPI jioRechargeAPI = new JioRechargeAPI();
    @Override
    public boolean rechargeMobile(String mobile) {
        if(jioRechargeAPI.recharge(mobile)==1)
            return true;
        return false;
    }
}
