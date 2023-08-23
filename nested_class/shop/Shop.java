package nested_class.shop;

public class Shop {
    public boolean isLocked(String key) {
        class Lock { // inner local class
            public boolean isLocked(String key) {
                if (key.equals("qwerty")) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return new Lock().isLocked(key);
    }
}
