package spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before("execution(* spring.SpringClass1.*())")
    public void invokeMethod()
    {
        System.out.println("METHOD CALLED");
        System.out.println("Method Called Through Aspect.");
    }
}
