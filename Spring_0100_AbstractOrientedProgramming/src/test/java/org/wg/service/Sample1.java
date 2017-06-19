package org.wg.service;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

import java.util.List;

public class Sample1 {
    public static void main(String[] args) throws Exception {
        SAXBuilder sb = new SAXBuilder();

        Document doc = sb.build(Sample1.class.getClassLoader().getResourceAsStream("test.xml")); //构造文档对象
        Element root = doc.getRootElement(); //获取根元素HD
        List list = root.getChildren("disk");//取名字为disk的所有元素
        for (int i = 0; i < list.size(); i++) {
            Element element = (Element) list.get(i);
            String capacity = element.getChildText("capacity");//ȡdisk��Ԫ��capacity������
            String directories = element.getChildText("directories");
            String files = element.getChildText("files");
            System.out.println("capacity: " + capacity);
            System.out.println("directories: " + directories);
            System.out.println("files: " + files);
            System.out.println("-----------------------------------");
        }
    }
} 