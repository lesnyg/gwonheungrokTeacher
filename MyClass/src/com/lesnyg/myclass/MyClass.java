package com.lesnyg.myclass;

public class MyClass implements MyInterface1{
    @Override
    public void onClick() {

    }
}

interface MyInterface1{
 void onClick(); //abstract method == abstract void myInterfaceMethod1()
}
class MyClass2 implements MyInterface1{
    @Override
    public void onClick() {
        System.out.println("onClick call");
    }
}

abstract class absClass1{
    public void method1(){
        System.out.println("method1() method1()");
    }
    public void method2(){System.out.println("method1() method2()"); }

}
class MyClass3 extends absClass1{
    @Override
    public void method1() {
        System.out.println(" MyClass3 method1()");
    }
    public void method3(){
        method1() ; // Class B 의 mthod1() 이 호출
        this.method1() ; // Class B 의 mthod1() 이 호출
        this.method2() ; // Class A 의 method2() 가 호출
        super.method1() ; // Class A 의 mthod1() 이 호출
    }

}