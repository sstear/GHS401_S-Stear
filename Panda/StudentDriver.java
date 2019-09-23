
public class StudentDriver
{
    public static void main(){
        Student[] femaleStudents = new Student[7];
        femaleStudents[0] = new Student("Carol",(int)(Math.random()*12+1));
        femaleStudents[1] = null;
        femaleStudents[2] = new Student("Sue",(int)(Math.random()*12+1));
        femaleStudents[3] = new Student("Mary",(int)(Math.random()*12+1));
        femaleStudents[4] = new Student("Barb",(int)(Math.random()*12+1));
        femaleStudents[5] = new Student("Luna",(int)(Math.random()*12+1));
        femaleStudents[6] = new Student("Sar",(int)(Math.random()*12+1));
        Student[] maleStudents = new Student[7];
        maleStudents[0] = new Student("Jack",(int)(Math.random()*12+1));
        maleStudents[1] = null;
        maleStudents[2] = null;
        maleStudents[3] = new Student("Bob",(int)(Math.random()*12+1));
        maleStudents[4] = new Student("Jim",(int)(Math.random()*12+1));
        maleStudents[5] = new Student("Max",(int)(Math.random()*12+1));
        maleStudents[6] = new Student("Ry",(int)(Math.random()*12+1));
        String[] olderNames = new String[7];
        System.out.println("Female Name\tGrade\tMale Name\tGrade\tOlder Student");
        for(int i = 0; i<olderNames.length; i++){
            if(maleStudents[i]==null&&femaleStudents[i]==null){
                olderNames[i] = "Space for Rent";
                System.out.println("null\t\tnull\tnull\t\tnull\t"+olderNames[i]);
            }
            else if((maleStudents[i]==null)){
                olderNames[i] = femaleStudents[i].getName();
                System.out.println(femaleStudents[i].getName()+"\t\t"+femaleStudents[i].getGrade()+"\tnull\t\tnull\t"+olderNames[i]);
            }
            else if((femaleStudents[i]==null)){
                olderNames[i] = maleStudents[i].getName();
                System.out.println("null\t\tnull\t"+maleStudents[i].getName()+"\t\t"+maleStudents[i].getGrade()+"\t"+olderNames[i]);
            }
            else if((femaleStudents[i].getGrade())>(maleStudents[i].getGrade())){
                olderNames[i] = femaleStudents[i].getName();
                System.out.println(femaleStudents[i].getName()+"\t\t"+femaleStudents[i].getGrade()+"\t"+maleStudents[i].getName()+"\t\t"+maleStudents[i].getGrade()+"\t"+olderNames[i]);
            }
            else if((maleStudents[i].getGrade())>(femaleStudents[i].getGrade())){
                olderNames[i] = maleStudents[i].getName();
                System.out.println(femaleStudents[i].getName()+"\t\t"+femaleStudents[i].getGrade()+"\t"+maleStudents[i].getName()+"\t\t"+maleStudents[i].getGrade()+"\t"+olderNames[i]);
            }
            else if((maleStudents[i].getGrade())==(femaleStudents[i].getGrade())){
                int a = (int)(Math.random()*2+1);
                if(a==1){
                    olderNames[i] = femaleStudents[i].getName();
                }
                else if(a==2){
                    olderNames[i] = maleStudents[i].getName();
                }
                System.out.println(femaleStudents[i].getName()+"\t\t"+femaleStudents[i].getGrade()+"\t"+maleStudents[i].getName()+"\t\t"+maleStudents[i].getGrade()+"\t"+olderNames[i]);
            }
        }
    }
}
