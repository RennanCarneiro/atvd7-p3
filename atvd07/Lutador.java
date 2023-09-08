public class Lutador {
    private String nome;
        private int energia;
        private int força;

        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public int getEnergia() {
            return energia;
        }
        public void setEnergia(int energia) {
            this.energia = energia;
        }
        public int getForça() {
            return força;
        }
        public void setForça(int força) {
            this.força = força;
        }
        public void reduzirEnergia(int força) {
            energia = energia - força;
        }
        public void aplicarGolpe(Lutador inimigo) {
            inimigo.reduzirEnergia(força);
        }
}
