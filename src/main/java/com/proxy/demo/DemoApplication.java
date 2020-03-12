package com.proxy.demo;

import com.proxy.demo.Service.Counter;
import com.proxy.demo.Service.KeyValue;
import com.proxy.demo.Service.NormalizeUrl;
import com.proxy.demo.Service.UrlShortner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DemoApplication {

	@Bean
	public UrlShortner geturlshortner(){
		return new UrlShortner(new NormalizeUrl(),new KeyValue());
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
