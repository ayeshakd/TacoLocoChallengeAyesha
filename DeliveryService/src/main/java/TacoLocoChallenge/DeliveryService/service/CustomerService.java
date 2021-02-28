package TacoLocoChallenge.DeliveryService.service;
 
import java.util.List;
 
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
import TacoLocoChallenge.DeliveryService.dao.CustomerDAO;
import TacoLocoChallenge.DeliveryService.model.Customer;
 
@Path("/customers")
public class CustomerService {
 
    // URI:
    // /DeliveryService/rest/customers
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<Customer> getCustomers_JSON() {
        List<Customer> listOfCountries = CustomerDAO.getAllCustomers();
        return listOfCountries;
    }
 
    // URI:
    // /DeliveryService/rest/customers/{deliveryID}
    @GET
    @Path("/{deliveryID}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Customer getCustomer(@PathParam("deliveryID") String deliveryID) {
        return CustomerDAO.getCustomer(deliveryID);
    }
 
    // URI:
    // /DeliveryService/rest/customers
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Customer addCustomer(Customer delivery) {
        return CustomerDAO.addCustomer(delivery);
    }
 
    // URI:
    // /DeliveryService/rest/customers
    @PUT
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Customer updateCustomer(Customer delivery) {
        return CustomerDAO.updateCustomer(delivery);
    }
 
    @DELETE
    @Path("/{deliveryID}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public void deleteCustomer(@PathParam("deliveryID") String deliveryID) {
        CustomerDAO.deleteCustomer(deliveryID);
    }
 
}

