class Paciente{
    String codigo;
     String nome;
     String dataNascimento;
     String sexo;
     String planoSaude;
     String alergia;
     String tipoSanguineo;

    public Paciente(String codigo, String nome, String dataNascimento, String planoSaude, String alergia, String tipoSaguineo){
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSaguineo;
    }

    public String toString(){
        return "Paciente: codígo" + codigo + ", nome = " + nome + ", dataNascimento = " + dataNascimento + ", planoSaude = "
                + planoSaude + ", alergia = " + alergia + ", tipoSanguineo = " + tipoSanguineo + ".";
    }

}