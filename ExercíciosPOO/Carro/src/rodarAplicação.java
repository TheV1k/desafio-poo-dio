import java.util.Scanner;

public class rodarAplicação {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Carro carro= new Carro();

        System.out.println("Insira o modelo: ");
        carro.setModelo(sc.next());
        System.out.println("Insira cor: ");
        carro.setCor(sc.next());
        System.out.println("Insira a .capacidade do tanque: ");
        carro.setCapacidadeTanque(sc.nextInt());


        System.out.println("O carro que você está adquirindo é um: " + carro.getModelo() + ", na cor " + carro.getCor() + ". O valor do tanque cheio é " + carro.getCapacidadeTanque());
        System.out.println("O valor do tanque cheio é R$"+ carro.totalValorTanque(4.5) );
    }


}
