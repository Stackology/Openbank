

import com.Stackology.Openbank.model.Funcionario;
import com.Stackology.Openbank.model.Gerente;

public class TesteFuncionario {
    public static void main(String[] args) {
       // Funcionario funcionario = new Funcionario();
       Funcionario funcionario = new Gerente();
        Gerente gerente = new Gerente();

        funcionario.setNome("Martins");
        funcionario.setSalario(1000);
        funcionario.setCargo("Programador");
        
       

        System.out.println(funcionario.toString());
        System.out.println(funcionario.getSalario());
        System.out.println(funcionario.getCargo());
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getBonificacao());

//===========================================================
        gerente.setNome("João");
        gerente.setSalario(20000);
        gerente.setCargo("Gerente"); 

        gerente.setSenha("1234");
       boolean autenticado = gerente.autenticar("1234");

        System.out.println(gerente.toString());
        System.out.println(gerente.getSalario());
        System.out.println(gerente.getCargo());
        System.out.println(gerente.getNome());
        System.out.println(gerente.getBonificacao());

        System.out.println(autenticado);
        
    }
}
