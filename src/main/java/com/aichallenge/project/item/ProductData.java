package com.aichallenge.project.item;

import com.aichallenge.project.environment.Shelf;

import java.util.ArrayList;
import java.util.List;

public class ProductData {
    private final Product item;
    private int minimumThreshold;
    private int stock;
    private final List<Shelf> shelves;

    public ProductData(Product item, int minimumThreshold, int stock, Shelf initShelf) {
        this.item = item;
        this.minimumThreshold = minimumThreshold;
        this.stock = stock;
        this.shelves = new ArrayList<>(List.of(initShelf));
    }

    public Product getItem() {
        return item;
    }

    public int getMinimumThreshold() {
        return minimumThreshold;
    }

    public int getStock() {
        return stock;
    }

    public List<Shelf> getPositions() {
        return shelves;
    }

    public void setMinimumThreshold(int minimumThreshold) {
        this.minimumThreshold = minimumThreshold;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
