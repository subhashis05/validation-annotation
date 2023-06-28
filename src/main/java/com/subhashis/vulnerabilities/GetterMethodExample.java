package com.subhashis.vulnerabilities;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GetterMethodExample {
    	public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
            // Example target object
            Person person = new Person("John", 25);

            // Get the Class object for the target object's class
            Class<?> clazz = person.getClass();

            // Field name
            String fieldName = "age";

            // Get the Field object corresponding to the field name
            Field field = clazz.getDeclaredField(fieldName);

            // Get the name of the getter method
            String getterMethodName = "get" + capitalize(fieldName);

            // Get the Method object representing the getter method
            Method getterMethod = clazz.getMethod(getterMethodName);

            // Invoke the getter method on the target object
            Object result = getterMethod.invoke(person);

            // Print the result
            System.out.println(result);
        }

        private static String capitalize(String str) {
            if (str == null || str.isEmpty()) {
                return str;
            }
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
    }

    class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
}

