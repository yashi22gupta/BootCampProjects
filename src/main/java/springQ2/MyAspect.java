package springQ2;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before("execution(* springQ2.SpringClass1.*())")
    public void invokeMethod()
    {
        System.out.println("Before Method Calling.");
    }

    @After("execution(* springQ2.SpringClass1.*())")
    public void invokeMethod1()
    {
        System.out.println("After Method Calling.");
    }
}
