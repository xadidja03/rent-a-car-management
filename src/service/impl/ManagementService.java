package service.impl;
import exception.InvalidOptionException;
import util.MenuUtil;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
public class ManagementService implements service.ManagementService{
    public void management() {
    CustomerServiceImpl service = new CustomerServiceImpl();
    CarServiceImpl service1=new CarServiceImpl();
    while (true) {
        try {
            while (true) {
                int option = MenuUtil.entry();
                switch (option) {
                    case 0 -> {
                        System.out.println("Good bye!\n");
                        System.exit(-1);}
                    case 1 -> service1.addCar();
                    case 2 -> service1.showCar();
                    case 3 -> service.addCustomer();
                    case 4 -> service.showCustomer();
                    default -> throw new InvalidOptionException() {
                    };
                }
            }
        } catch (DateTimeParseException |InvalidOptionException| InputMismatchException e) {

            System.out.println(e.getMessage());
        }
    }
}
}
