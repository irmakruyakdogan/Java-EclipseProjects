public class classesAttributes {

    public static void main(String[] args){

        Product product = new Product();
        product.setName("Phone");
        product.setId(15);
        product.setDescriptions("15 Pro Max");
        product.setPrice(100000);
        product.setStock(5);
        //System.out.println(product.name);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

    }

}
