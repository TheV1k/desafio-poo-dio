import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso Curso1 = new Curso();
        Curso1.setTitulo("Curso Java");
        Curso1.setDescricao("Descrição curso Java");
        Curso1.setCargaHoraria(8);

        Curso Curso2 = new Curso();
        Curso2.setTitulo("Curso Python");
        Curso2.setDescricao("Descrição curso Python");
        Curso2.setCargaHoraria(16);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mantoria Java");
        mentoria.setData(LocalDate.now());


        System.out.println(Curso1);
        System.out.println(Curso2);
        System.out.println(mentoria);




    }
}