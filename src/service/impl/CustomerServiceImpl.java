package service.impl;
import model.Customer;
import repository.CustomerRepo;
import repository.impl.CustomerRepoImpl;
import service.CustomerService;
import util.InputUtil;
import java.time.LocalDate;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepo customerRepo;

    public CustomerServiceImpl(){
        customerRepo=new CustomerRepoImpl();
    }
    public Customer fillCustomer() {
        String name = InputUtil.inputRequiredString("Enter the name: ");
        String surname = InputUtil.inputRequiredString("Enter the surname: ");
        String birthdate =InputUtil.inputRequiredString("Enter the birthdate(yyyy.MM.dd): ");
        String fin = InputUtil.inputRequiredString("Enter the fin: ");
        String serial_number = InputUtil.inputRequiredString("Enter the serial number: ");
        return new Customer(name,surname, LocalDate.parse(birthdate),fin,serial_number);
}    @Override
    public void addCustomer() {
            customerRepo.addCustomer(fillCustomer());
        };

    @Override
    public void showCustomer() {
        List<Customer> customers = customerRepo.showCustomer();
        customers.stream().forEach(System.out::println);

    }
}
