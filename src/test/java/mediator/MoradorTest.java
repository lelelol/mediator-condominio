package mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoradorTest {

    @Test
    void deveElogiarAdministracao() {
        Morador morador = new Morador();
        assertEquals("A Ouvidoria agradece seu contato.\nA Administração respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Administração agradece a mensagem: Ótimo atendimento",
                morador.elogiarAdministracao("Ótimo atendimento"));
    }

    @Test
    void deveReclamarAdministracao() {
        Morador morador = new Morador();
        assertEquals("A Ouvidoria agradece seu contato.\nA Administração respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Administração vai procurar melhorar o serviço da reclamação: Barulho após as 22h",
                morador.reclamarAdministracao("Barulho após as 22h"));
    }

    @Test
    void deveSugerirAdministracao() {
        Morador morador = new Morador();
        assertEquals("A Ouvidoria agradece seu contato.\nA Administração respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Administração vai analisar a sugestão: Ampliar horário da academia",
                morador.sugerirAdministracao("Ampliar horário da academia"));
    }

}
