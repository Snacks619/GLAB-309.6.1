package com.perscholasGlab_30961.IocdemoApplication.myServices;


import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneServices {
//    Create an array of strings
    private String[] data = { "Beware of the wolf in sheep's clothing", "Diligence is the mother of good luck",
        "The journey is the reward"
    };
//    Create a random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
//        pick a random string frim the array
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }
}
