package com.java.concepts.immutable.immutablelist;

public class ImuList {
    public static void main(String[] args) {
        ImList<Integer> nil = ImList.empty();
        nil = nil.cons(5);
        nil = nil.cons(21).cons(11).cons(10);
        ImList<Integer> x = nil.cons(2).cons(1).cons(0);
        System.out.println(x);
        System.out.println(x.first());
        System.out.println(x.rest().rest().rest());
        ImList<Integer> y = x.rest().cons(4);
    }
}

interface ImList<E> {
    static <E> ImList<E> empty() {
        return new Empty<>();
    }

    ImList<E> cons(E e);

    E first();

    ImList<E> rest();

    String toString();

    int size();
}

class Empty<E> implements ImList<E> {
    public Empty() {
    }

    public ImList<E> cons(E e) {
        return new Cons<>(e, this);
    }

    public E first() {
        throw new UnsupportedOperationException();
    }

    public ImList<E> rest() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "Empty";
    }

    public int size() {
        return 0;
    }
}

class Cons<E> implements ImList<E> {
    private final E e;
    private final ImList<E> rest;

    public Cons(E e, ImList<E> rest) {
        this.e = e;
        this.rest = rest;
    }

    public ImList<E> cons(E e) {
        return new Cons<>(e, this);
    }

    public E first() {
        return e;
    }

    public ImList<E> rest() {
        return rest;
    }

    @Override
    public String toString() {
        return "Cons{" + "e=" + e + ", rest=" + rest + '}';
    }

    public int size() {
        return 1 + rest.size();
    }
}