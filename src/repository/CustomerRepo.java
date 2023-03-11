package repository;
import model.Customer;
import java.util.List;

public interface CustomerRepo {
    boolean addCustomer(Customer customer);
    List<Customer> showCustomer();
}
