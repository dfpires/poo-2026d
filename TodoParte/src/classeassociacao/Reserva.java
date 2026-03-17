package classeassociacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private int id;
    private LocalDateTime data;
    private int poltrona;
    private Passageiro passageiro;
    private Voo voo;

    public Reserva() {
    }

    public Reserva(int id, LocalDateTime data, int poltrona, Passageiro passageiro, Voo voo) {
        this.id = id;
        this.data = data;
        this.poltrona = poltrona;
        this.passageiro = passageiro;
        this.voo = voo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'mm");
        return "Reserva{" +
                "id=" + id +
                ", data=" + data.format(formatoBR) +
                ", poltrona=" + poltrona +
                ", \npassageiro=" + passageiro +
                ", \nvoo=" + voo +
                '}';
    }
}
