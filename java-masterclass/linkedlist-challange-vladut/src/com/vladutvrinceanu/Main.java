package com.vladutvrinceanu;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
	    Album myAlbum = addAlbum("Rock", albums);
        Album newAlbum = addAlbum("Classic", albums);
	    myAlbum.addSong("It's my life", "4.32s");
        myAlbum.addSong("Hard", "3.32s");
        myAlbum.addSong("Rock life", "2.52s");
        myAlbum.addSong("Bad", "4.12s");
        newAlbum.addSong("Sonata", "7.32");
        System.out.println();
        myAlbum.printSongs();
        System.out.println();
        newAlbum.printSongs();
        System.out.println();
	    PlayList myPlayList = new PlayList("myPlayList", albums);
	    myPlayList.addSong("Rock", "It's my life");
        myPlayList.addSong("Rock", "Bad");
        myPlayList.addSong("Rock", "Hard");
        myPlayList.addSong("Classic", "Sonata");

        System.out.println();
        myPlayList.printSongs();

        System.out.println();
        startPlayList(myPlayList);


    }


    public static Album addAlbum(String albumName, ArrayList<Album> albums){
        Album album = new Album(albumName);
        albums.add(album);
        return album;
    }

    public static void startPlayList(PlayList myPlayList){
        boolean quit = false;
        boolean goForward = true;
        boolean replay = false;
        Song song;
        Scanner scanner = new Scanner(System.in);
        ListIterator<Song> listIterator = myPlayList.getSongs().listIterator();
        if(myPlayList.getSongs().isEmpty()){
            System.out.println("Playlist is empty.");
            return;
        }
        else{
            song  = listIterator.next();
            System.out.println("Now playing " + song.getTitle() + ", duration: " + song.getDuration());
            printOptions();
        }
        while(!quit) {
            int action = scanner.nextInt();
            switch (action) {
                case 0:
                    System.out.println("Exit playlist.");
                    quit = true;
                    break;
                case 1:
                    if (!goForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goForward = true;
                    }
                    if (listIterator.hasNext()) {
                        song = listIterator.next();
                        System.out.println("Now playing " + song.getTitle() + ", duration: " + song.getDuration());
                    } else {
                        System.out.println("Reached the end of the playlist");
                        goForward = false;
                    }
                    replay = !goForward;
                    break;
                case 2:
                    if (goForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        song = listIterator.previous();
                        System.out.println("Now playing " + song.getTitle() + ", duration: " + song.getDuration());
                    } else {
                        System.out.println("Reached the top of the playlist");
                        goForward = true;
                    }
                    replay = !goForward;
                    break;
                case 3:
                    if(replay){
                        if(listIterator.hasNext()){
                            song = listIterator.next();
                            System.out.println("Now replaying " + song.getTitle() + ", duration: " + song.getDuration());
                            replay = !replay;
                        }
                        else{
                            song = listIterator.previous();
                            System.out.println("Now replaying " + song.getTitle() + ", duration: " + song.getDuration());
                        }
                    }
                    else{
                        if(listIterator.hasPrevious()){
                            song = listIterator.previous();
                            System.out.println("Now replaying " + song.getTitle() + ", duration: " + song.getDuration());
                            replay = !replay;
                        }
                        else{
                            song = listIterator.next();
                            System.out.println("Now replaying " + song.getTitle() + ", duration: " + song.getDuration());
                        }
                    }
                    goForward = !replay;
                    break;
                case 4:

                    if(listIterator.hasNext()){
                        listIterator.remove();
                        System.out.println("Song " + song.getTitle() + " removed");
                        if(listIterator.hasNext()){
                            song = listIterator.next();
                            System.out.println("Now playing " + song.getTitle() + ", duration: " + song.getDuration());}}
                    else if (listIterator.hasPrevious()){
                        listIterator.remove();
                        System.out.println("Song " + song.getTitle() + " removed");
                        if(listIterator.hasPrevious()){
                        song = listIterator.previous();
                            System.out.println("Now playing " + song.getTitle() + ", duration: " + song.getDuration());}
                    }
                    else{
                        System.out.println("No songs to remove in playlist");
                    }
                    break;
                case 5:
                    myPlayList.printSongs();
                    break;
                case 6:
                    printOptions();
                    break;
            }
        }
    }

    public static void printOptions(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n"+
                "1 - skip forward\n" +
                "2 - skip backwards\n" +
                "3 - replay\n" +
                "4 - remove song\n" +
                "5 - print playlist\n" +
                "6 - exit\n");
    }
}
