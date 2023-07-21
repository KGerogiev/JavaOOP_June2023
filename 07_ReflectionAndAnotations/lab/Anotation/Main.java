package lab.Anotation;

import lab.Reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Class clazz = Reflection.class;

       Method[] methods = clazz.getDeclaredMethods();

        Map<String, List<String>> result = new TreeMap<>();
        result.put("Georgi", new ArrayList<>());
        result.put("Peter", new ArrayList<>());

        for (Method method : methods) {
            Author author = method.getAnnotation(Author.class);
            if (null == author) {
                continue;
            }
            if ("Georgi".equals(author.name())) {
                result.get("Georgi").add(method.getName());
            }
            if ("Peter".equals(author.name())) {
                result.get("Peter").add(method.getName());
            }

        }

        result.entrySet().forEach(e -> {
            System.out.println(e.getKey() + " worked on methods: ");
            e.getValue().forEach(t -> System.out.println(t));
        });
    }
}
