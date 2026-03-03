public class TestaSmartTv {
    public static void main(String[] args){

        SmartTv obj2 = new SmartTv();
        System.out.println(obj2.toString());

        SmartTv obj1 = new SmartTv("Samsung", "32 polegadas", 0);

        System.out.println(obj1.toString());
        // altera o volume
        obj1.setVolume(30);
        obj1.setVolume(120);
        System.out.println("Valor do volume " + obj1.getVolume());

        SmartTv obj3 = new SmartTv("LG", "32 widescreen", -120);
        System.out.println(obj3.toString());
        obj3.setVolume(30);
        obj3.entrarYouTube();

    }
}
