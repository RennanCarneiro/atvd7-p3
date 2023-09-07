public class Endereco {
    private String rua;
    private int numero; 
    private String complemento;
    private String bairro;
    private String cidade;
    private String Uf;
    private int cep;

    public Endereco(String rua, int numero, String complemento, String bairro, String cidade, String Uf, int cep){
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade; 
        this.Uf = Uf;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return Uf;
    }

    public void setUf(String uf) {
        this.Uf = uf;
    }

    public int getCEP() {
        return cep;
    }

    public void setCEP(int CEP) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String endereçoStr() {
        return rua + ", " + complemento + ", " + numero +  ", CEP " + cep + ", bairro: " + bairro + ", cidade: " + cidade + ", " + Uf + ".";
    }
}

