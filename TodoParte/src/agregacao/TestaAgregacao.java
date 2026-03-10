package agregacao;

public class TestaAgregacao {
    public static void main(String[] args){
        Empresa google = new Empresa(1, "Google", "1234");

        FreeLancer fl1 = new FreeLancer(10, "Maria", "Programadora");

        FreeLancer fl2 = new FreeLancer(11, "João", "Scrum Master");

        FreeLancer fl3 = new FreeLancer(12, "Carla", "Gerente de projeto");

        // adiciona freelancers na empresa
        google.adicionaFreeLancer(fl1);
        google.adicionaFreeLancer(fl2);
        google.adicionaFreeLancer(fl3);
        System.out.println(google.toString());
        google.removeFreeLancer(fl2);
        System.out.println(google.toString());
    }
}
