package classeassociacao;

import com.sun.security.jgss.GSSUtil;

import java.time.LocalDateTime;
import java.util.Date;

public class TestaAgencia {
    public static void main(String[] args){
        Passageiro pas1 = new Passageiro("123", "Fulano");

        LocalDateTime dataVoo = LocalDateTime.of(2026, 7, 12, 10, 0);
        Voo vo1 = new Voo(999, "Congonhas", "BRB", dataVoo);

        System.out.println(pas1.toString());
        System.out.println(vo1.toString());

    }
}
