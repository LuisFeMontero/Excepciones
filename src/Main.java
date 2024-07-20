import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


    ShoppingCart shoppingCart = new ShoppingCart();

    try{
    shoppingCart.addProduct(new Product("Saco", 100.0));
    shoppingCart.addProduct(new Product("Pantalon", 200.0));
    shoppingCart.addProduct(null);
    }catch(Exception e){
        e.printStackTrace();
    }





//        List<Integer> numberList = new ArrayList<>();
//
//        try{
//            numberList.add(5);
//            numberList.get(5);
//        }catch (IndexOutOfBoundsException e){
//            System.out.println("fallo por el indice");
//        }catch (Exception exception){
//            System.out.println("fallo por algo");
//        }
//        System.out.println("Llego hasta acá");

    }
}