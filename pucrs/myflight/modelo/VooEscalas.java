package pucrs.myflight.modelo;
import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscalas {

    public enum Status { CONFIRMADO, ATRASADO, CANCELADO }; 

    private LocalDateTime datahora;
    private Duration duracao;
    private Rota rota;
    private Rota rotaFinal;
    private Status status;

    // Construtor
    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime dh, Duration dur) {
       
    }

    // Gets, etc
    
    
    @Override
    public String toString() {
       return status + " " + datahora + "("+duracao+"): " + rota + " -> " + rotaFinal;
    }

}

