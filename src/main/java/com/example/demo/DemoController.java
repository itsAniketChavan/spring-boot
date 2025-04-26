package com.example.demo;


import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    List<String> teams = new ArrayList<>();
    List<String> users = new ArrayList<>();

    @GetMapping("/health")
    public String checkSystem(){

        return "System is Running...";
    }

    @GetMapping("/teams/all")
    public List<String> getteamsList(){
        teams.add("Prices");
        teams.add("Security");
        teams.add("BAU");
        teams.add("Automation");
        teams.add("Deployment");

        return teams;
    }

    @GetMapping("/teams/{teamName}")
    public List<String> getTeamsUsers(@PathVariable String teamName){

        users.add("harshad");
        users.add("Omesh");
        users.add("Aniket");

        return users;

    }


}
