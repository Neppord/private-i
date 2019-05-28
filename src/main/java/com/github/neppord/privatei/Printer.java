package com.github.neppord.privatei;

@FunctionalInterface
public interface Printer<T> {
    String print(T toBePrinted);
}
