package com.boy.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Demo class
 *
 * @author boy
 * @date 2022-3-20
 * 工厂
 * 1.加载配置文件
 * 2.生产配置中记录的对应对象
 */
public class MyFactory {
    /**
     * 获取流
     *
     */
    private final static Properties PROPERTIES = new Properties();


    MyFactory(){};
    public MyFactory(String config) throws IOException {
        InputStream resourceAsStream = MyFactory.class.getResourceAsStream(config);
        //  properties 读取配置文件
        PROPERTIES.load(resourceAsStream);
    }
    public Object getBean(String name) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        /* 1.通过name 获取队对应来路径 */
        String classPath = PROPERTIES.getProperty(name);
        // 2. 反射构建对象
        Class cLaz = Class.forName(classPath);

        return cLaz.newInstance();
    }
}
