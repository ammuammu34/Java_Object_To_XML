package com.ashokit.xml;

import java.io.File;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.ashokit.dto.Employee;

public class ObjectToXML {
	public static void jaxObjectToXML(Employee emp) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
			
			Marshaller jaxbMarsheller = jaxbContext.createMarshaller();
			
			jaxbMarsheller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
			
			File file = new File("C:\\\\html notes\\\\Employee.XML");
			
			jaxbMarsheller.marshal(emp, file);
		   }
		  catch (JAXBException e)
		{
			e.printStackTrace();
		
		}
	}

	
	
	
}
