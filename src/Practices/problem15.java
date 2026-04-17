package Practices;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;

//Write a Java program to create a class called "MusicLibrary"
// with a collection of songs and methods to add and remove songs,
// and to play a random song.
class MusicLibrary{
    private static ArrayList musics;

    public MusicLibrary(){
        musics = new ArrayList();
    }
    public void addMusic(String m){
        musics.add(m);
    }
    public void removeMusic(String m){
        musics.remove(m);
    }
    public ArrayList getMusics(){
        return musics;
    }
    public void playMusic(String m){
        System.out.println(m+" is played");
    }
}
public class problem15 {
    public static void main(String[] args) {
        MusicLibrary musicList = new MusicLibrary();
        musicList.addMusic("Tare ami chuye dekhini");
        musicList.addMusic("All I think they called this love");
        musicList.addMusic("Ami tomay na dekhi , tumi amar na hou");
        musicList.addMusic("Sitaree");
        for(Object m : musicList.getMusics()){
            System.out.println(m);
        }
        musicList.playMusic("Sitaree");
    }
}
