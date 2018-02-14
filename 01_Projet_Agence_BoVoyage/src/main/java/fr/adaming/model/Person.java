package fr.adaming.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Person {

      private String name;


       public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }      

}
