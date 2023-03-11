package repository;
import model.Car;
import java.util.List;

public interface CarRepo {
    boolean addCar(Car car);
    List<Car> showCar();
}
