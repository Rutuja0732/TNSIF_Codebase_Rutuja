package tnsif.dyp;

public class EmPerson {
    private String name;
    private int age;
    private String address;

    // Default Constructor
    public EmPerson() {
        this.name = "";
        this.age = 0;
        this.address = "";
    }

    // Parameterized Constructor
    public EmPerson(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    // toString
    @Override
    public String toString() {
        return " Person is  Name=" + name + ", Age=" + age + ", Address=" + address ;
    }
}
