package com.slobodianiuk.springcourse.Devices;

import com.slobodianiuk.springcourse.MusicPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SmartPhone implements Device {

    private final int id;
    private final MusicPlayer musicPlayer;

    @Autowired
    public SmartPhone(MusicPlayer musicPlayer) {
        this.id = 2;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        System.out.println(id + ". Smartphone playing: " + musicPlayer.playMusic());
    }
}
