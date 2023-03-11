package model;

import java.time.LocalDate;

public class Car {
    private Long id;
    private String brand;
    private String model;
    private String body_type;
    private String engine;
    private String production;
    private Integer seats;
    private Integer doors;
    private Integer speed;
    private Double rent_amount;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBody_type() {
        return body_type;
    }

    public void setBody_type(String body_type) {
        this.body_type = body_type;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Double getRent_amount() {
        return rent_amount;
    }

    public void setRent_amount(Double rent_amount) {
        this.rent_amount = rent_amount;
    }

    public Car() {
    }

    public Car(String brand, String model, String body_type, String engine, String production, Integer seats, Integer doors, Integer speed, Double rent_amount) {
        this.brand = brand;
        this.model = model;
        this.body_type = body_type;
        this.engine = engine;
        this.production = production;
        this.seats = seats;
        this.doors = doors;
        this.speed = speed;
        this.rent_amount = rent_amount;
    }

    public Car(Long id, String brand, String model, String body_type, String engine, String production, Integer seats, Integer doors, Integer speed, Double rent_amount) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.body_type = body_type;
        this.engine = engine;
        this.production = production;
        this.seats = seats;
        this.doors = doors;
        this.speed = speed;
        this.rent_amount = rent_amount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", body_type='" + body_type + '\'' +
                ", engine='" + engine + '\'' +
                ", production='" + production + '\'' +
                ", seats=" + seats +
                ", doors=" + doors +
                ", speed=" + speed +
                ", rent_amount=" + rent_amount +
                '}';
    }
}