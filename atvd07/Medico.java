public class Medico {
     private String codigo;
     private String nome;
     private String sexo;
     private String especialidade;
     private String endereco;

    public Medico(String codigo, String nome, String sexo, String especialidade, String endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEndereço() {
        return endereco;
    }

    public void setEndereço(String endereço) {
        this.endereco = endereço;
    }

    public String medInfo() {
        return "Médico " + nome + ", código " + codigo + ", sexo " + sexo + ", especialidade = " + especialidade + ", endereço = " + endereco;
    }

    
}
