package com.vladutvrinceanu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class PlayList {
    private String name;
    private ArrayList<Album> albums;
    private LinkedList<Song> songs;

    public LinkedList<Song> getSongs() {
        return songs;
    }

    public PlayList(String name, ArrayList<Album> albums) {
        this.name = name;
        this.songs = new LinkedList<Song>();
        this.albums = albums;
    }

    public boolean addSong(String albumName, String songName){
        Album album = findAlbum(albumName);
        if(album == null){
            System.out.println("Album with name " + albumName + " does not exists.");
            return false;
        }
        Song song = album.findSong(songName);
        if(song == null){
            System.out.println("Song with name " + songName + " does not exist in album " + albumName);
            return false;
        }
        songs.add(song);
        System.out.println("Song with name " + songName + " and duration " + song.getDuration() + " added to " + this.name);
        return true;
    }

    public void printSongs(){
        ListIterator<Song> listIterator = this.songs.listIterator();
        System.out.println(this.name + " songs: ");
        while(listIterator.hasNext()){
            Song song = listIterator.next();
            System.out.println("Song : " + song.getTitle() + ", duration: " + song.getDuration());
        }
    }

    private Album findAlbum(String albumNme){
        for(int i = 0; i < this.albums.size(); i++){
            Album  album = albums.get(i);
            if(album.getAlbumName() == albumNme){
                return album;
            }
        }
        return null;
    }

}
