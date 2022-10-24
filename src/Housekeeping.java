public class Housekeeping {

    private int customerId, callsMade, callMinutes;
    private double customerBill;
    private int calls = 100;
    private int minutes = 500;
    private double basicService = 30.00;
    private double premium = 20.00;

    public Housekeeping() {

    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCallsMade() {
        return callsMade;
    }

    public void setCallsMade(int callsMade) {
        this.callsMade = callsMade;
    }

    public int getCallMinutes() {
        return callMinutes;
    }

    public void setCallMinutes(int callMinutes) {
        this.callMinutes = callMinutes;
    }

    public double getCustomerBill() {
        return customerBill;
    }

    public void setCustomerBill(double customerBill) {
        this.customerBill = customerBill;
    }

    public int getCalls() {
        return calls;
    }

    public int getMinutes() {
        return minutes;
    }

    public double getBasicService() {
        return basicService;
    }

    public double getPremium() {
        return premium;
    }
}
