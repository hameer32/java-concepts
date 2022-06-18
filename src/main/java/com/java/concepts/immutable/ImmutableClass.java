package com.java.concepts.immutable;

public class ImmutableClass {
    public static void main(String[] args) {
        CustomImmutable customImmutable=new CustomImmutable("Vertigo");
        System.out.println("HashCode : "+customImmutable.hashCode());
        CustomImmutable customImmutable1=customImmutable.modify("Vertigo");
        System.out.println("HashCode : "+customImmutable1.hashCode());
        CustomImmutable customImmutable2=customImmutable1.modify("Earth");
        System.out.println("HashCode : "+customImmutable2.hashCode());
        CustomImmutable customImmutable3=customImmutable2.modify("Vertigo");
        System.out.println("HashCode : "+customImmutable3.hashCode());
    }
}

/**
 * Immutable class is declared as final
 */
final class CustomImmutable {
    private final String str;

    public CustomImmutable(String str) {
        this.str = str;
    }

    public CustomImmutable modify(String value) {
        if (this.str.equals(value)) {
            return this;
        } else {
            return new CustomImmutable(value);
        }
    }
}
