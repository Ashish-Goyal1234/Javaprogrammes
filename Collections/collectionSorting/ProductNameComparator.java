package collectionSorting;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.productName.compareTo(p2.productName);
    }

}
