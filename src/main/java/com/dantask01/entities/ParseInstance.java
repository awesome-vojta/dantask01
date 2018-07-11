package com.dantask01.entities;


import org.beanio.StreamFactory;
import org.beanio.Unmarshaller;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class ParseInstance {

    private static final String path = "/home/vojta/Documents/development/java/dantask01/src/main/java/com/dantask01/";

    public static void main(String[] args) throws IOException {

        // Get xml
        Document d = Jsoup.connect("http://localhost:8080/xml").get();
        System.out.println(d.body().text());

        // Instantiate Employee via xml
        StreamFactory factory = StreamFactory.newInstance();
        factory.load(path+"mapping.xml");
        Unmarshaller unmarshaller = factory.createUnmarshaller("employeeFile");
        Employee e = (Employee) unmarshaller.unmarshal(d.body().text());
        System.out.println(e.getFirstName());
    }
}
