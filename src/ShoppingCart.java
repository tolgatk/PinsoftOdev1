import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {

        İtem item1 = new İtem();
        item1.setProductName("Casper Nirvana X600");
        item1.setSupplierName("Casper");
        item1.setSellingPrice(15000);
        item1.setPurchasePrice(13000);

        İtem item2 = new İtem();
        item2.setProductName("Lenovo IdeaPad Slim 3");
        item2.setSupplierName("Lenovo");
        item2.setSellingPrice(13000);
        item2.setPurchasePrice(11000);

        İtemBussines i̇temBussines = new İtemBussines();
        i̇temBussines.zamYap(item1);


        i̇temBussines.karMiktar(item1);


        i̇temBussines.zamYap(item2);
        i̇temBussines.karMiktar(item2);


        List<İtem> myCart=new ArrayList<İtem>();
        myCart.add(item1);
        myCart.add(item2);
        myCart.forEach(i̇->{
           // System.out.println(i̇.getSellingPrice());
        });







        i̇temBussines.addCart(item2);

        i̇temBussines.totalPrice(myCart);

    }
}
