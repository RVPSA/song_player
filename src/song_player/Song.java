/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package song_player;

/**
 *
 * @author Akesh
 */
public class Song {
    String title;
    double duration;
    
    public Song(String title, double duration){
        this.title = title;
        this.duration = duration;
    }
    
    public Song(){}

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Songe: "+ this.title +"Duration: "+this.duration; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
