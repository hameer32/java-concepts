package com.java.concepts.singelton;

public class SingletonClass {
    public static void main(String[] args) {
        SingletonClassExample1 classExample1=SingletonClassExample1.getSingletonObject();
        SingletonClassExample1 classExample2=SingletonClassExample1.getSingletonObject();
        if(classExample1.equals(classExample2)) {
            System.out.println("Both reference have same object reference");
            System.out.println("Obj1 hash code : "+ classExample1.hashCode());
            System.out.println("Obj2 hash code : "+ classExample2.hashCode());
        }
    }
}

// Method 1
class SingletonClassExample1 {
    private static final SingletonClassExample1 singletonObject = new SingletonClassExample1();

    private SingletonClassExample1() {
    }

    /**
     * @return SingletonClassExample1 object
     */
    public static SingletonClassExample1 getSingletonObject() {
        return singletonObject;
    }
}

// Method 2
class SingletonClassExample2 {
    private static SingletonClassExample2 singletonObject = null;

    private SingletonClassExample2() {
    }

    /**
     * This method is static to allow global access for the method
     * @return SingletonClassExample2 object
     */
    public static SingletonClassExample2 getSingletonObject() {
        if (singletonObject == null) singletonObject = new SingletonClassExample2();
        return singletonObject;
    }
}
