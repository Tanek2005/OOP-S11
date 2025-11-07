class Product {
    int productId;
    String name;
    double price;
    
    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 59999.99);
        Product p2 = new Product(102, "Smartphone", 19999.50);

        p1.displayProduct();
        p2.displayProduct();
    }
}