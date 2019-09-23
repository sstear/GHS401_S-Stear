
public class Student
{
    private String name;
    private int grade;
    public Student(){
        this.name = "";
        this.grade = 0;
    }
    public Student(String theName, int theGrade){
        this.name = theName;
        this.grade = theGrade;
    }
    public void setName(String theName){
        this.name = theName;
    }
    public String getName(){
        return this.name;
    }
    public void setGrade(int theGrade){
        this.grade = theGrade;
    }
    public int getGrade(){
        return this.grade;
    }
    public String toString(){
        return this.name+" has "+this.grade+" as a grade.";
    }
}
