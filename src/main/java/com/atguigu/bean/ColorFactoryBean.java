package com.atguigu.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author JiangBin
 * @create 2020-05-09 22:07
 */
public class ColorFactoryBean implements FactoryBean<Color> {
    @Override
    public Color getObject() throws Exception {
        System.out.println("ColorFactoryBean...getObject...");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
