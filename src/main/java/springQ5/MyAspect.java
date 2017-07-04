package springQ5;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before ("execution(* springQ5.SpringClass1.*())")
    void afterReturningAdvice() {
        System.out.println("Invoked due to 'execution'");
    }
   /* @Before ("within(springQ4.*)")
    void afterReturningAdvice1() {
        System.out.println("Invoked due to 'within'");
    }
   *//* @Before ("bean(SpringClass1)")
    void afterReturningAdvice2() {
        System.out.println("Invoked due to 'bean'");
    }*//*
    *//*@Before ("this(springQ4.SpringClass1)")
    void afterReturningAdvice3() {
        System.out.println("Invoked due to 'this'");
    }*//*
    @Before ("args(Integer)")
    void afterReturningAdvice4() {
        System.out.println("Invoked due to 'args'");
    }*/
}
