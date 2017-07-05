package springQ4;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before("@annotation(Deprecated)")
    public void invokeMethod()
    {
        System.out.println("Depricated Method Called Via Aspect before method call.");
    }
}
