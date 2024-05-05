package com.learning.java8l;

public class Pair<T> {
    private T first;
    private T second;
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() {
        return first;
    }
    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }
    public void setSecond(T second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Pair<String> name = new Pair<>("Batman", "IronMan");
        Pair<Integer> age= new Pair<>(24, 26);

        String name1 = name.getFirst();
        Integer age1 = age.getFirst();
        System.out.println(name1);
        System.out.println(age1);


    }
}
