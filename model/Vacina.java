import java.util.List;

public class Vacina {
    private int id;
    private String nome;
    private String descricao;
    private Integer limiteIdadeMeses; // Limite de idade em meses (pode ser nulo)
    private List<PublicoAlvo> publicoAlvo;

    // Enumeração para o público-alvo
    public enum PublicoAlvo {
        CRIANCA, ADOLESCENTE, ADULTO, GESTANTE
    }

    // Construtor
    public Vacina(int id, String nome, String descricao, Integer limiteIdadeMeses, List<PublicoAlvo> publicoAlvo) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.limiteIdadeMeses = limiteIdadeMeses;
        this.publicoAlvo = publicoAlvo;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getLimiteIdadeMeses() {
        return limiteIdadeMeses;
    }

    public List<PublicoAlvo> getPublicoAlvo() {
        return publicoAlvo;
    }


   

      
}

