package com.homegate.telsearch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.homegate.telsearch.service.TelSearchApiClient;

@SpringBootApplication
public class TelSearchApplication implements CommandLineRunner {

    private static Logger LOG = LoggerFactory.getLogger(TelSearchApplication.class);

    private TelSearchApiClient client;

    @Autowired
    TelSearchApplication(TelSearchApiClient client) {
        this.client = client;
    }

    @Override
    public void run(String... args) {
        if (args.length != 1) {
            LOG.error("You must provide the phone number as an argument");
        } else {
            String phoneNumber = args[0];
            boolean isValidPoneNumber = client.isValidPhoneNumber(phoneNumber);
            LOG.info("The phone number '{}' is {}", phoneNumber, isValidPoneNumber ? "valid" : "invalid");
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(TelSearchApplication.class, args);
    }
}
