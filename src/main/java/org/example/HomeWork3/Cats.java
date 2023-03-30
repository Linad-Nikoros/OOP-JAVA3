package org.example.HomeWork3;

public class Cats  {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Cats{" +
                "name='" + name + '\'' +
                '}';
    }
    public Cats(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
}
