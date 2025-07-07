package tnsif.dyp;

public class College extends EmPerson {
    private String collegeName;
    private String course;

    // Default Constructor
    public College() {
        super();
        this.collegeName = "";
        this.course = "";
    }

    // Parameterized Constructor
    public College(String name, int age, String address, String collegeName, String course) {
        super(name, age, address);
        this.collegeName = collegeName;
        this.course = course;
    }

    // Getters and Setters
    public String getCollegeName() { return collegeName; }
    public void setCollegeName(String collegeName) { this.collegeName = collegeName; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", College [CollegeName=" + collegeName + ", Course=" + course + "]";
    }
}


