package com.dantask01;

import com.dantask01.entities.Employee;
import org.beanio.BeanReader;
import org.beanio.StreamFactory;

import java.io.File;



public class BReader {

    private static final String path = "/home/vojta/Documents/development/java//dantask01/src/main/java/com/dantask01/";

    public static void main(String[] args) {

        StreamFactory factory = StreamFactory.newInstance();
        factory.load(path+"mapping.xml");



        BeanReader in = factory.createReader("employeeFile", new File(path+"employeeFile.csv"));
        Employee employee;
        employee = (Employee) in.read();
        System.out.println(employee);
    }
}
