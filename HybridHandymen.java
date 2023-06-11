public class HybridHandymen extends Handymen{
    private IndoorHandymen indoorHandymen;
    private OutdoorHandymen outdoorHandymen;
    public HybridHandymen(boolean accept, boolean servicing, boolean employed, String id, String passcode, String firstName, String lastName, String specialization, String phoneNum, String email, String serviceArea, String description, String qualifs, boolean optimalEnvironment, int experience,  double price) {
        super(accept, employed, servicing, id, passcode, firstName, lastName, specialization, description, phoneNum, email, price);
        indoorHandymen = new IndoorHandymen(accept, servicing, employed, id, passcode, firstName, lastName, phoneNum, email, specialization, experience, description, qualifs, price);
        outdoorHandymen = new OutdoorHandymen(accept, servicing, employed, id, passcode, firstName, lastName, phoneNum, email, specialization, serviceArea, description, optimalEnvironment, price);
    }
    public String showDesc() {
        return (super.showDesc() + "\n" +"Service area: " + String.valueOf(outdoorHandymen.serviceArea) + " | " + "Suitable conditions: " + String.valueOf(outdoorHandymen.optimalEnvironment)
        );
    }
    public String menuForm() {
        return (super.menuForm() + " | Experience: " + String.valueOf(indoorHandymen.experience) + " years" + " | " + "Qualifications: " + String.valueOf(indoorHandymen.qualifs) + " | Service area: " + String.valueOf(outdoorHandymen.serviceArea) + " | " + "Suitable conditions: " + String.valueOf(outdoorHandymen.optimalEnvironment));
    }
    public void servicing() {
        super.servicing();
    }
    public void serviceDone() {
        super.serviceDone();
    }
}
