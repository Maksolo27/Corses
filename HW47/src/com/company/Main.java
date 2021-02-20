package com.company;

import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        calculatorDoc(Calculator.class);
    }
    public static void calculatorDoc(Class... classes){
        for (Class clazz: classes) {
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                if(method.isAnnotationPresent(Documented.class)){
                    Documented documented = method.getAnnotation(Documented.class);
                    System.out.println(documented.doc());
                    int a = documented.a();
                    int b = documented.b();
                    Class declaringClass = method.getDeclaringClass();
                    try{
                        method.invoke(declaringClass.newInstance(), a, b);
                    }catch (InstantiationException e){
                        e.printStackTrace();
                    }catch (IllegalAccessException e){
                        e.printStackTrace();
                    }catch (InvocationTargetException e){
                        e.printStackTrace();
                    }
                }

            }
        }
    }
}
