package main.java.com.nagarro.remotelearning;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MyInvocationHandler implements InvocationHandler {
    private static Logger logger = new Logger();

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        logger.log("Method: " + method.getName());
        logger.log("Object type: " + method.getDeclaringClass().getSimpleName());
        logger.log("Parameters: " + Arrays.toString(args));
        logger.log("Return type: " + method.getReturnType());
        logger.log("##############################");

        return 1;
    }
}
