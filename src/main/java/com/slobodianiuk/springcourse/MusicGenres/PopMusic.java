package com.slobodianiuk.springcourse.MusicGenres;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music {
    public String getSong() {
        return "It must have been love";
    }
}
