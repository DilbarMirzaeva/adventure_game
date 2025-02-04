package adventure_game.util;

import java.util.Scanner;

public class InputUtil {
    public static final Scanner sc = new Scanner(System.in);

    public static <T> T getText(String tittle, Class<T> type) {

        System.out.print(tittle);

        while (true) {
            String input = sc.nextLine();
            try {
                if (type == Integer.class) {
                    return type.cast(Integer.parseInt(input));
                } else if (type == Double.class) {
                    return type.cast(Double.parseDouble(input));
                } else if (type == Boolean.class) {
                    return type.cast(Boolean.parseBoolean(input));
                }else {
                return type.cast(input);
                }
            }
            catch (NumberFormatException e) {
                System.out.println( "Invalid age,try again(input integer)..");
            }
        }
    }
}
