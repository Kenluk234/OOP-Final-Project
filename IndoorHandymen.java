public class IndoorHandymen extends Handymen{
    protected String qualifs;
    protected int experience;

    public IndoorHandymen(boolean accept, boolean servicing, boolean employed, String id, String passcode,String firstName, String lastName, String specialization, String phoneNum, String email, int experience, String description, String qualifs, double price) {
        super(accept, servicing, employed, id, passcode, firstName, lastName, specialization, description, phoneNum, email, price);
        this.experience = experience;
        this.qualifs = qualifs;
    }
    public String showDesc() {
        return (super.showDesc() + "\n" +
                "Experience: " + String.valueOf(experience) + " years" + "\n" +
                "Qualifications: " + String.valueOf(qualifs)
        );
    }
    public String menuForm() {
        return (super.menuForm() + " | Experience: " + String.valueOf(experience) + " years" + " | " + "Qualifications: " + String.valueOf(qualifs));
    }
    public void servicing() {
        super.servicing();
    }
    public void serviceDone() {
        super.serviceDone();
    }
}
