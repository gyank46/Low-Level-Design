public class Student implements Prototype{
    String name;
    String department;
    String hostel;
    int id;

    public Student(String name, String department, String hostel, int id) {
        this.name = name;
        this.department = department;
        this.hostel = hostel;
        this.id = id;
    }

    public Student(Student student) {
        this();
        this.name = student.name;
        this.department = student.department;
        this.hostel = student.hostel;
        this.id = student.id;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", hostel='" + hostel + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public Prototype clone() {
        return new Student(this);
    }
}
