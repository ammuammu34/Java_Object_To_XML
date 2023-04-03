package com.ashokit.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.ashokit.dto.Employee;

public class XMLToObject {

public static void jaxbXmlFileToObject(String fileName) {
		
		File xmlFile =new File(fileName);
		
		JAXBContext jaxbContext;
		
		try {
			jaxbContext = JAXBContext.newInstance(Employee.class);
			
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			
			Employee e = (Employee)unmarshaller.unmarshal(xmlFile);
			
			System.out.println(e);
		}
			catch(JAXBException e) {
				e.printStackTrace();
				
			}
		}
}