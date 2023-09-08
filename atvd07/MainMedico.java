

public class MainMedico {
    public static void main(String[] args) {

        System.out.println("Dados iniciais: ");
        Medico Medico1 = new Medico("1234567890", "Fernando", "Masculino", "Ortopedista", "17 de Agosto");
        System.out.println(Medico1.toString());
        Medico1.setNome("Manuel");
        System.out.println("Dados atualizados: ");
        System.out.println(Medico1.toString());

    }
}
