package lab;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class P01_Reflection {
    public static void main(String[] args) throws NoSuchFieldException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Class clazz = Reflection.class;

        //System.out.println(clazz.getTypeName());
        System.out.println(clazz);
        System.out.println(clazz.getSuperclass());
        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }

        try {
            Constructor<Reflection> publicConstrucor = clazz.getConstructor();
            Reflection reflection = publicConstrucor.newInstance();
            System.out.println(reflection);
        } catch (Exception e) {
            System.out.println("Exeption found!");
        }

        /*Constructor<Lab.Reflection> constructor = clazz.getDeclaredConstructor(String.class, String.class, String.class);
        constructor.setAccessible(true);
        Object myObject = constructor.newInstance("Gosho", "Gosho.com", "Gosho@abv.bg");
        System.out.println(myObject);


        Field[] fields = clazz.getDeclaredFields();
        Field field = clazz.getDeclaredField("zip");
        field.setAccessible(true);
        field.set(myObject, 4444);
        System.out.println(myObject);*/

    }
}
