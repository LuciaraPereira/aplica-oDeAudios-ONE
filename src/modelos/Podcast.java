package modelos;

public class Podcast extends Audios{
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /// metodos reutilizaveis ///
    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 500){
            return 10;
        }else {
            return 8;
        }
    }
}
