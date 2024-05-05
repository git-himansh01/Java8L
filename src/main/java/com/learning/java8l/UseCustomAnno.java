package com.learning.java8l;

import ch.qos.logback.core.encoder.JsonEscapeUtil;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Arrays;

public class UseCustomAnno {
    public static void main(String[] args) {
        //Get the CustomAnno class object
        Class<CustomAnno> classData = CustomAnno.class;

        //Check if class has our own custom annotation
        if(classData.isAnnotationPresent(MyCustomAnnotation.class));
        {
            //get the custom annotation instance
            MyCustomAnnotation annotation = classData.getAnnotation(MyCustomAnnotation.class);
            System.out.println("Priority " + annotation.priority());
            System.out.println("Tags" + Arrays.toString(annotation.tags()));
        }
        //Iterate over the methods in CustomAnno

        for(Method method : classData.getDeclaredMethods()) {
                //Check if class has our own custom annotation
            if(method.isAnnotationPresent(MyCustomAnnotation.class)){
                //get the custom annotation instance
                MyCustomAnnotation annotation = classData.getAnnotation(MyCustomAnnotation.class);
                System.out.println("Method "+method.getName());
                System.out.println("Priority " + annotation.priority());
                System.out.println("Tags" + Arrays.toString(annotation.tags()));
            }
        }

    }

}

@Target({ElementType.TYPE_USE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyCustomAnnotation {
    int priority();
    String[] tags();
}
