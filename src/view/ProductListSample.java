package view;

import model.Product;

import java.util.ArrayList;

public class ProductListSample {
    ArrayList<String> plist;
    ArrayList<Product> prodList;
    public ProductListSample(int quant) {
        prodList = new ArrayList<>();
        plist = new ArrayList<>();
        for (int i = 0; i < quant; i++) {
            prodList.add(new Product("Description for product " + (i+1), 500.0));
        }
    }

    public ArrayList<String> getProducts(){
        for (Product p :
                prodList) {
            plist.add(p.toString());
        }
        return plist;
    }
}
