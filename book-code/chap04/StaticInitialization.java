

public class StaticInitialization{
    public static void main(String[] args){
        System.out.println("Create new C() in main");
        new C();
        System.out.println("Create new C() in main");
        new C();
        bb.f2(1);
        cc.f3(1);
    }
    static B bb=new B();
    static C cc=new C();
}

class A {
    A(int i){ 
    	System.out.println("A("+i+")"); 
    }
    void f1(int i) { 
    	System.out.println("f1("+i+")"); 
    }
}

class B{
    static A a1=new A(1);
    B(){
    	System.out.println("B()"); 
    	a2.f1(1); 
    }
    void f2(int i){ 
    	System.out.println("f2("+i+")"); 
    }
    static A a2=new A(2);
}

class C{
    A a3=new A(3);
    static A a4=new A(4);
    C(){
    	System.out.println("C()"); 
    	a4.f1(2); 
    }
    void f3(int i){ 
    	System.out.println("f3("+i+")"); 
    }
    static A a5=new A(5);
}