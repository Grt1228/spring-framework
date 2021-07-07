package com.rt.util;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

/**
 * 描述：
 *
 * @author grt
 * @date 2020-05-20
 */
public class BeanFactory {

	public BeanFactory(String xml){
		parseXml(xml);
	}

	public void parseXml(String xml){
//		SAXReader reader = new SAXReader();
//		Document document = reader.read(url);
//		return document;
	}


	public Object getBean(String beanName){
		return null;
	}
}
