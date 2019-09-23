public class loops{
    public static void main(){
        String[] firstNames = {"Sarah","Ryan","Nathan","Luke","Aiden"};
        String[] lastNames = {"Stear","Woolsey","Randawa","Dempsey","Lallas"};
        System.out.println("First Name\t\tLast Name");
        for(int i = 0; i < 10; i++){
            System.out.println((i+1)+". "+firstNames[(int)(Math.random()*5)]+"\t\t"+lastNames[(int)(Math.random()*5)]);
        }
        int a = 4;
        while(a>=0){
            System.out.println(firstNames[a]+"\t\t"+lastNames[4-a]);
            a--;
        }
    }
}
