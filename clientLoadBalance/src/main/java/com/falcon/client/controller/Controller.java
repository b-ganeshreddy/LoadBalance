package com.falcon.client.controller;

import com.falcon.client.service.FeedSchedule;
import com.falcon.client.service.ManifestSchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    FeedSchedule feedSchedule;

    @Autowired
    ManifestSchedule manifestSchedule;

    @GetMapping("/")
    public void start() {
        System.out.println("ggggggggggggggggg");
        feedSchedule.invokeApi();
    }
}
