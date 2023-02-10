/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CursoEmVideoAula;

/**
 *
 * @author Amaro
 */
public class CursoEmVideoAula {
    public static void main (String [] args){
       Pessoa p1 = new Pessoa();
       Aluno p2 = new Aluno();
       Professor p3 = new Professor();
       Funcionario p4 = new Funcionario();
       
       p1.setNome("Pedro");
       p2.setNome("Maria");
       p3.setNome("Claudio");
       p3.setNome("Fabi");
       
       p1.setSexo("M");
       p4.setSexo("F");
       p2.setIdade(18);
       
       
       p2.setCurso("informatica");
       p3.setSalario(2500.75f);
       p4.setSetor("Estoque");
       
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
