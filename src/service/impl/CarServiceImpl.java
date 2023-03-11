package service.impl;
import model.Car;
import repository.CarRepo;
import repository.impl.CarRepoImpl;
import service.CarService;
import util.InputUtil;
import java.util.List;
public class CarServiceImpl implements CarService {
    private final CarRepo carRepo;
    public CarServiceImpl(){
        carRepo=new CarRepoImpl();
    }
    public Car fillCar() {
        String brand = InputUtil.inputRequiredString("Enter the brand: ");
        String model = InputUtil.inputRequiredString("Enter the surname: ");
        String engine = InputUtil.inputRequiredString("Enter the engine ");
        String body_type = InputUtil.inputRequiredString("Enter the body_type: ");
        String production = InputUtil.inputRequiredString("Enter the production: ");
        Integer seats = InputUtil.inputRequiredInteger("Enter the seats: ");
        Integer doors = InputUtil.inputRequiredInteger("Enter the doors: ");
        Integer speed = InputUtil.inputRequiredInteger("Enter the speed: ");
        Double rent_amount = InputUtil.inputRequiredDouble("Enter the rent_amount ");
        return  new Car(brand,model,body_type,engine,production,seats,doors,speed,rent_amount);
    }

    @Override
    public void addCar() {
            carRepo.addCar(fillCar());
        }
    @Override
    public void showCar() {
        List<Car> cars = carRepo.showCar();
        cars.stream().forEach(System.out::println);

    }
}

