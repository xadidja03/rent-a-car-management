package model;

import java.time.LocalDate;

public class Customer {
    private Long id;
    private String name;
    private String surname;
    private LocalDate birthdate;
    private String fin;
    String serial_number;


    public Customer(Long id, String name, String surname, LocalDate birthdate, String fin, String serial_number) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.fin = fin;
        this.serial_number = serial_number;
    }

    public Customer(String name, String surname, LocalDate birthdate, String fin, String serial_number) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.fin = fin;
        this.serial_number = serial_number;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + birthdate +
                ", fin='" + fin + '\'' +
                ", serial_number='" + serial_number + '\'' +
                '}';
    }
}
