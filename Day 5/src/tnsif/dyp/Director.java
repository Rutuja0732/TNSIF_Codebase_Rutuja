package tnsif.dyp;

public class Director {
	
	// Base class
	
	    private String directorName;
	    private String department;

	    public Director() {
	    }

	    public Director(String directorName, String department) {
	        this.directorName = directorName;
	        this.department = department;
	    }

	    public String getDirectorName() {
	        return directorName;
	    }

	    public void setDirectorName(String directorName) {
	        this.directorName = directorName;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    @Override
	    public String toString() {
	        return "Director Name: " + directorName + ", Department: " + department;
	    }
	}

	
	