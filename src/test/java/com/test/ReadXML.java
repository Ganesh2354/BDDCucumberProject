package com.test;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXML {
	
	public static Object getXMLData() throws Exception
	{
		String path="C:\\Users\\Ganesh Dandekar\\Devils\\EclipseNew\\FacebookBDD\\TestXMLData\\FBTestData.xml";
	    File file=new File(path);	    
	    DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();	    
	    DocumentBuilder db=dbf.newDocumentBuilder();	    
	    Document doc=db.parse(file);	    
	    doc.getDocumentElement().normalize();
	    NodeList node=doc.getDocumentElement().getElementsByTagName("xpath");	    
//	    int nodelen=node.getLength();
	    
	    
	    	Node n=node.item(0);
	    	Element el=(Element)n;
	    	return el;
	    
	}
	
	@Test
	
	public void getDta() throws Exception
	{
		System.out.println(ReadXML.getXMLData());
	}

}
