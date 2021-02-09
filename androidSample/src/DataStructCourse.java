import java.util.List;

public class DataStructCourse extends Course{
    public DataStructCourse(String teacher, String address) {
        super("数据结构", teacher, address);
    }

    public DataStructCourse(String teacher, String address, List<Student> students) {
        super("数据结构", teacher, address, students);
    }

    @Override
    public String toString() {
        return "["+name+"] "+teacher+" "+address+"\n"+
                "学生名单：\n"+students;
    }
}
