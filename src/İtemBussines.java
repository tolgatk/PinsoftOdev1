import java.util.ArrayList;
import java.util.List;


public class İtemBussines {
    public void zamYap(İtem i̇tem){

        int miktar;

        miktar = i̇tem.getSellingPrice()*20/100;

        i̇tem.setSellingPrice(i̇tem.getSellingPrice()+miktar);



        System.out.println(i̇tem.getSellingPrice()+" ürünün yeni fiyatı");
    }
    public void karMiktar(İtem item){
        int kar;

        kar=  item.getSellingPrice()-item.getPurchasePrice();
        System.out.println(kar+" Üründen elde edilen kar miktarı");
    }
    public void addCart (İtem item){

        System.out.println(item.getProductName()+" Ürünü Sepete Eklendi");

    }









    public void totalPrice (List<İtem> items){



        int total = 0;
        for (İtem  i̇tem : items) {


            total += i̇tem.getSellingPrice();

        }
        System.out.println(total+"  Toplam ürün fiyatı");
    } }


