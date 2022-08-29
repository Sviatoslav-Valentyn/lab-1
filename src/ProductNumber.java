public class ProductNumber {
    private Product product;
    private int amount;

    public ProductNumber(final Product product, final int number) {
        this.product = product;
        this.amount = number;
    }

    public int getNumber() {
        return amount;
    }

    public void setNumber(final int number) {
        this.amount = number;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(final Product product) {
        this.product = product;
    }
    public int priceByQuantity(){
        return product.getPrice() * amount;
    }
}
