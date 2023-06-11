public class OutdoorHandymen extends Handymen{
    protected String serviceArea;
    protected boolean optimalEnvironment;
    public OutdoorHandymen(boolean accept, boolean servicing, boolean employed, String id, String passcode, String firstName, String lastName, String specialization, String phoneNum, String email, String serviceArea, String description, boolean optimalEnvironment, double price) {
        super(accept, servicing, employed, id, passcode, firstName, lastName, specialization, description, phoneNum, email, price);
        this.serviceArea = serviceArea;
        this.optimalEnvironment = optimalEnvironment;

    }
    public String showDesc() {
        return (super.showDesc() + "\n" +
                "Service area: " + String.valueOf(serviceArea) + "\n" +
                "Suitable conditions: " + String.valueOf(optimalEnvironment)
        );
    }
    public String menuForm() {
        return (super.menuForm() + " | Service area: " + String.valueOf(serviceArea) + " | " + "Suitable conditions: " + String.valueOf(optimalEnvironment));
    }
    public void servicing() {
        super.servicing();
    }
    public void serviceDone() {
        super.serviceDone();
    }

}
