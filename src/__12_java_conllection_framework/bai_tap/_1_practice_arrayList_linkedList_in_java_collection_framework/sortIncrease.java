package __12_java_conllection_framework.bai_tap._1_practice_arrayList_linkedList_in_java_collection_framework;


import java.util.Comparator;

public class sortIncrease implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
