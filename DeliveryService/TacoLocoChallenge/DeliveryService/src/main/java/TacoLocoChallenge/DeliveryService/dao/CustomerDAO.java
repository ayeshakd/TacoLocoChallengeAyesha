package TacoLocoChallenge.DeliveryService.dao;
 
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import TacoLocoChallenge.DeliveryService.model.Customer;
 
public class CustomerDAO {
 
    private static final Map<String, Customer> CustomerMap = new HashMap<String, Customer>();
 
    static {
        initEmps();
    }
 
    private static void initEmps() {
        Customer cus1 = new Customer("C01", "Smith", "1 First St, Detroit, Michigan, 48612");
        Customer cus2 = new Customer("C02", "Allen", "2 First St, Detroit, Michigan, 48512");
        Customer cus3 = new Customer("C03", "Jones", "3 First St, Detroit, Michigan, 47612");
 
        CustomerMap.put(cus1.getDeliveryID(), cus1);
        CustomerMap.put(cus2.getDeliveryID(), cus2);
        CustomerMap.put(cus3.getDeliveryID(), cus3);
    }
 
    public static Customer getCustomer(String deliveryID) {
        return CustomerMap.get(deliveryID);
    }
 
    public static Customer addCustomer(Customer delivery) {
        CustomerMap.put(delivery.getDeliveryID(), delivery);
        return delivery;
    }
 
    public static Customer updateCustomer(Customer delivery) {
        CustomerMap.put(delivery.getDeliveryID(), delivery);
        return delivery;
    }
 
    public static void deleteCustomer(String deliveryID) {
        CustomerMap.remove(deliveryID);
    }
 
    public static List<Customer> getAllCustomers() {
        Collection<Customer> c = CustomerMap.values();
        List<Customer> list = new ArrayList<Customer>();
        list.addAll(c);
        return list;
    }
     
    List<Customer> list;
 
}