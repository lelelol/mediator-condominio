package mediator;

public class Ouvidoria {

    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {}

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String receberElogioAdministracao(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "A Administração respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Administracao.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoAdministracao(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "A Administração respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Administracao.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoAdministracao(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "A Administração respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Administracao.getInstancia().receberSugestao(mensagem);
    }

}
