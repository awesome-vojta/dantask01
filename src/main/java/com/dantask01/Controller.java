package com.dantask01;

import com.dantask01.entities.Employee;
import org.apache.commons.lang.StringEscapeUtils;
import org.beanio.BeanReader;
import org.beanio.StreamFactory;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;



@RestController
public class Controller {
    private final String string = "<?xml version=\"1.0\"?>\n" +
            "<employeeFile>\n" +
            "  <employee>\n" +
            "    <firstName>Joe</firstName>\n" +
            "    <lastName>Smith</lastName>\n" +
            "    <title>Developer</title>\n" +
            "    <salary>75000</salary>\n" +
            "    <hireDate>2009-10-12</hireDate>\n" +
            "  </employee>\n" +
            "  <employee>\n" +
            "    <firstName>Jane</firstName>\n" +
            "    <lastName>Doe</lastName>\n" +
            "    <title>Architect</title>\n" +
            "    <salary>80000</salary>\n" +
            "    <hireDate>2008-01-15</hireDate>\n" +
            "  </employee>\n" +
            "  <employee>\n" +
            "    <firstName>Jon</firstName>\n" +
            "    <lastName>Andersen</lastName>\n" +
            "    <title>Manager</title>\n" +
            "    <salary>85000</salary>\n" +
            "    <hireDate>2007-03-18</hireDate>\n" +
            "  </employee>\n" +
            "</employeeFile>";

    @RequestMapping(value = "/xml")
    public String postXML(ModelMap modelMap) throws Exception {
        return StringEscapeUtils.escapeHtml(string);
    }

}
