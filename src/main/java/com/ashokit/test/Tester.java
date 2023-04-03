package com.ashokit.test;

import com.ashokit.xml.ObjectToXML;
import com.ashokit.xml.XMLToObject;

public class Tester {

	public static void main(String[] args) {

			
			//Employee emp = new Employee(1,"Ravali",35000.0,1165);
				
			//	ObjectToXML.jaxObjectToXML(emp);
				
			String fileName = "C:\\html notes\\Employee.XML";
				
			XMLToObject.jaxbXmlFileToObject(fileName);
				}

	}

