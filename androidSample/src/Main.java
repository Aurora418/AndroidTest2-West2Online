import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student("1111111","zzzzz","数计");
        Student student2=new Student("1111112","aaaaa","数计");
        Student student3=new Student("1111113","bbbbb","数计");
        Student student4=new Student("1111114","ccccc","数计");


        /*Course course1=new Course("math","linda","103",students);
        Course course2=new Course("chinese","linda","104",students);*/

        Course java=new JavaCourse("张舒","东三-303");
        Course dataStruct=new DataStructCourse("王一蕾","东三-307");

        java.addStudent(student1);
        java.addStudent(student2);
        java.addStudent(student3);

        dataStruct.addStudent(student1);
        dataStruct.addStudent(student3);
        dataStruct.addStudent(student4);

        Teacher teacher1=new Teacher("000001","张舒");
        Teacher teacher2=new Teacher("000002","王一蕾");
        teacher1.addCourse(java);
        teacher2.addCourse(dataStruct);

        Counselor counselor=new Counselor(teacher1);
        System.out.println(counselor);
        System.out.println();
        counselor.deleteStu(student1);
        System.out.println();
        System.out.println(counselor);
        System.out.println();
        System.out.println(dataStruct);
        System.out.println();
        System.out.println(java);
        System.out.println();

        // 缺席
        try{
            student3.absent(java);
            java.call();
        }catch (AbsentCourseException ace){
            ace.printException();
        }
    }
}
