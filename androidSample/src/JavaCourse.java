import java.util.List;

public class JavaCourse extends Course{
    public JavaCourse(String teacher, String address) {
        super("Java", teacher, address);
    }

    public JavaCourse(String teacher, String address, List<Student> students) {
        super("Java", teacher, address, students);
    }

    @Override
    public String toString() {
        return "["+name+"] "+teacher+" "+address+"\n"+
                "学生名单：\n"+students;
    }
}
