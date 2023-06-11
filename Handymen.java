public abstract class Handymen implements Service {
    public boolean accept;
    public boolean servicing;
    public boolean employed;
    public String id;
    public String passcode;
    public String firstName;
    public String lastName;
    public String specialization;
    public String description;
    public String phoneNum;
    public String email;
    public double price;


    public Handymen(boolean accept, boolean servicing, boolean employed, String id, String passcode, String firstName, String lastName, String specialization, String description, String phoneNum, String email, double price) {
        this.accept = accept;
        this.servicing = servicing;
        this.employed = employed;
        this.id = id;
        this.passcode = passcode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
        this.description = description;
        this.phoneNum = phoneNum;
        this.email = email;
        this.price = price;
    }
    public String showDesc() {
        return (String.valueOf(firstName) + " " + String.valueOf(lastName) + "\n" +
                "ID: " + String.valueOf(id) + "\n" +
                "Specialization: " + String.valueOf(specialization) + "\n" +
                String.valueOf(description) + "\n" +
                "Phone number: " + phoneNum + "\n" +
                "Email: " + email + "\n" +
                "Price: $ " + String.valueOf(price) + " / hour");
    }
    public String menuForm() {
        return ("ID: " + String.valueOf(id) + " | " + String.valueOf(firstName) + " | " + "Specialization: " + String.valueOf(specialization) + " | " + "Price: " + String.valueOf(price));
    }
    public void servicing() {
        this.servicing = true;
    }
    public void serviceDone() {
        this.servicing = false;
        this.employed = false;
    }
}
