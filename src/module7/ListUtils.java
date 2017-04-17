package module7;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Plutus on 01.04.2017.
 */
public class ListUtils {

        public static void sortByPriceDown (List <Order> orderList){
            Collections.sort(orderList, new Comparator<Order>() {
                @Override
                public int compare(Order o1, Order o2) {
                    return -(o1.getPrice() - o2.getPrice());
                }
            });

        }

         public static void sortByPriceUpAndCity (List<Order> orderList){
             Collections.sort(orderList, new Comparator<Order>() {
                 @Override
                 public int compare(Order o1, Order o2) {
                     int priceComparision = o1.getPrice() - o2.getPrice();
                     if (priceComparision !=0){
                         return priceComparision;
                     }
                     return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                 }
             });
         }

         public static void sortByItemIdCity (List<Order> orderList) {
             Collections.sort(orderList, new Comparator<Order>() {
                 @Override
                 public int compare(Order o1, Order o2) {
                     int sortItemName = o1.getItemName().compareTo(o2.getItemName());
                     int shopIdentificator = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());

                     if (sortItemName != 0) {
                         return sortItemName;
                     } else if (shopIdentificator != 0) {
                         return shopIdentificator;
                     } else
                         return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                 }
             });
         }



}
