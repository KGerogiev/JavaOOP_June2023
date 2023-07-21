package blackBoxInteger;

import java.lang.reflect.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);

        Class clazz = BlackBoxInt.class;
        Constructor<BlackBoxInt> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt object = constructor.newInstance();

        Method[] methods = clazz.getDeclaredMethods();

        String command = scanner.nextLine();

        while (!"END".equals(command)) {
            //"{command name}_{value}"
            String method = command.split("_")[0];
            int value = Integer.parseInt(command.split("_")[1]);

            for (Method token : methods) {
                if (method.equals(token.getName())) {
                    token.setAccessible(true);
                    token.invoke(object, value);
                    Field field = clazz.getDeclaredField("innerValue");
                    field.setAccessible(true);
                    System.out.println(field.get(object));
                }
            }
            command = scanner.nextLine();
        }
    }
}
