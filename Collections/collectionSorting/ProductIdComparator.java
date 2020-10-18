package collectionSorting;

import java.util.Comparator;

public class ProductIdComparator implements Comparator<Product>{

    @Override
    public int compare(Product p1, Product p2) {
        if(p1.productId==p2.productId){
            return 0;
        }else if(p1.productId > p2.productId){
            return 1;
        }else
        return -1;
    }

}
