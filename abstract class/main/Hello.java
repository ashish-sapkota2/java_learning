import person.NonVegan;
import person.Person;
import person.Vegan;

public class Hello {
    public static void main(String[] args) {
        Person jhon = new Vegan();
        jhon.breathe();
        jhon.eat();
        jhon.speak();
        jhon.message();

    }
}
