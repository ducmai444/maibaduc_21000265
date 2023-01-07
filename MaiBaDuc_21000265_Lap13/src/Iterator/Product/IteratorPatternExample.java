package Iterator.Product;

public class IteratorPatternExample {
    public static void main(String[] args){
        String[] products = {"Bag", "Pen", "Ruler"};
        ProductCatalog productCatalog = new ProductCatalog(products);
        Iterator iterator = productCatalog.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
