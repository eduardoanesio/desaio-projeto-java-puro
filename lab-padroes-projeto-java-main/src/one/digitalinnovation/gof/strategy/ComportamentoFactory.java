package one.digitalinnovation.gof.strategy;

/**
 * Comportamento Factory = adição de novos comportamentos sem que seja necessário mexer no código fonte".
 *
 *
 * @author eduardoanesio
 */

public class ComportamentoFactory {

    public Comportamento getComportamento(String tipo) {
        switch (tipo.toLowerCase()) {
            case "defensivo":
                return new ComportamentoDefensivo();
            case "normal":
                return new ComportamentoNormal();
            case "agressivo":
                return new ComportamentoAgressivo();
            default:
                throw new IllegalArgumentException("Tipo de comportamento desconhecido: " + tipo);
        }
    }
}