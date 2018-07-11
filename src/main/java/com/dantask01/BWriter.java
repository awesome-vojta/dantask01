package com.dantask01;

import com.dantask01.entities.Employee;
import org.beanio.BeanWriter;
import org.beanio.StreamFactory;

import java.io.File;
import java.util.Date;

public class BWriter {

    private static final String path = "/home/vojta/Documents/development/java//dantask01/src/main/java/com/dantask01/";

    public static void main(String[] args) throws Exception {
        // create a StreamFactory
        StreamFactory factory = StreamFactory.newInstance();
        // load the mapping file
        factory.load(path+"mapping.xml");

        Employee employee = new Employee();
        employee.setFirstName("Jennifer");
        employee.setLastName("Jones");
        employee.setTitle("Marketing");
        employee.setSalary(60000);
        employee.setHireDate(new Date());

        // use a StreamFactory to create a BeanWriter
        BeanWriter out = factory.createWriter("employeeFile", new File(path+"employeeFile.csv"));
        // write an Employee object directly to the BeanWriter
        out.write(employee);
        out.flush();
        out.close();
    }
}
