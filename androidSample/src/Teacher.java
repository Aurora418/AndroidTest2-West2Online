import java.util.ArrayList;
import java.util.List;

public class Teacher {
    protected String num;
    protected String name;
    protected List<Course> courses;

    public Teacher(String num,String name){
        this.num=num;
        this.name=name;
        this.courses=new ArrayList<Course>();
    }

    public Teacher(String num,String name,List<Course> courses){
        this.num=num;
        this.name=name;
        this.courses=courses;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    @Override
    public String toString() {
        return "教师" +
                "工号：'" + num +
                " 姓名：" + name +
                "\n课程：\n" + courses;
    }
}
