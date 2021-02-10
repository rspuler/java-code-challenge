package com.homegate.telsearch.service;

import org.springframework.stereotype.Component;

@Component
public class TelSearchApiClient {

    /**
     * Checks phone number with the tel.search.ch API
     * @param phoneNumber phone number to check
     * @return {@code true} if phone number if valid or {@code false} if it is a call center number
     */
    public boolean isValidPhoneNumber(String phoneNumber) {
        // TODO implement
        return false;
    }
}
