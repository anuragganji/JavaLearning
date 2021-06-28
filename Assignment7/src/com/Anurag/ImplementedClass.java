package com.Anurag;

public class ImplementedClass extends Concrete implements InheritedInterface {
    @Override
    public void inheritedInterfaceMethod() {
        System.out.println("inheritedInterfaceMethod"); }
    @Override
    public void methodOne1() {
        System.out.println("methodOne1"); }
    @Override
    public void methodOne2() {
        System.out.println("methodOne2");
    }
    @Override
    public void methodThree1() {
        System.out.println("methodThree1");
    }
    @Override
    public void methodThree2() {
        System.out.println("methodThree2");
    }
    @Override
    public void methodTwo1() {
        System.out.println("methodTwo1");
    }
    @Override
    public void methodTwo2() {
        System.out.println("methodTwo2");
    }
    public void methodOne(InterfaceOne interfaceOne)
    {
        interfaceOne.methodOne1();
    }
    public void methodTwo(InterfaceTwo interfaceTwo)
    {
        interfaceTwo.methodTwo1();
    }
    public void methodThree(InterfaceThree interfaceThree)
    {
        interfaceThree.methodThree1();
    }
    public void methodFour(InheritedInterface inheritedInterface)
    {
        inheritedInterface.inheritedInterfaceMethod();
    }
}