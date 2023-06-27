package ShoppingSpree_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] peopleInput = scanner.nextLine().split(";");
        String[] productsInput = scanner.nextLine().split(";");

        List<Person> personList = new ArrayList<>();

        //Creating people
        for (int people = 0; people < peopleInput.length; people++) {
            String[] personData = peopleInput[people].split("=");

            String name = personData[0];
            double money = Double.parseDouble(personData[1]);

            try {
                Person person = new Person(name, money);
                personList.add(person);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        List<Product> productList = new ArrayList<>();

        //Creating products
        for (int product = 0; product < productsInput.length; product++) {
            String[] productData = productsInput[product].split("=");

            String name = productData[0];
            double cost = Double.parseDouble(productData[1]);

            try {
                Product currentProduct = new Product(name, cost);
                productList.add(currentProduct);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        //Start shopping
        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String[] data = command.split("\\s+");
            String name = data[0];
            String product = data[1];
            int indexOfPerson = findPerson(personList, name);
            int indexOfProduct = findProduct(productList, product);

            try {
                personList.get(indexOfPerson).buyProduct(productList.get(indexOfProduct));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            command = scanner.nextLine();
        }

        personList.forEach(e -> System.out.println(e.toString()));
    }

    private static int findPerson(List<Person> personList, String name) {
        int index = 0;
        for (Person person : personList) {
            if (name.equals(person.getName())) {
                index = personList.indexOf(person);
                break;
            }
        }
        return index;
    }

    private static int findProduct(List<Product> productsList, String name) {
        int index = 0;
        for (Product product : productsList) {
            if (name.equals(product.getName())) {
                index = productsList.indexOf(product);
                break;
            }
        }
        return index;
    }
}
