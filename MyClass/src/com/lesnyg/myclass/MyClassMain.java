package com.lesnyg.myclass;

public class MyClassMain {
    static MyInterface1 handler;
    public static void main(String[] args) {
//        setOnClickListener(new MyClass2());
//        eventHandler();

        MyClass3 obj1 = new MyClass3();
        obj1.method3();

    }

    static void setOnClickListener(MyInterface1 listener){
        handler = listener;
    }

    static void eventHandler(){
        handler.onClick();
    }

}
