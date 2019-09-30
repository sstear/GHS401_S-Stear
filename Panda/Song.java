public class Song
{
    private String title;
    private String artist;
    private double cost;
    private int lengthInSecs;
    public Song(String theTitle, String theArtist, double theCost, int theLengthInSecs)
    {
       this.title = theTitle;
       this.artist = theArtist;
       this.cost = theCost;
       this.lengthInSecs = theLengthInSecs;
    }
    public int getLengthInSec()
    {
        return this.lengthInSecs;
    }
    public void setLengthInSec(int newSeconds)
    {
        this.lengthInSecs = newSeconds;
    }
    public String convertToMinSec()
    {
        return "The song is "+(int)(this.lengthInSecs/60)+" minutes and "+(this.lengthInSecs%60)+" seconds.";
    }
    public String toString()
    {
        return "Title: "+this.title+"\nArtist: "+this.artist+"\nCost: "+this.cost+"\nLength: "+this.convertToMinSec();
    }
}
