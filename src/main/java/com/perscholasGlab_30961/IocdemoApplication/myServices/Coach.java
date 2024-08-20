package com.perscholasGlab_30961.IocdemoApplication.myServices;


import org.springframework.stereotype.Component;

@Component
public interface Coach {

    public String getDailyWorkout();
    public String getDailyFortune();
}
