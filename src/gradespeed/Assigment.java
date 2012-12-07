package gradespeed;
public class Assigment {
    public String assigment;
    public String date;
    public int grade;

    public Assigment(String a, String d, int g){
        assigment = a;
        date = d;
        grade = g;
    }
    public String toString(){
        return "Assigment: "+assigment+" - Grade: "+grade;
    }
}
