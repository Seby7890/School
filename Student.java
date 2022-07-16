public class Student extends Person {
    private String groupClass;

    public Student(String firstName, String lastName, String groupClass) {
        super(firstName, lastName);
        this.groupClass = groupClass;
    }

    public String getGroupClass() {
        return groupClass;
    }

    public void setGroupClass(String groupClass) {
        this.groupClass = groupClass;
    }

    public void introduce() {
        System.out.println("My name is " + this.getFirstName() + " " + this.getLastName() + " and I am a student in " + this.groupClass + " class.");
    }
}
