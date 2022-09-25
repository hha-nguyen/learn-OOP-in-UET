package Week_2;

public class StudentManagement {
    private Student[] students = new Student[100];
    private int studentGroupLength = 0;

    /**
     * Create sameGroup method to check if student 1 and 2 have same group or not.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Create addStudent method.
     */
    public void addStudent(Student student) {
        students[studentGroupLength++] = student;
    }

    /**
     * Create printStudent method.
     */
    public void printStudent() {
        for (int i = 0; i < studentGroupLength; i++) {
            students[i].getInfo();
        }
    }

    /**
     * Create studentsByGroup method.
     */
    public String studentsByGroup() {
        String[] classes = new String[100];
        int classesLength = 0;
        String result = "";

        for (int i = 0; i < studentGroupLength; i++) {
            int j;
            for (j = 0; j < classesLength; j++) {
                if (students[i].getGroup().equals(classes[j])) {
                    break;
                }
            }
            if (j == classesLength) {
                classes[classesLength++] = students[i].getGroup();
            }
        }

        for (int i = 0; i < classesLength; i++) {
            result += classes[i] + "\n";
            for (int j = 0; j < studentGroupLength; j++) {
                if (students[j].getGroup().equals(classes[i])) {
                    result += students[j].getInfo() + "\n";
                }
            }
        }

        return result;
    }

    /**
     * Create removeStudent method.
     */
    public void removeStudent(String id) {
        for (int i = 0; i < studentGroupLength; i++) {
            if (students[i].getId().equals(id)) {
                if (i == studentGroupLength - 1) {
                    students[i] = null;
                }

                while (i < studentGroupLength - 1) {
                    students[i] = students[i + 1];
                    i++;
                }

                students[i + 1] = null;
                studentGroupLength--;
                break;
            }
        }
    }

    /**
     * Create main method.
     */
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();

        Student s = new Student("Nguyen Ha", "20020652", "K65K", "20020652@vnu.edu.vn");
        Student s1 = new Student("Nguyen Huy", "20020682", "K65K", "20020652@vnu.edu.vn");
        Student s2 = new Student("Nguyen Hai", "20020622", "K65K", "20020652@vnu.edu.vn");

        sm.addStudent(s);
        sm.addStudent(s1);
        sm.addStudent(s2);

        Student s3 = new Student(s);
        s3.setId("20020632");
        s3.setGroup("K65CB");
        sm.addStudent(s3);

        sm.removeStudent("20020632");

        System.out.println(sm.studentsByGroup());
    }
}
