package com.slobodianiuk.springcourse.Devices;

import com.slobodianiuk.springcourse.MusicPlayer;
import org.springframework.beans.factory.annotation.Autowired;

//@Component
public class Computer implements Device {

    private final int id;
    private final MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        System.out.println(id + ". Computer playing: " + musicPlayer.playMusic());
    }
}