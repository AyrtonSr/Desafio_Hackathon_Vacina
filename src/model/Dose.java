public class Dose {
    private int id;
    private int id_vacina;
    private String dose_descricao;
    private int idade_recomenda_aplicacao;

    public Dose(int id, int id_vacina, String dose_descricao, int idade_recomenda_aplicacao){
        this.id = id;
        this.id_vacina = id_vacina;
        this.dose_descricao = dose_descricao;
        this.idade_recomenda_aplicacao = idade_recomenda_aplicacao;
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVacina() {
        return id_vacina;
    }

    public void setIdVacina(int id_vacina) {
        this.id_vacina = id_vacina;
    }

    public String getDose() {
        return dose_descricao;
    }

    public void setDose(String dose_descricao) {
        this.dose_descricao = dose_descricao;
    }

    public int getIdadeRecomendadaAplicacao() {
        return idade_recomenda_aplicacao;
    }

    public void setIdadeRecomendadaAplicacao(int idade_recomenda_aplicacao) {
        this.idade_recomenda_aplicacao = idade_recomenda_aplicacao;
    }

    // Método toString para representação em texto
    @Override
    public String toString() {
        return "Classe Dose{" +
                "id=" + id +
                ", idVacina=" + id_vacina +
                ", dose='" + dose_descricao + '\'' +
                ", idadeRecomendadaAplicacao=" + idade_recomenda_aplicacao +
                '}';
    }
}
