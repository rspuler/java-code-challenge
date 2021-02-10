# tel.search.ch coding callenge

This is a simple SpringBoot command line application which checks whether a swiss phone number
that is given to the application as a command line argument is a legit private/business number or 
is the number of a call center.

The application can be compiled and run with:

```
./mvnw spring-boot:run -Dspring-boot.run.arguments=<the phone number>
```

It will log to the console whether the phone number is legit (=valid) or is a 
call center number (=invalid).

## Tasks

1. Implement the `isValidPhoneNumber` method in class `TelSearchApiClient`. Use the API of 
   https://tel.search.ch/api/help.en.html to figure out if a phone number is a call center.
2. Create an integration test for the class
3. Create a unit test for the class

Tests can be run with:
```
./mvnw test
```

