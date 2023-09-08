class Paciente{
    //atributos
    private String codigo, nome, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo;

    //construtores
    public Paciente(String codigo, String nome, String dataNascimento, String sexo, String planoSaude, String alergia, String tipoSanguineo){
        this.codigo = "12475320523" ;
        this.nome = "Rennan ";
        this.dataNascimento = "01/04/2003";
        this.sexo = "Masculino";
        this.planoSaude = "Plano1";
        this.alergia = "Suor";
        this.tipoSanguineo = "A-";
    }
    @Override
    public String toString() {
        return "Dados do Paciente, " + nome + ": " + '\n' +
                "==============================" + '\n' +
                "codigo: " + codigo + '\n' +
                "nome: " + nome + '\n' +
                "dataNascimento: " + dataNascimento + '\n' +
                "sexo: " + sexo + '\n' +
                "planoSaude: " + planoSaude + '\n' +
                "alergia: " + alergia + '\n' +
                "tipoSanguineo: " + tipoSanguineo;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

}