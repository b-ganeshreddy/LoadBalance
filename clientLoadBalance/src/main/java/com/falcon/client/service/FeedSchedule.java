package com.falcon.client.service;

import com.falcon.client.util.CallApi;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class FeedSchedule {

    private WebClient http;
    private String url;

    FeedSchedule(WebClient http) {
        System.out.println("Feed****************************");
        this.http = http;
        this.url = "http://api/";
    }

    public void invokeApi() {

        ExecutorService service = Executors.newFixedThreadPool(20);

        for(int i = 0;i < 20;i++) {
            service.execute(new CallApi(http, url));
        }

    }



}
