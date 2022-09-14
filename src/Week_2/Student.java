package src.Week_2;

public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * create Student constructor.
     * @param name name of student.
     * @param id id of student.
     * @param group group of student.
     * @param email email of student.
     */
    public Student(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    public Student(String name, String id, String email) {
        this(name, id, "K62CB", email);
    }

    public Student() {
        this("Student", "000", "K62CB", "uet@vnu.edu.vn");
    }

    public Student(Student student) {
        this(student.name, student.id, student.group, student.email);
    }

    // Create getName, setName method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Create getID, setID method
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Create getGroup, setGroup method
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    // Create getEmail, setEmail method
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo() {
        return this.name + " - " + this.id + " - " + this.group + " - " + this.email;
    }
}
