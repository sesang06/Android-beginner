package javaAnimal;

public class Cat implements Animal {
    public void run(String prefix) {
        prefix = prefix + " is cat";
        System.out.println(prefix+"is cat");
    }

}