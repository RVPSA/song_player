/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package song_player;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
/**
 *
 * @author Akesh
 */
public class main {
    public static void main(String args[]){
        
        Album album1 = new Album("Jeewithe","Manasinghe");
        
        album1.addToAlbum("Mage Jeewithe", 4.5);
        album1.addToAlbum("Hadakari", 3.5);
        album1.addToAlbum("Amma mage", 5.0);
        
        LinkedList<Song> playList_1 = new LinkedList<Song>();
        
        album1.addToPlaylist("Hadakari", playList_1);
        album1.addToPlaylist("Amma mage", playList_1);
        album1.addToPlaylist("Mage Jeewithe", playList_1);
        
        play(playList_1);
        
    }
    
    private static void play(LinkedList<Song> playList){
        Scanner input = new Scanner(System.in);
        ListIterator<Song> listIterator = playList.listIterator();
        Boolean exit= false;
        
        if(playList.size() == 0){
            System.out.println("Play list have no song");
        }else{
            System.out.println("Now playing "+ listIterator.next().toString());
            printMenu();
        }
        
        while(!exit){
            int answer = input.nextInt();
            
            switch(answer){
                case 0:
                    System.out.println("Play list complete");
                    exit=true;
                    break;
                    
                case 1:
                    if(listIterator.hasNext()){
                            System.out.println("Now playing "+ listIterator.next().toString());
                    }else{
                        System.out.println("No next");
                    }
                    break;
                case 2:
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing "+listIterator.previous().toString());
                    }else{
                        System.out.println("No previous");
                    }
                    break;
                case 3:
                    System.out.println("Now playing "+listIterator.previous().toString());
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing"+listIterator.next().toString());
                        }
                        else{
                            if(listIterator.hasPrevious()){
                                System.out.println("Now playing"+listIterator.previous().toString());
                            }
                        }
                    }
            }
                
        }
        
    
    }
    
    private static void printMenu(){
        System.out.println("Avaliable option\n press relevent number");
        System.out.println("0 - Quit\n"+
                "1 - play next song\n"+
                "2 - play previous song\n"+
                "3 - play currentsong again\n"+
                "4 - List all songs\n"+
                "5 - Print all avaliable options\n"+
                "6 - Delete song");
    }
    
    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("-----------------------");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-----------------------");
    }
    
}
