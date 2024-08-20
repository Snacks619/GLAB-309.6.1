package com.perscholasGlab_30961.IocdemoApplication.myServices;


import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneServices{

    @Override
    public String getFortune(){
        return "Today is your Lucky Day";
    }
}
