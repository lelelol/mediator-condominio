package mediator;

public class Pessoa {

    public String elogiarAdministracao(String mensagem) {
        return Ouvidoria.getInstancia().receberElogioAdministracao(mensagem);
    }

    public String reclamarAdministracao(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoAdministracao(mensagem);
    }

    public String sugerirAdministracao(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestaoAdministracao(mensagem);
    }


}
