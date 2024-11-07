package se.lexicon.model;

public class ChipsBag implements Product{

    private int id;
    private double price;
    private String productName;
    private String flovor;



    public ChipsBag(int id, double price, String productName, String flovor) {

        this.id = id;
        this.price = price;
        this.productName = productName;
        this.flovor = flovor;
    }


    public String getFlovor() {
        return flovor;
    }

    @Override
    public String examine() {
        return "id: "+ getId()+", price: "+ getPrice()+", productName: "+ getProductName() + ", flovor: "+ getFlovor();
    }

    @Override
    public String use() {
        return "Enjoy your chips";
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getProductName() {
        return  productName;
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

    public void setFlovor(String flovor) {
        this.flovor = flovor;
    }

    public void setId(int id) {
        this.id = id;
    }
}
