import java.util.ArrayList;
import java.util.List;

public abstract class Course {
    protected String name;
    protected String teacher;
    protected String address;
    protected List<Student> students;

    public Course(String name,String teacher,String address){
        this.name=name;
        this.teacher=teacher;
        this.address=address;
        this.students=new ArrayList<Student>();
    }

    public Course(String name,String teacher,String address,List<Student> students){
        this.name=name;
        this.teacher=teacher;
        this.address=address;
        this.students=students;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student){
        students.add(student);
        student.addCourse(name);
    }

    public void call(){
        for (var stu:students) {
            if(stu.isAbsent(this).equals("缺席"))
                throw new AbsentCourseException(stu.getName(),name);
        }
    }

    public List<Student> getStudents(){
        return students;
    }

    public abstract String toString() ;
}
