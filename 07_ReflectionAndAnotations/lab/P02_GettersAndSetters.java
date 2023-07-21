package lab;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.TreeMap;

public class P02_GettersAndSetters {
    public static void main(String[] args) {
        Class clazz = Reflection.class;

        Method[] methods = clazz.getDeclaredMethods();

        Map<String, Method> getters = findGetters(methods);
        Map<String, Method> setters = findSetters(methods);

        getters.entrySet()
                .forEach(e -> System.out.printf("%s will return %s%n", e.getKey(), e.getValue().getReturnType()));

        setters.forEach((key, value) -> System.out.printf("%s and will set field of %s%n", key, value.getParameterTypes()[0]));

    }

    private static Map<String, Method> findSetters(Method[] methods) {
        Map<String, Method> setters = new TreeMap<>();
        for (Method method : methods) {
            if (method.getName().startsWith("set")) {
                setters.put(method.getName(), method);
            }
        }
        return setters;
    }

    public static Map<String, Method> findGetters(Method[] methods) {
        Map<String, Method> getters = new TreeMap<>();
        for (Method method : methods) {
            if (method.getName().startsWith("get")) {
                getters.put(method.getName(), method);
            }
        }
        return getters;
    }
}
