public class TestaSmartTv {
    public static void main(String[] args){

        SmartTv obj1 = new SmartTv("Samsung", "32 polegadas", 0);
        System.out.println(obj1.toString());
        // altera o volume
        obj1.setVolume(30);
        System.out.println("Valor do volume " + obj1.getVolume());

    }
}
