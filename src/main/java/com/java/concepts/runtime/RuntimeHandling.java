package com.java.concepts.runtime;

public class RuntimeHandling {
    public static void main(String[] args) {
        Runtime runtime=Runtime.getRuntime();
        System.out.println("Process total memory : "+convertBytesToKB(runtime.totalMemory()));
        System.out.println("Free Memory : "+convertBytesToKB(runtime.freeMemory()));
        runtime.gc(); // force start GC , contrary behaviour to System.gc()
        System.out.println("Process total memory : "+convertBytesToKB(runtime.totalMemory()));
        System.out.println("After GC Free Memory : "+convertBytesToKB(runtime.freeMemory()));
        RuntimeHandling runtimeHandling=new RuntimeHandling();
        System.out.println("Free Memory after object creation : "+convertBytesToKB(runtime.freeMemory()));
        runtimeHandling.printValue();
        System.out.println("Free Memory after method call : "+convertBytesToKB(runtime.freeMemory()));
        System.out.println("Process total memory : "+convertBytesToKB(runtime.totalMemory()));

    }
    void printValue(){
        System.out.println("Inside custom method");
    }
    static String convertBytesToKB(long bytes){
        long mb=bytes/(1024*1024);
        return mb+"mb";
    }
}
