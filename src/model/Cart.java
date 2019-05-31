package model;

import java.util.ArrayList;

public final class Cart {
    private static volatile Cart instance;
    private ArrayList<Product> productList;

    private Cart() {
        productList = new ArrayList<>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void clearCart() {
        productList = new ArrayList<>();
    }

    public static Cart getInstance() {
        if (instance == null) {
            synchronized (Cart.class) {
                if (instance == null) {
                    instance = new Cart();
                }
            }
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "productList=" + productList +
                '}';
    }
}
