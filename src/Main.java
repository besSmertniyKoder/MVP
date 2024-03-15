import controller.OnlineStoreController;
import modelORdata.Shwarma;
import view.StoreView;

public class Main {
    public static void main(String[] args) {
        OnlineStoreController onlineStoreController =new OnlineStoreController();
        StoreView storeView = new StoreView();
        System.out.println("////////////////");
        storeView.addOrder(new Shwarma(1000, "мясо"));
        storeView.showOrders();

        System.out.println();

    }
}
