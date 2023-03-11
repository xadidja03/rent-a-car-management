package queries;

public class CarQuery {
    public static final String ADD_CAR = "INSERT INTO car(brand,model,engine,body_type,production,seats,doors,speed,rent_amount)" + "VALUES(?,?,?,?,?,?,?,?,?)";
    public static final String SHOW_CAR = "SELECT * FROM car ";
}
