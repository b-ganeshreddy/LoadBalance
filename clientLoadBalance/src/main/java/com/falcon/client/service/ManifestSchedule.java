package com.falcon.client.service;

import com.falcon.client.util.CallApi;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class ManifestSchedule {

    private WebClient http;
    private String url;

    ManifestSchedule(WebClient http) {
        System.out.println("Manifest****************************");
        this.http = http;
        this.url = "http://api/";
    }

    public void invokeApi() {

        ExecutorService service = Executors.newFixedThreadPool(1);
        service.execute(new CallApi(http, url));
    }

}
