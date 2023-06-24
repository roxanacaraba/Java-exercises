package main.java.com.nagarro.remotelearning;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MyInvocationHandler implements InvocationHandler {
    private static final Logger logger = new Logger();

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        if(method.isAnnotationPresent(LoggerAnnotation.class) || CalculatorInterface.class.isAnnotationPresent(LoggerAnnotation.class)) {
            logger.log("Method: " + method.getName());
            logger.log("Object type: " + method.getDeclaringClass().getSimpleName());
            logger.log("Parameters: " + Arrays.toString(args));
            logger.log("Return type: " + method.getReturnType());
            logger.log("##############################");
            return 1;
        }
        return 0;
    }
}
