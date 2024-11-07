package se.lexicon.model;

public class SoftDink implements Product {


    private int id;
    private double price;
    private String productName;
    private double size;


    public SoftDink(int id, double price, String productName, double size) {

        this.id = id;
        this.price = price;
        this.productName = productName;
        this.size = size;

    }

    public double getSize() {
        return size;
    }

    @Override
    public String examine() {
        return "Id: "+getId()+", Price: "+getPrice()+", Product: "+getProductName()+", Size: "+getSize();
    }

    @Override
    public String use() {
        return "Enjoy your drink";
    }

    @Override
    public int getId() {
        return  id;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public void setProductName(String productName) {
        this.productName = productName;

    }

    @Override
    public double getPrice() {
        return price;

    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
