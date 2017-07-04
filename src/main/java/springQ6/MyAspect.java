package springQ6;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {

    @Before("displayPointcut()")
    void beforeAdvice() {
        System.out.println("Running before advice");
    }

    @After("displayPointcut()")
    void afterAdvice(){
        System.out.println("Running after advice");
    }

    @Pointcut("execution(void display())")
    void displayPointcut(){}

}
