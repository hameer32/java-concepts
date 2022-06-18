package com.java.concepts.singelton;

public class SingletonThreadSafe {
    public static void main(String[] args) {
        // best way to create singleton  object :
        SingletonEnumThreadSafe obj=SingletonEnumThreadSafe.SINGLETON_INSTANCE;
        System.out.println("Obj hash value : "+obj.hashCode());
    }

}

/**
 * This class is thread safe version for Singleton class design pattern
 * This uses double-checked locking pattern
 */
class SingletonThreadSafeExample {
    // Volatile is used because , one thread might be in state of creating object but not full formed object
    // and another thread will think that object has been created , so its tried to return that unformed object
    // so we want to flush the local thread memory object to the main object using volatile.
    private static volatile SingletonThreadSafeExample instance = null;

    private SingletonThreadSafeExample() {
    }

    public static SingletonThreadSafeExample getThreadSafeObject() {
        // Run this block if singleton is not yet initialized
        // First check
        if (instance == null) {
            // locking
            synchronized (SingletonThreadSafeExample.class) {
                // Second check
                if (instance == null) {
                    // Create the only instance for the singleton class
                    instance = new SingletonThreadSafeExample();
                }
            }
        }
        return instance;
    }

}
enum SingletonEnumThreadSafe{
    SINGLETON_INSTANCE
}
