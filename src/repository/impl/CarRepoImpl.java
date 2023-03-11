package repository.impl;

import model.Car;
import model.Customer;
import queries.CarQuery;
import repository.CarRepo;
import repository.DbConnection;

import java.sql.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class CarRepoImpl extends DbConnection implements CarRepo {
    @Override
    public boolean addCar(Car car) {
        try (Connection connect = connect()) {
            PreparedStatement preparedStatement = connect.prepareStatement(CarQuery.ADD_CAR);
            preparedStatement.setString(1,car.getBrand());
            preparedStatement.setString(2,car.getModel());
            preparedStatement.setString(3,car.getEngine());
            preparedStatement.setString(4,car.getBody_type());
            preparedStatement.setString(5,car.getProduction());
            preparedStatement.setInt(6,car.getSeats());
            preparedStatement.setInt(7,car.getDoors());
            preparedStatement.setInt(8,car.getSpeed());
            preparedStatement.setDouble(9,car.getRent_amount());

            int count = preparedStatement.executeUpdate();
            return count > 0;

        } catch (SQLException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
        return false;
    }


    @Override
    public List<Car> showCar() {
        try (Connection connect = connect()) {
            PreparedStatement preparedStatement = connect.prepareStatement(CarQuery.SHOW_CAR);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Car> cars = new LinkedList<>();
            while (resultSet.next()) {
                Long id=resultSet.getLong("id");
                String brand = resultSet.getString("brand");
                String model= resultSet.getString("model");
                String engine = resultSet.getString("engine");
                String bodyType = resultSet.getString("body_type");
                String production = resultSet.getString("production");
                Integer seats= resultSet.getInt("seats");
                Integer doors= resultSet.getInt("doors");
                Integer speed= resultSet.getInt("speed");
                Double rent_amount=resultSet.getDouble("rent_amount");
                cars.add(new Car(id, brand,model,engine,production,bodyType,seats,doors,speed,rent_amount));
            } return cars;
        } catch (SQLException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
        return null;
    }
}
