package br.ufpr.tcc.MSForms.models.dto;

import java.util.List;
import br.ufpr.tcc.MSForms.models.Validacao;

public class PerguntaDTO {
    private Long id;
    private String texto;
    private String tipo;
    private Validacao validacao;
    private List<String> opcoes;
    private ConfiguracaoPontuacaoDTO configuracaoPontuacao;
    private MetadadosCampoDTO metadadosCampo;

    public PerguntaDTO() {}

    public PerguntaDTO(Long id, String texto, String tipo, Validacao validacao, List<String> opcoes,
                       ConfiguracaoPontuacaoDTO configuracaoPontuacao, MetadadosCampoDTO metadadosCampo) {
        this.id = id;
        this.texto = texto;
        this.tipo = tipo;
        this.validacao = validacao;
        this.opcoes = opcoes;
        this.configuracaoPontuacao = configuracaoPontuacao;
        this.metadadosCampo = metadadosCampo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Validacao getValidacao() {
        return validacao;
    }

    public void setValidacao(Validacao validacao) {
        this.validacao = validacao;
    }

    public List<String> getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(List<String> opcoes) {
        this.opcoes = opcoes;
    }

    public ConfiguracaoPontuacaoDTO getConfiguracaoPontuacao() {
        return configuracaoPontuacao;
    }

    public void setConfiguracaoPontuacao(ConfiguracaoPontuacaoDTO configuracaoPontuacao) {
        this.configuracaoPontuacao = configuracaoPontuacao;
    }

    public MetadadosCampoDTO getMetadadosCampo() {
        return metadadosCampo;
    }

    public void setMetadadosCampo(MetadadosCampoDTO metadadosCampo) {
        this.metadadosCampo = metadadosCampo;
    }
}
