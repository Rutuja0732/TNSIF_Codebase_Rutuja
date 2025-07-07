package tnsif.dyp;

public class Principal extends Director {

	// Intermediate class
	
	    private String principalName;
	    private int yearsOfExperience;

	    public Principal() {
	        super();
	    }

	    public Principal(String directorName, String department, String principalName, int yearsOfExperience) {
	        super(directorName, department);
	        this.principalName = principalName;
	        this.yearsOfExperience = yearsOfExperience;
	    }

	    public String getPrincipalName() {
	        return principalName;
	    }

	    public void setPrincipalName(String principalName) {
	        this.principalName = principalName;
	    }

	    public int getYearsOfExperience() {
	        return yearsOfExperience;
	    }

	    public void setYearsOfExperience(int yearsOfExperience) {
	        this.yearsOfExperience = yearsOfExperience;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nPrincipal Name: " + principalName + ", Experience: " + yearsOfExperience + " years";
	    }
}
	
