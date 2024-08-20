package com.perscholasGlab_30961.IocdemoApplication.myServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("databaseFortuneService")
    private FortuneServices fortuneServices;

    public TennisCoach() {
//        This is default constructor
    }

    public TennisCoach(FortuneServices theFortuneService) {
        fortuneServices = theFortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneServices.getFortune();
    }
}
