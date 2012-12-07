package gradespeed;
public class Grade {
    public String teacher;
    public String course;
    public int period;
    public int grade;

    public Grade(){
        teacher="";
        course="";
        period=-1;
        grade=-1;
    }
    public Grade(String line){
        teacher = line.substring(line.indexOf("Teacher ")+8,line.indexOf(" Course"));
        course = line.substring(line.indexOf("Course ")+7,line.indexOf(" Period"));
        period = Integer.parseInt(line.substring(line.indexOf("Period ")+7,line.indexOf(" Cycle")));
        grade = Integer.parseInt(line.substring(line.indexOf("Grade ")+6));
    }
    public Grade(String t, String c, int p, int g){
        teacher=t;
        course=c;
        period=p;
        grade=g;
    }
    public String toString(){
        return "Course: "+course+" - Grade: "+grade;
    }
}
