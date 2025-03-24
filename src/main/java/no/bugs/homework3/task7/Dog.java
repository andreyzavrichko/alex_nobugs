package no.bugs.homework3.task7;

public class Dog extends Animal{


    @Override
    public void makeSound() {
        System.out.println("Собака лает, караван идёт");
    }

    public void fetch() {
        System.out.println("Собака приносит палку");
    }

}
