public class Medico {
     String codigo;
     String nome;
     String sexo;
     String especialidade;
     String endereco;

    public Medico(String codigo, String nome, String sexo, String especialidade, String endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }

    public String toString() {
        return "Medico: codigo = " + codigo + ", nome = " + nome + ", sexo = " + sexo + ", especialidade = " + especialidade
                + ", endereco = " + endereco + ".";
    }

    
}
