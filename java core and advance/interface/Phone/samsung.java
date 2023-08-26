package Phone;

public class samsung implements phone {

    @Override
    public String processor() {
        return "SD853";
    }

    @Override
    public String brand() {
        return "samsung";
    }

    @Override
    public int storage() {
        return 32;
    }

}
