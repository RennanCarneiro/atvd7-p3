public class EnderecoMain {
    public static void main(String[] args) {   
    
    Endereco endereco1 = new Endereco(null, 0, null, null, null, null, 0);
    endereco1.setBairro("Rocas");
    endereco1.setCEP(59012-100);
    endereco1.setCidade("Natal");
    endereco1.setUf("RN");
    endereco1.setRua("Rua General Glicério");
    endereco1.setComplemento("Apt 103");
    endereco1.setNumero(312);
    System.out.println("2- ");
    System.out.println(endereco1.endereçoStr());
    System.out.println("------------");
    
}
}