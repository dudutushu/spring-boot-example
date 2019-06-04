package org.spring.boot.common;

import java.lang.reflect.Field;

public class ListUtils {

    /** 
     * 获取指定对象的指定属性值（去除private,protected的限制） 
     *  
     * @param obj 
     *            属性名称所在的对象 
     * @param fieldName 
     *            属性名称 
     * @return 
     * @throws Exception 
     */  
    public static Object forceGetFieldValue(Object obj, String fieldName) throws Exception {  
        Field field = obj.getClass().getDeclaredField(fieldName);  
        Object object = null;  
        boolean accessible = field.isAccessible();  
        if (!accessible) {  
            // 如果是private,protected修饰的属性，需要修改为可以访问的  
            field.setAccessible(true);  
            object = field.get(obj);  
            // 还原private,protected属性的访问性质  
            field.setAccessible(accessible);  
            return object;  
        }  
        object = field.get(obj);  
        return object;  
    }


}  