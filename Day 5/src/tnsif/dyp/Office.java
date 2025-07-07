package tnsif.dyp;

public class Office extends EmPerson {
    private String company;
    private String designation;

    // Default Constructor
    public Office() {
        super();
        this.company = "";
        this.designation = "";
    }

    // Parameterized Constructor
    public Office(String name, int age, String address, String company, String designation) {
        super(name, age, address);
        this.company = company;
        this.designation = designation;
    }

    // Getters and Setters
    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", Office [Company=" + company + ", Designation=" + designation + "]";
    }
}


