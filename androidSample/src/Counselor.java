import java.util.List;

public class Counselor extends Teacher implements Manage{
    public Counselor(Teacher t){
        super(t.num,t.name,t.courses);
    }

    public Counselor(String num, String name) {
        super(num, name);
    }

    public Counselor(String num, String name, List<Course> courses){
        super(num, name, courses);
    }

    @Override
    public void deleteStu(Student student) {
        for (var course:courses) {
            for (var stu : course.getStudents()) {
                if(stu==student){
                    course.getStudents().remove(stu);
                    break;
                }
            }
        }
        System.out.println("已删除学生："+student);
    }
}
