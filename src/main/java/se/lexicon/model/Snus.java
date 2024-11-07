package se.lexicon.model;

public class Snus implements Product{


    private int id;
    private double price;
    private String productName;
    private String flovor;

    public Snus(int id, double price, String productName, String flovor) {

        this.id = id;
        this.price = price;
        this.productName = productName;
        this.flovor = flovor;

    }


    public String getFlovor() {
        return flovor;
    }

    public void setFlovor(String flovor) {
        this.flovor = flovor;
    }

    @Override
    public String examine() {
        return "Id: "+getId()+", price: "+getPrice()+", productName: "+getProductName()+", flovor: "+getFlovor();
    }

    @Override
    public String use() {
        return  "Enjor your Snus";
    }

    @Override
    public int getId() {
        return id;
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
