package springQ1;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before("execution(* springQ1.SpringClass1.*())")
    public void invokeMethod()
    {
        System.out.println("Method Called Through Aspect.");
    }
}
