import com.Stackology.Openbank.model.Atendente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Classe de teste para a entidade Atendente.
 * Testa os principais métodos e garante o correto funcionamento.
 * Palavra nova em inglês: "assert" (afirmar, garantir). Exemplo: "We assert that the value is correct."
 */
public class TesteAtendente {
    private Atendente atendente;
    private StringBuilder log;

    /**
     * Inicializa o objeto Atendente e o log antes de cada teste.
     */
    @BeforeEach
    public void setUp() {
        atendente = new Atendente("João", "12345678900", 2000.0, "senha123");
        log = new StringBuilder();
        log.append("Iniciando testes para Atendente.\n");
    }

    /**
     * Testa o método getSenha.
     */
    @Test
    public void testGetSenha() {
        String senha = atendente.getSenha();
        if ("senha123".equals(senha)) {
            log.append("Passo: testGetSenha passou.\n");
        } else {
            log.append("Falha: testGetSenha - senha incorreta.\n");
        }
        Assertions.assertEquals("senha123", senha, log.toString());
    }

    /**
     * Testa o método setSenha.
     */
    @Test
    public void testSetSenha() {
        atendente.setSenha("novaSenha");
        if ("novaSenha".equals(atendente.getSenha())) {
            log.append("Passo: testSetSenha passou.\n");
        } else {
            log.append("Falha: testSetSenha - senha não alterada.\n");
        }
        Assertions.assertEquals("novaSenha", atendente.getSenha(), log.toString());
    }

    /**
     * Testa o método getBonificacao.
     */
    @Test
    public void testGetBonificacao() {
        double esperado = 2000.0 * 0.1 + 100;
        double bonificacao = atendente.getBonificacao();
        if (Double.compare(esperado, bonificacao) == 0) {
            log.append("Passo: testGetBonificacao passou.\n");
        } else {
            log.append("Falha: testGetBonificacao - valor inesperado.\n");
        }
        Assertions.assertEquals(esperado, bonificacao, log.toString());
    }

    /**
     * Testa o método toString.
     */
    @Test
    public void testToString() {
        String texto = atendente.toString();
        if (texto.contains("João") && texto.contains("12345678900")) {
            log.append("Passo: testToString passou.\n");
        } else {
            log.append("Falha: testToString - dados não encontrados.\n");
        }
        Assertions.assertTrue(texto.contains("João") && texto.contains("12345678900"), log.toString());
    }
}
