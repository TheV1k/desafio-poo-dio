import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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



        /*System.out.println(Curso1);
        System.out.println(Curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp");
        bootcamp.getConteudos().add(Curso1);
        bootcamp.getConteudos().add(Curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVictor = new Dev();
        devVictor.setNome("Victor");
        devVictor.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devVictor.getConteudosInscritos());
        System.out.println("--");
        devVictor.progredir();
        devVictor.progredir();
        devVictor.progredir();
        System.out.println("Conteudos inscritos: " + devVictor.getConteudosInscritos());
        System.out.println("Conteudos finalizados: " + devVictor.getConteudosConcluidos());
        System.out.println("XP: " + devVictor.calcularTotalXp());

        System.out.println("-------------------");

        Dev devCynthya = new Dev();
        devCynthya.setNome("Cynthya");
        devCynthya.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devCynthya.getConteudosInscritos());
        devCynthya.progredir();
        System.out.println("Conteudos inscritos: " + devCynthya.getConteudosInscritos());
        System.out.println("Conteudos finalizados: " + devCynthya.getConteudosConcluidos());
        System.out.println("XP: " + devCynthya.calcularTotalXp());




    }
}