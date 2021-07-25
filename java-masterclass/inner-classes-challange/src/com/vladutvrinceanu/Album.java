
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new SongList();
    }

    public boolean addSong(String title, double duration){
        boolean response = songs.addSong(title, duration);
        return response;
    }

    private Song findSong(String title){
        Song song = songs.findSong(title);
        return song;
    }


    public boolean addToPlayList(int trackNumber, List<Song> playList){
        int index = trackNumber-1;
        if((index>=0) && (index <= songs.getSongs().size())){
            playList.add(this.songs.getSongs().get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, List<Song> playList){
        Song checkedSong = findSong(title);
        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not  in  this album");
        return false;
    }

    private class SongList{
        private List<Song> songs;

        public SongList(){
            songs = new ArrayList<Song>();
        }

        public boolean addSong(String title, double duration){
            if(findSong(title) == null){
                this.songs.add(new Song(title, duration));
                return true;
            }
            return false;
        }

        private Song findSong(String title){

            //alternative for:
            for(Song checkedSong: this.songs){
                if(checkedSong.getTitle().equals(title)){
                    return checkedSong;
                }
            }
            return null;
        }

        public List<Song> getSongs() {
            return songs;
        }
    }



}
