/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package song_player;

import java.util.ArrayList;
import java.util.LinkedList;

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
        for(Song checkingSong : songs){//enhanced iterating method
            if(checkingSong.getTitle().equals(title)){
                return checkingSong;
            }
        }
        return null;
    }
    //add song to the album
    public boolean addToAlbum(String title, double duration){
    if(findSong(title) == null){
        songs.add(new Song(title,duration));//point of make a instance of Song class
        System.out.println("Successfully add song to album");
        return true;
    }
    else{
        System.out.println("Song already exsits in the album");
        return false;
    }
    }
    
    //add a song to playlist where it's in already in the album.
    //here I use a LinkedList because it has a feaure of storing net item and previous item. 
    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber-1; //usually indices start from the 0
        if(index >= 0 && index <= this.songs.size()){
            playlist.add(this.songs.get(index));
            return true;
        }
        else{
            System.out.println("This album does not have a song with tracknumber"
                    + trackNumber);
            return false;
        }
    }
    
}
