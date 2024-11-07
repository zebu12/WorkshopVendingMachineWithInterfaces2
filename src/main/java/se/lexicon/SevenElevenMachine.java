package se.lexicon;

import se.lexicon.model.*;

//import java.util.Currency;

//import java.util.Currency;

public class SevenElevenMachine implements VendingMachine {

    private Product[] products;
    private int depositPool = 0;

    public SevenElevenMachine() {

        products = new Product[4];
        products[0] = new ChipsBag(1, 25.0, "OLW", "Dill");
        products[1] = new ChipsBag(2, 25.0, "OLW", "Vikings");
        products[2] = new SoftDink(3, 20.0, "Fanta", 500.0);
        products[3] = new Snus(4, 59.0, "General", "White Strong");

    }


    @Override
    public void addCurrency(Currency amount) {

        depositPool += amount.getValue();

    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                if (depositPool >= product.getPrice()) {
                    depositPool -= product.getPrice();
                    System.out.println(product.use());
                    return product;
                } else {
                    System.out.println("Add more money");
                    return null;

                }
            }
            System.out.println("Product not found");
        }
        return null;
    }

    @Override
    public int endSession() {
        System.out.println("this your balance is " + getBalance());
        int remainBalance = getBalance();
        depositPool = 0;
        return remainBalance;
    }

    @Override
    public String getDescription(int id) {
        switch (id) {
            case 1:
                products[0].examine();
                break;
            case 2:
                products[1].examine();
                break;
            case 3:
                products[2].examine();
                break;
            case 4:
                products[3].examine();
                break;
            default:
                System.out.println("Invalid ID");
                break;


        }

        return "";
    }

    @Override
    public String[] getProducts() {
        String[] prods = new String[4];
        prods[0] = products[0].examine();
        prods[1] = products[1].examine();
        prods[2] = products[2].examine();
        prods[3] = products[3].examine();
        return prods;
    }
}
