import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class Student {
    private String num;
    private String name;
    private String academic;
    private Hashtable<String,String> isAbsent;

    public Student(String num,String name,String academic){
        this.num=num;
        this.name=name;
        this.academic=academic;
        isAbsent=new Hashtable<String,String>();
    }

    public String getName() {
        return name;
    }

    public void addCourse(String courseName){
        isAbsent.put(courseName,"");
    }

    public void absent(Course course){
        isAbsent.remove(course.getName());
        isAbsent.put(course.getName(),"缺席");
    }

    public String isAbsent(Course course){
        return isAbsent.get(course.getName());
    }

    @Override
    public String toString() {
        return "学号：" + num +
                " 姓名：" + name +
                " 学院：" + academic +
                " 课程列表：\n"+isAbsent.keys();
    }
}
