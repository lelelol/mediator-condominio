package mediator;

public class Administracao implements Setor {

    private static Administracao instancia = new Administracao();

    private Administracao() {}

    public static Administracao getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A Administração vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A Administração agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A Administração vai analisar a sugestão: " + mensagem;
    }
}
