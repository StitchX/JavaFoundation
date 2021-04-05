package com.jphy.lottery.plugins.ReadXml;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 用DOM4J方法读取xml文件
 *
 * @author Lance
 */
public class ReadXMLByDom4j {

    private List<BetOrder> betOrderList = null;
    private BetOrder betOrder = null;
    private List<Numbers> numbersList = null;
    private Numbers numbers = null;

    public List<BetOrder> getBetOrders(File file) {
        // 解析TestDatas.xml文件
        //创建SAXReader的对象reader
        SAXReader reader = new SAXReader();
        try {
            // 通过reader对象的read方法加载TestDatas.xml文件,获取docuemnt对象。
            Document document = reader.read(file);
            // 通过document对象获取根节点betOrderStore
            Element betOrderStore = document.getRootElement();
            // 通过element对象的elementIterator方法获取迭代器
            Iterator storeIt = betOrderStore.elementIterator();

            betOrderList = new ArrayList();
            while (storeIt.hasNext()) {
                betOrder = new BetOrder();
                Element betOrderElement = (Element) storeIt.next();
                //遍历betOrderElement的属性名和属性值
                List<Attribute> attributes = betOrderElement.attributes();
                for (Attribute attribute : attributes) {
                    //if(attribute.getName().equals("orderId")){
                    //    String orderId = attribute.getValue();//System.out.println(orderId);
                    //    betOrder.setOrderId(Integer.parseInt(orderId));
                    //}
                    System.out.println("属性名：" + attribute.getName() + "--属性值：" + attribute.getValue());
                }

                Iterator betOrderIt = betOrderElement.elementIterator();
                while (betOrderIt.hasNext()) {
                    Element child = (Element) betOrderIt.next();
                    String nodeName = child.getName();
                    if (nodeName.equals("user_id")) {
                        Integer user_id = Integer.valueOf(child.getStringValue());
                        betOrder.setUser_id(user_id);
                    } else if (nodeName.equals("betRange")) {
                        String name = child.getStringValue();
                        betOrder.setBetRange(name);
                    } else if (nodeName.equals("playType")) {
                        String playType = child.getStringValue();
                        betOrder.setPlayType(playType);
                    } else if (nodeName.equals("betContent")) {
                        String betContent = child.getStringValue();
                        betOrder.setBetContent(betContent);
                    } else if (nodeName.equals("mutiple")) {
                        Integer mutiple = Integer.valueOf(child.getStringValue());
                        betOrder.setMutiple(mutiple);
                    } else if (nodeName.equals("amount")) {
                        String amount = child.getStringValue();
                        betOrder.setAmount(amount);
                    } else if (nodeName.equals("spend")) {
                        String spend = child.getStringValue();
                        betOrder.setSpend(spend);
                    } else if (nodeName.equals("drawnAmount")) {
                        String drawnAmount = child.getStringValue();
                        betOrder.setDrawnAmount(drawnAmount);
                    } else if (nodeName.equals("resultNum")) {
                        String resultNum = child.getStringValue();
                        betOrder.setDrawnAmount(resultNum);
                    } else if (nodeName.equals("balance")) {
                        String balance = child.getStringValue();
                        betOrder.setBalance(balance);
                    }
                }
                betOrderList.add(betOrder);
                betOrder = null;
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return betOrderList;
    }

    public List<Numbers> getNumbers(File file) {
        // 解析TestDatas.xml文件
        //创建SAXReader的对象reader
        SAXReader reader = new SAXReader();
        try {
            // 通过reader对象的read方法加载TestDatas.xml文件,获取docuemnt对象。
            Document document = reader.read(file);
            // 通过document对象获取根节点betOrderStore
            Element numberStore = document.getRootElement();
            // 通过element对象的elementIterator方法获取迭代器
            Iterator storeIt = numberStore.elementIterator();

            numbersList = new ArrayList();
            while (storeIt.hasNext()) {
                numbers = new Numbers();
                Element numberElement = (Element) storeIt.next();
                //遍历betOrderElement的属性名和属性值
                List<Attribute> attributes = numberElement.attributes();
                for (Attribute attribute : attributes) {
                    //if(attribute.getName().equals("orderId")){
                    //    String orderId = attribute.getValue();//System.out.println(orderId);
                    //    betOrder.setOrderId(Integer.parseInt(orderId));
                    //}
                    System.out.println("属性名：" + attribute.getName() + "--属性值：" + attribute.getValue());
                }

                Iterator numberIt = numberElement.elementIterator();
                while (numberIt.hasNext()) {
                    Element child = (Element) numberIt.next();
                    String nodeName = child.getName();
                    if (nodeName.equals("number")) {
                        String number = child.getStringValue();
                        numbers.setNumber(number);
                    } else if (nodeName.equals("resultNum")) {
                        String resultNum = child.getStringValue();
                        numbers.setResultNum(resultNum);
                    }
                }
                numbersList.add(numbers);
                numbers = null;
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return numbersList;
    }
}
