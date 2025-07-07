package tnsif.dyp;

public class HOD extends Principal {

    private String hodName;
    private String subject;

    public HOD() {
        super();
    }

    public HOD(String directorName, String department, String principalName, int yearsOfExperience,
               String hodName, String subject) {
        super(directorName, department, principalName, yearsOfExperience);
        this.hodName = hodName;
        this.subject = subject;
    }

    public String getHodName() {
        return hodName;
    }

    public void setHodName(String hodName) {
        this.hodName = hodName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHOD Name: " + hodName + ", Subject: " + subject;
    }


}

