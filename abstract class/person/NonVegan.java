package person;

public class NonVegan extends Person {
    @Override
    public void eat() {
        System.out.println("eats non vegan food");
    }
}
