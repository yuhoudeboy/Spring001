package com.boy.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

// 工厂类
// 1.加载配置文件
// 2.生产配置总记录的对应对象
// 练习
public class MyFactory {
    // 很加载properties文件
    private  Properties properties = new Properties();
    public MyFactory(){}
    public MyFactory(String config) throws IOException {
        // 获取流
        InputStream resourceAsStream = MyFactory.class.getResourceAsStream(config);
        //  properties 读取配置文件
        properties.load(resourceAsStream);
    }

    public Object getBean(String name) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // 1. 通过name,获取对应类路径
        String classPath = properties.getProperty(name);
        // 2. 反射构建对象
        Class claz = Class.forName(classPath);
        return claz.newInstance();
    }
}
