public class SongDriver
{
    public static void main(){
    
        Song s1 = new Song("Cat", "Helloo" , 3.23, 300);
    
        System.out.println(s1);
        s1.setLengthInSec(343);
        System.out.println(s1);
    }
}
