package com.slobodianiuk.springcourse.MusicGenres;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {

    public String getSong() {
        return "I put a spell on you";
    }
}
