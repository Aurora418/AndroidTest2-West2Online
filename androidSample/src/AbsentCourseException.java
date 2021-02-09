public class AbsentCourseException extends RuntimeException{
    private String Sname,Cname;
    public AbsentCourseException(String Sname,String Cname){
        this.Sname=Sname;
        this.Cname=Cname;
    }
    public void printException(){
        System.out.println(Sname+"缺席"+Cname);
    }
}
