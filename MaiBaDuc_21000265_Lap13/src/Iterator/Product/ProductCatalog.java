package Iterator.Product;

public class ProductCatalog implements Iterable{
    public String[] productCatalog;

    @Override
    public Iterator getIterator() {
        return new ProductIterator();
    }
    public ProductCatalog(String[] productCatalog){
        this.productCatalog = productCatalog;
    }
    public class ProductIterator implements Iterator{
        int position =0;

        @Override
        public boolean hasNext() {
            return position < productCatalog.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return productCatalog[position++];
            }
            return null;
        }
    }


}
