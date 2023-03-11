package queries;

public class CustomerQuery {
    public static final String ADD_CUSTOMER="INSERT INTO customer(name,surname,birthdate,fin,serial_number)"+"VALUES(?,?,?,?,?)";
    public static final String SHOW_CUSTOMER="SELECT * FROM customer";
}
