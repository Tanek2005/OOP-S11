class Product {
    void showDetails() {
        System.out.println("Product: Laptop, Price: ₹60,000");
    }
}

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Product");
        Object obj = cls.getDeclaredConstructor().newInstance();
        cls.getMethod("showDetails").invoke(obj);
    }
}