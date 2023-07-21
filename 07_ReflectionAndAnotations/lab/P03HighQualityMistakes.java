package lab;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class P03HighQualityMistakes {
    public static void main(String[] args) {
        Class clazz = Reflection.class;

        //Обработка на полетата
       Arrays.stream(clazz.getDeclaredFields())
                .filter(field -> !Modifier.isPrivate(field.getModifiers()))
                .sorted(Comparator.comparing(Field::getName))
                .forEach(field -> System.out.printf("%s must be private!%n", field.getName()));

        /*for (Field field : fields) {
            //String mod = Modifier.toString(field.getModifiers());
            if (!Modifier.isPrivate(field.getModifiers())) {
                System.out.printf("%s must be private!%n", field.getName());
            }
        }*/

        //Обработка на Getters
        Arrays.stream(clazz.getDeclaredMethods())
                .filter(method -> method.getName().startsWith("get"))
                .filter(method -> !Modifier.isPublic(method.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(method -> System.out.printf("%s have to be public!%n", method.getName()));


        /*for (Method getter : getters) {
            if (!Modifier.isPublic(getter.getModifiers())) {
                System.out.printf("%s have to be public!%n", getter.getName());
            }
        }*/

        //Обработка на Setters
        Arrays.stream(clazz.getDeclaredMethods())
                .filter(method -> method.getName().startsWith("set") && !Modifier.isPrivate(method.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(method -> System.out.printf("%s have to be private!%n", method.getName()));


        /*for (Method setter : setters) {
            if (!Modifier.isPrivate(setter.getModifiers())) {
                System.out.printf("%s have to be private!%n", setter.getName());
            }
        }*/
    }
}
