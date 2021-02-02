package com.slobodianiuk.springcourse;

import com.slobodianiuk.springcourse.MusicGenres.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private final List<Music> musicList;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, JazzMusic jazzMusic, PopMusic popMusic, RockMusic rockMusic) {
        this.musicList = Arrays.asList(classicalMusic, jazzMusic, popMusic, rockMusic);
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        Random random = new Random();
        return musicList.get(random.nextInt(musicList.size())).getSong();
    }
}