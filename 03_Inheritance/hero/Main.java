package hero;

public class Main {
    public static void main(String[] args) {
        Elf elf = new Elf("Gosho", 2);
        System.out.println(elf.getClass());
        System.out.println(elf.getClass().getName());

        SoulMaster soulMaster = new SoulMaster("Pesho", 3);
        System.out.println(soulMaster.getClass());
        System.out.println(soulMaster.getClass().getName());
    }
}
