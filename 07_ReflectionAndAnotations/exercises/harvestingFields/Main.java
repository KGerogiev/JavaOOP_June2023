package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Class clazz = RichSoilLand.class;

        while (!"HARVEST".equals(command)) {


            Field[] fields = clazz.getDeclaredFields();

            Consumer<Field> myField = field -> System.out.printf("%s %s %s%n",
                    Modifier.toString(field.getModifiers()),
                    field.getType().getSimpleName(),
                    field.getName());

            if ("private".equals(command)) {

                Arrays.stream(fields).filter(field -> Modifier.isPrivate(field.getModifiers()))
                        .forEach(myField);

            } else if ("protected".equals(command)) {

                Arrays.stream(fields).filter(field -> Modifier.isProtected(field.getModifiers()))
                        .forEach(myField);

            } else if ("public".equals(command)) {
                for (Field field : fields) {
                    String access = Modifier.toString(field.getModifiers());
                    String returnType = field.getType().getSimpleName();
                    String name = field.getName();
                    if ("public".equals(access)) {
                        System.out.printf("%s %s %s%n", access, returnType, name);
                    }
                }
            } else if ("all".equals(command)) {

                Arrays.stream(fields).forEach(myField);

            }
            command = scanner.nextLine();
        }
    }
}
