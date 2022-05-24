/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package song_player;

import java.util.ArrayList;

/**
 *
 * @author Akesh
 */
public class album {
    private String title;
    private double duration;
    private ArrayList<Song> songs; //list of an array from the class 'song'
    
    public album(String title, double duration, ArrayList<Song> songs){
        this.title =  title;
        this.duration = duration;
        this.songs = new ArrayList<Song>();
    }
    
    public album(){}
    
    private Song findSong(String title){
        for(Song checkingSong : songs){
            if(checkingSong.getTitle().equals(title)){
                return checkingSong;
            }
        }
        return null;
    }
    
    public boolean addSong(String title, double duration){
    if(findSong(title) == null){
        songs.add(new Song(title,duration));
        System.out.println("Successfully add song to album");
        return true;
    }
    else{
        System.out.println("Song already exsits in the album");
        return false;
    }
    }
}
