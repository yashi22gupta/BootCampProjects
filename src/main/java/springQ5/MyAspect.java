package springQ5;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before ("execution(* springQ5.SpringClass1.*())")
    void afterReturningAdvice() {
        System.out.println("Invoked before due to 'execution'");
    }
    @Before ("within(springQ5.*)")
    void afterReturningAdvice1() {
        System.out.println("Invoked  before due to 'within'");
    }
    @Before ("bean(springClass1)")
    void afterReturningAdvice2() {
        System.out.println("Invoked before  due to 'bean'");
    }
    @Before ("this(springQ5.SpringClass1)")
    void afterReturningAdvice3() {
        System.out.println("Invoked  before due to 'this'");
    }
    @Before ("args(Integer)")
    void afterReturningAdvice4() {
        System.out.println("Invoked  before due to 'args'");
    }

    @After("execution(* springQ5.SpringClass1.*())")
    void afterReturningAdvice5() {
        System.out.println("Invoked after due to 'execution'");
    }
    @After ("within(springQ5.*)")
    void afterReturningAdvice6() {
        System.out.println("Invoked after due to 'within'");
    }
    @After ("bean(SpringClass1)")
    void afterReturningAdvice7() {
        System.out.println("Invoked after due to 'bean'");
    }
    @After ("this(springQ5.SpringClass1)")
    void afterReturningAdvice8() {
        System.out.println("Invoked after due to 'this'");
    }
    @After ("args(Integer)")
    void afterReturningAdvice9() {
        System.out.println("Invoked after due to 'args'");
    }
}
