package com.rx.webApplication.util;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.naming.NoNameCoder;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;

/**
 * Created by 王玉粮 on 2017/6/27.
 * xstream
 */
public class WeChatMessageUtil {

    private XStream xStream;

    /**
     * 创建默认xstream解决双下划线的问题
     * @return
     */
    public WeChatMessageUtil createDefaultXstream(){
        this.xStream = new XStream(new XppDriver(){
            public HierarchicalStreamWriter createWriter(Writer out){
                //解决下划线
                return new PrettyPrintWriter(out,new NoNameCoder());
            }
        });
        return this;
    }

    /**
     * 扩展xstream,使其支持CDATA块，解决下划线问题
     * @return
     */
    public WeChatMessageUtil createCDATAXstream(){
        this.xStream = new XStream(new XppDriver(){
            public HierarchicalStreamWriter createWriter(Writer out){
                return new PrettyPrintWriter(out,new NoNameCoder()){
                    // 对所有xml节点的转换都增加CDATA标记
                    boolean cdata = true;

                    @SuppressWarnings("unchecked")
                    public void startNode(String name,Class clazz){
                        super.startNode(name,clazz);
                    }

                    protected void writeText(QuickWriter writer,String text){
                        if(cdata){
                            writer.write("<![CDATA[");
                            writer.write(text);
                            writer.write("]]>");
                        }else {
                            writer.write(text);
                        }
                    }
                };
            }
        });
        return this;
    }

    /**
     * 是否启用注解
     * @param b
     * @return
     */
    public WeChatMessageUtil xstreamAnnotation(boolean b){
        this.xStream.autodetectAnnotations(b);
        return this;
    }

    /**
     * 去掉class属性
     * @return
     */
    public WeChatMessageUtil removeAttrClass(){
        this.xStream.aliasSystemAttribute(null,"class");
        return this;
    }

    /**
     * 一般对象转化为xml
     * @param o
     * @return
     */
    public String simpleObjectToCADTAXml(Object o){
        //设置根节点
        xStream.alias("xml",o.getClass());
        return xStream.toXML(o);
    }

    /**
     * 解析微信发过来的请求(XML)
     * @param request
     * @return
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public HashMap<String,String> parseXml(HttpServletRequest request) throws Exception{
        //将解析结果存储在HaspMap中
        HashMap<String,String> map = new HashMap<String, String>();
        // 从request中取得输入流
        InputStream inputStream = request.getInputStream();
        // 读取输入流
        SAXReader reader = new SAXReader();
        Document document = reader.read(inputStream);
        // 得到xml根元素
        Element root = document.getRootElement();
        // 得到根元素的所有子节点
        List<Element> elementList = root.elements();
        // 遍历所有子节点
        for(Element e:elementList)
            map.put(e.getName(),e.getText());
        // 释放资源
        inputStream.close();
        inputStream = null;
        return map;
    }

    /**
     * 将XML字符串转换为map
     *
     * @param s xml字符串
     * @return
     * @throws Exception
     */
    public  HashMap<String,String> parseXml(String s) throws Exception{
        // 将解析结果存储在HashMap中
        InputStream inputStream = new ByteArrayInputStream(s.getBytes("UTF-8"));
        HashMap<String,String> map = new HashMap<String, String>();
        // 读取输入流
        SAXReader reader = new SAXReader();
        Document document = reader.read(inputStream);
        // 得到xml根元素
        Element root = document.getRootElement();
        // 得到根元素的所有子节点
        List<Element> elementList = root.elements();
        // 遍历所有子节点
        for (Element e:elementList)
            map.put(e.getName(), e.getText());

        // 释放资源
        inputStream.close();
        inputStream = null;

        return map;
    }
}
