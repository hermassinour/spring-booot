package com.springboot.utils;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

public class ConvertObjectToXml {
    public static String convertObjectToXml(Object obj) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(obj.getClass());
            java.io.StringWriter sw = new java.io.StringWriter();
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(obj, sw);
            return sw.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
