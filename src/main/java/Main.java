import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", "Aprender a trabalhar com Java", 8);
        Curso curso2 = new Curso("JavaScript", "Aprender a trabalhar com JavaScript", 4);
        Mentoria mentoria1 = new Mentoria("Mentoria de Java", "Boas práticas com Java", LocalDate.now());
        System.out.println(mentoria1);
        System.out.println(curso1);
    }
}
