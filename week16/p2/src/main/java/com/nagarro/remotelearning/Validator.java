package com.nagarro.remotelearning;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Validator {
    public static boolean validate(String className) {
        String fullyQualifiedClassName = Validator.class.getPackage().getName() + "." + className;

        try {
            Class<?> classForValidate = Class.forName(fullyQualifiedClassName);
            Class<?> parentClass = classForValidate.getSuperclass();

            System.out.println("Validate class: " + className);

            boolean fieldIsValid = validateFields(classForValidate);
            if (!fieldIsValid) {
                return false;
            }

            boolean methodIsValid = validateMethods(classForValidate);
            if (!methodIsValid) {
                return false;
            }

            if (parentClass != null && !parentClass.getName().equals("java.lang.Object")) {
                System.out.println("Validate parent class: " + parentClass.getSimpleName() + " of class: " + className);
                return validate(parentClass.getSimpleName());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
            return false;
        }
        return true;
    }

        private static boolean validateFields(Class<?> clazz) {
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                if (!isLowerCase(field.getName())) {
                    System.out.println("Field '" + field.getName() + "' doesn't start with lowercase letter");
                    return false;
                }

                if (field.getModifiers() != Modifier.PRIVATE) {
                    System.out.println("Field '" + field.getName() + " doesn't have private modifier");
                    return false;
                }
            }
            return true;
        }

        private static boolean validateMethods(Class<?> clazz) {
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                if (!isLowerCase(method.getName())) {
                    System.out.println("Method '" + method.getName() + "' doesn't start with a lowercase letter");
                    return false;
                }
            }
            return true;
        }

        private static boolean isLowerCase(String str) {
            return Character.isLowerCase(str.charAt(0));
        }
    }

