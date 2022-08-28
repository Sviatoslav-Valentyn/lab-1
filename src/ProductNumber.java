public class ProductNumber {
    private Product product;
    private int number;

    public ProductNumber(final Product product, final int number) {
        this.product = product;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(final int number) {
        this.number = number;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(final Product product) {
        this.product = product;
    }
    public int priceByQuantity(){
        return product.getPrice() * number;
    }
}
