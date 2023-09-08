public class Endereco {
    private String rua;
    private String numero; 
    private String complemento;
    private String bairro;
    private String cidade;
    private String Uf;
    private String cep;

    public Endereco(String rua, String string, String complemento, String bairro, String cidade, String Uf, String string2){
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade; 
        this.Uf = Uf;
        this.cep = cep;
    }
        //METODOS

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
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

        public String getCep() {
            return cep;
        }

        public void setCep(String cep) {
            this.cep = cep;
        }

        @Override
        public String toString() {
            return "Endereço: rua = " + rua + ", numero = " + numero + ", complemento = " + complemento + ", bairro = " + bairro
                + ", cidade = " + cidade + ", Uf = " + Uf + ", cep = " + cep + ".";
    }
    public static void main(String[] args) {
        System.out.println("Dados iniciais: ");
        Endereco Endereço1 = new Endereco("Santo agostinho", "321", "103", "Atlantic", "SeteAlem", "ST", "8934929234");
        System.out.println(Endereço1.toString());
        Endereço1.rua = "Rosa e silva";
        System.out.println("Dados atualizados: ");
        System.out.println(Endereço1.toString());

    }
}
