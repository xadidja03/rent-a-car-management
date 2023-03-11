package repository.impl;
import model.Car;
import model.Customer;
import queries.CarQuery;
import queries.CustomerQuery;
import repository.CustomerRepo;
import repository.DbConnection;
import java.sql.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
public class CustomerRepoImpl extends DbConnection implements CustomerRepo {
    @Override
    public boolean addCustomer(Customer customer) {
        try (Connection connect = connect()) {
            PreparedStatement preparedStatement = connect.prepareStatement(CustomerQuery.ADD_CUSTOMER);
            preparedStatement.setString(1,customer.getName());
            preparedStatement.setString(2,customer.getSurname());
            preparedStatement.setDate(3, Date.valueOf(customer.getBirthdate()));
            preparedStatement.setString(4,customer.getFin());
            preparedStatement.setString(5,customer.getSerial_number());
            int count = preparedStatement.executeUpdate();
            return count > 0;
    } catch (SQLException | ClassNotFoundException exception) {
            exception.printStackTrace();}
        return false;
    }
    @Override
    public List<Customer> showCustomer() {
        try (Connection connect = connect()) {
            PreparedStatement preparedStatement = connect.prepareStatement(CustomerQuery.SHOW_CUSTOMER);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Customer> customers = new LinkedList<>();
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String surname= resultSet.getString("surname");
                LocalDate birthdate = resultSet.getDate("birthdate").toLocalDate();
                String fin = resultSet.getString("fin");
                String serial_number = resultSet.getString("serial_number");
               customers.add(new Customer(id, name, surname, birthdate, fin,serial_number));
            }return customers;
        } catch (SQLException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
        return null;
    }
}
