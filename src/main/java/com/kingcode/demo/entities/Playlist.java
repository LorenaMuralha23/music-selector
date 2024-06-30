package com.kingcode.demo.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Playlist {
    
    private String category;

    private List<Song> songList = new ArrayList<>();

    public Playlist() {
    }

    public Playlist(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Song> getSongList() {
        return songList;
    }

    public Song getSong(int index){
        return songList.get(index);
    }
    
 }

