package com.falcon.client.util;

import org.springframework.web.reactive.function.client.WebClient;

public class CallApi implements Runnable {

    private WebClient http;

    private String url;

    static void call(WebClient http, String url) {
        http.get().uri(url).retrieve().bodyToMono(String.class).block();
    }

    public CallApi(WebClient http, String url) {
        this.http = http;
        this.url = url;
    }

    @Override
    public void run() {
        call(http, url);
    }
}
