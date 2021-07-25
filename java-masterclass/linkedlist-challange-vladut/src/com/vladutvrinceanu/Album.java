package com.vladutvrinceanu;

import java.util.ArrayList;

public class Album {
    private String albumName;
    private ArrayList<Song> songs;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songs = new ArrayList<Song>();
    }

    public String getAlbumName() {
        return albumName;
    }


    public ArrayList<Song> getSongs() {
        return songs;
    }

    public boolean addSong(String songName, String duration){
        if(!(findSong(songName) == null)){
            System.out.println("Song " + songName + " already exists in album " + this.albumName);
            return false;
        }
        Song song = new Song(songName, duration);
        songs.add(song);
        System.out.println("Song " + songName + " with duraton: " + duration + " added in " + this.albumName);
        return true;
    }

    public Song findSong(String songName){
        for(int i = 0; i < this.songs.size(); i++){
            Song song = songs.get(i);
            if(song.getTitle() == songName){
                return song;
            }
        }
        return null;
    }

    public void printSongs(){
        System.out.println("Album " + this.albumName + " songs: ");
        for(int i = 0; i<songs.size();i++){
            Song song = songs.get(i);
            System.out.println("Song [" + (i+1) + "]: " + song.getTitle() + ", duration: " + song.getDuration());
        }
    }
}
