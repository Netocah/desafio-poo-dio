import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JS");
        curso2.setDescricao("Descricao do curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição de Mentoria Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devNeto = new Dev();
        devNeto.setNome("Neto");
        devNeto.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos do Neto: " + devNeto.getConteudosInscritos());
        devNeto.progredir();
        devNeto.progredir();
        System.out.println("Conteudos Inscritos do Neto: " + devNeto.getConteudosInscritos());
        System.out.println("Conteudos Concluídos do Neto: " + devNeto.getConteudosConcluidos());
        System.out.println("XP: " + devNeto.calcularXp());
        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
*/
    }
}
