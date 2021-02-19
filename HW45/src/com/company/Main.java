package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        mathFramework(Arithmetic.class);
    }
    static void mathFramework(Class... classes){
        for (Class clazz: classes) {
            Method[] methods = clazz.getMethods();
            for (Method method: methods) {
                if(method.isAnnotationPresent(Math.class)){
                    Math math = method.getAnnotation(Math.class);
                    int a = math.a();
                    int b = math.b();
                    Class declaringClass = method.getDeclaringClass();
                    try {
                        method.invoke(declaringClass.newInstance(), a, b);
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
