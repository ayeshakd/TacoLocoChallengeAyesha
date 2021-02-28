package TacoLocoChallenge.DeliveryService.model;
 
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "customer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {
 
    private String deliveryID;
    private String CustomerName;
    private String address;
 
    public Customer() {
 
    }
 
    public Customer(String deliveryID, String CustomerName, String address) {
        this.deliveryID = deliveryID;
        this.CustomerName = CustomerName;
        this.address = address;
    }
 
    public String getDeliveryID() {
        return deliveryID;
    }
 
    public void setDeliveryID(String deliveryID) {
        this.deliveryID = deliveryID;
    }
 
    public String getCustomerName() {
        return CustomerName;
    }
 
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }
 
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
 
}

