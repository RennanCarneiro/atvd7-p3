import java.util.Scanner;

public class MainPaciente {
    public static void main(String[] args) {
        //Declaraçoes
            Scanner in = new Scanner(System.in);
            /*String codigo, nome, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo;*/

            String nome, codigo, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo;
            Paciente paciente1;
            paciente1 = new Paciente(nome = null, codigo = null, dataNascimento = null, sexo = null, planoSaude = null, alergia = null, tipoSanguineo = null);

            //exibir meu cadastro
            String out1 = paciente1.toString();
            System.out.println(out1);

            //Sobrescrever novo cadastro
            System.out.println('\n' +"Qual o nome do paciente: ");
            paciente1.setNome(in.nextLine());
            System.out.println("Qual o codigo do paciente: ");
            paciente1.setCodigo(in.nextLine());
            System.out.println("Qual a data de nascimento do paciente: ");
            paciente1.setDataNascimento(in.nextLine());
            System.out.println("Qual o sexo do paciente: ");
            paciente1.setSexo(in.nextLine());
            System.out.println("Qual o plano de saúde do paciente: ");
            paciente1.setPlanoSaude(in.nextLine());
            System.out.println("O paciente tem alergia à: ");
            paciente1.setAlergia(in.nextLine());
            System.out.println("Qual o tipo sanguineo do paciente: ");
            paciente1.setTipoSanguineo(in.nextLine());

            //Chamar metodo toString
            String out2 = paciente1.toString();
            System.out.println(out2);
    }


    
        }
