package homeworks.hw_27.computer;

/*** Author: Roman Romashko Date: 06.03.2025 ***/




public class CompApp {
    public static void main(String[] args) {
        Proc processor = new Proc("Pentium", "x486");
        Mem memory = new Mem("Kingston", "8Mb");

        Comp computer = new Comp(processor, memory);

        System.out.println(computer); // без накопителя

        Stor storage = new Stor("Samsung", "1GB");
        computer.setStor(storage);

        System.out.println(computer); // с накопителем
    }
}
