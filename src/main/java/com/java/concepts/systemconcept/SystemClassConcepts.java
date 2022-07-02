package com.java.concepts.systemconcept;

public class SystemClassConcepts {
    public static void main(String[] args) {
        System.out.println(System.getenv()); // get all env variables as map
       methodWhereObjectIsCreatedAndDestroyed("Object for Example");
        System.gc();
        printOSDetails();
        //sleep(1000);
        methodWhereObjectIsCreatedAndDestroyed("Example for running runFinalization() method of System class");
        System.gc();
        SecurityManager securityManager=new SecurityManager(); // create new Security Manager

    }

    private static void printOSDetails() {
        System.out.println(System.getProperty("os.name")); // get operating system name property
        System.out.println(System.getProperty("os.version")); // get OS version property
        System.out.println(System.getProperty("os.arch")); // get OS architecture property
    }

    private static void methodWhereObjectIsCreatedAndDestroyed(String str) {
        final ExampleSystem es=new ExampleSystem(str);
        es.printValue();
    }


    private static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class ExampleSystem{
    final String str;

    public ExampleSystem(String str) {
        this.str = str;
    }
    void printValue(){
        System.out.println(str);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Inside Finalize Method");
    }
}
