package person;

public abstract class Person implements IsAlive, LiveLife {
    public void speak() {
        System.out.println("hear");
    }

    @Override
    public void breathe() {
        System.out.println("be alive");
    }

    @Override
    public void message() {
        System.out.println("life is a journey");

    }

    public abstract void eat();
}
