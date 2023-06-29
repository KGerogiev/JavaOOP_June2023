package P03_RandomArrayList_LAB;

public class Main {

    public static void main(String[] args) {

        RandomArrayList randomArrayList = new RandomArrayList();

        randomArrayList.add(23);
        randomArrayList.add(56);
        randomArrayList.add(40);
        randomArrayList.add(1);
        randomArrayList.add(5);

        randomArrayList.getRandomElement();
        System.out.println();
    }
}
