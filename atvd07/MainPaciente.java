

public class MainPaciente {
    public static void main(String[] args) {
        System.out.println("Dados do paciente: ");
        Paciente paciente1 = new Paciente(" 3213861289 ", "Rennan", "01/04/2003", "Sulamerica" , "Poeira", "A+");
        System.out.println(paciente1.toString());
        paciente1.codigo = " 1234567890";
        paciente1.nome = "Paula";
        paciente1.dataNascimento = "15/01/1975";
        paciente1.planoSaude = "Bradesco";
        paciente1.alergia = "Poeira";
        paciente1.tipoSanguineo = "B+";
        System.out.println("Dados da mãe: ");
        System.out.println(paciente1.toString());
    
        }
}
