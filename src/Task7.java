public class Task7 {
    public static void main(final String[] args) {
        for (int i = 0; i < products.length; i++){
            System.out.println("Product: " + products[i].getProduct() +
                    "  " + products[i].getNumber() + "pieces = " + products[i].priceByQuantity() + "₴");
        }
    }
    static ProductNumber[] products = new ProductNumber[]{
            new ProductNumber(new Product("Samsung Galaxy A53 5G 8/256GB", 18600),3),
            new ProductNumber(new Product("Samsung Galaxy S22 Ultra S908B 12GB/256GB", 53000),2)
    };
}
