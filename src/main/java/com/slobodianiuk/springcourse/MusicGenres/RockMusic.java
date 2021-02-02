package com.slobodianiuk.springcourse.MusicGenres;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    public String getSong() {
        return "Bohemian Rhapsody";
    }
}
