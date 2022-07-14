package com.example.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LearnApplication.class, args);

        /*  we are creating object by new keyword, hence getDetails() output is showing as expected: */
//        City delhi = new City("Commercial street", " M Johnson", 12500);
//        delhi.getDetails();

        /*  we will get an exception saying getBean() won't be able to find a bean of type learn.City:
            and hence @Component annotation is used to create City class object spring container
         */
//        City agra = context.getBean(City.class);
//        agra.setStreet("Cubbon street");
//        agra.getDetails();

        Country india = context.getBean(Country.class);
        india.getDisplay();

        System.out.println("first Application");
    }
}
