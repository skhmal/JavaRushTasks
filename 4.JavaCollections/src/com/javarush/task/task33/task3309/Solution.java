package com.javarush.task.task33.task3309;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.awt.print.Book;
import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* 
Комментарий внутри xml
*/

public class Solution {
    public static String toXmlWithComment(Object obj, String tagName, String comment) {
        String result = "";
        StringWriter writer = new StringWriter();
        try {
            JAXBContext context = JAXBContext.newInstance(obj.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(obj, writer);
            result = writer.toString();

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return result.replaceAll("<" + tagName + ">" , "<!--" + comment + "-->" + "\n" +
                "<" + tagName + ">");
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.author = "YA";
        book.count = 4544;
        book.text = "iiasoogfspdfg";
        book.name = "PETYA";
        System.out.println(toXmlWithComment(book, "text", "it's a comment"));
    }
    @XmlType(name = "book")
    @XmlRootElement
    public static class Book{
      public   int count;
      public String text;
      public String name;
      public String author;

        public Book(int count, String text, String name, String author) {
            this.count = count;
            this.text = text;
            this.name = name;
            this.author = author;
        }

        public Book() {
        }
    }
}
