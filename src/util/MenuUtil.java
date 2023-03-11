package util;
import static util.InputUtil.inputRequiredInteger;
public class MenuUtil {
    public static int entry() {
        System.out.println("\n------ CAR MANAGEMENT SYSTEM ------\n" +
                "\n[0] Exit System" +
                "\n[1] Register car" +
                "\n[2] Show car" +
                "\n[3] Register Customer" +
                "\n[4] Show Customer"
        );
        return inputRequiredInteger("Choose option: ");
    }
}

