package Phone;

public class iphone implements phone {
    @Override
    public String processor() {
        return "IOS";
    }

    @Override
    public String brand() {
        return "IPHONE";
    }

    @Override
    public int storage() {
        return 256;
    }

    public String toString() {
        return "Processor =" + processor() + "Brand = " + brand() + "storage = " + storage();
    }
}
