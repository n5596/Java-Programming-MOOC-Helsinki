
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared){
        if (this.getClass() != compared.getClass()){
            return false;
        }
        
        Song song2 = (Song) compared;
        if (this.artist.equals(song2.artist) && this.name.equals(song2.name) && this.durationInSeconds == song2.durationInSeconds){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
