package com.kingcode.demo.controller;

import com.kingcode.demo.entities.Playlist;
import com.kingcode.demo.entities.Song;
import java.util.Random;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    
    private Playlist playlist = new Playlist();
    private Random randomGenerator = new Random();
    
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/randomize")
    public Song randomizeSong(){
        if (playlist.getSongList().isEmpty()) {
            seeding();
        }
        int randomNum = this.randomGenerator.nextInt(10);
        
        return playlist.getSong(randomNum);
    }
    
    public void seeding(){
        Song song1 = new Song("Chris Brown", "Forever");
        Song song2 = new Song("Pitbull feat. Ne-Yo", "Give Me Everything");
        Song song3 = new Song("Black Eyed Peas", "I Gotta Feeling");
        Song song4 = new Song("We Found Love feat. Calvin Harris", "Rihanna");
        Song song5 = new Song("Lady Gaga", "Judas");
        Song song6 = new Song("Flo Rida", "Club Can't Handle Me");
        Song song7 = new Song("Britney Spears", "I Wanna Go");
        Song song8 = new Song("Justin Bieber", "Baby");
        Song song9 = new Song("Katy Perry", "Hot N Cold");
        Song song10 = new Song("Akon", "Don't Matter");
        
        playlist.getSongList().add(song1);
        playlist.getSongList().add(song2);
        playlist.getSongList().add(song3);
        playlist.getSongList().add(song4);
        playlist.getSongList().add(song5);
        playlist.getSongList().add(song6);
        playlist.getSongList().add(song7);
        playlist.getSongList().add(song8);
        playlist.getSongList().add(song9);
        playlist.getSongList().add(song10);
    }
}
