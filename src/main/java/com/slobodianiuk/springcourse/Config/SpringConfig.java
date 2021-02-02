package com.slobodianiuk.springcourse.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com/slobodianiuk.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

//
//    @Bean
//    public JazzMusic jazzMusic() {
//        return new JazzMusic();
//    }
//
//    @Bean
//    public PopMusic popMusic() {
//        return new PopMusic();
//    }
//
//    @Bean
//    public RockMusic rockMusic() {
//        return new RockMusic();
//    }
//
//    @Bean
//    public ClassicalMusic classicalMusic() {
//        return new ClassicalMusic();
//    }
//
//    @Bean
//    public List<Music> musicList() {
//        return Arrays.asList(popMusic(), classicalMusic(), rockMusic(), jazzMusic());
//    }
//
//    @Bean
//    public MusicPlayer musicPlayer() {
//        return new MusicPlayer(musicList());
//    }
//
//    @Bean
//    public Computer computer() {
//        return new Computer(musicPlayer());
//    }

}