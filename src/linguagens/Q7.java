package linguagens;

import automata.AutomatoFD;
import automata.Estado;

import java.util.Set;

public class Q7 {
    public static void main(String[] args) {
        Estado q0 = new Estado("q0");
        Estado q1 = new Estado("q1");
        Estado q2 = new Estado("q2");
        Estado q3 = new Estado("q3");
        Estado q4 = new Estado("q4");
        Set<Character> alfabeto = Set.of('0', '1');

        Set<Estado> estados = Set.of(q0, q1, q2, q3, q4);
        Set<Estado> finais = Set.of(q2, q4);

        AutomatoFD automato = new AutomatoFD(alfabeto, estados, q0, finais);
        automato.fazerTransicao(q0, '0', q3);
        automato.fazerTransicao(q0, '1', q1);
        automato.fazerTransicao(q1, '0', q1);
        automato.fazerTransicao(q1, '1', q2);
        automato.fazerTransicao(q2, '0', q1);
        automato.fazerTransicao(q2, '1', q2);
        automato.fazerTransicao(q3, '0', q4);
        automato.fazerTransicao(q3, '1', q3);
        automato.fazerTransicao(q4, '0', q4);
        automato.fazerTransicao(q4, '1', q3);

        String cadeia = "01010101001011111110";

        if (automato.aceita(cadeia)) {
            System.out.println("Cadeia aceita por autômata");
        } else {
            System.out.println("Cadeia rejeitada por autômata");
        }
    }
}
