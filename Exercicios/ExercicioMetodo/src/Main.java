public class Main {

        public static void main(String[] args) {

            //Exercício 1 - Calculadora
            System.out.println("Exercício Calculadora");
            Calculadora.soma(5, 2);
            Calculadora.subtracao(3, 1.5);
            Calculadora.multiplicacao(4, 4);
            Calculadora.divisao(6, 3);

            //Exercício 2 - Mensagem

            System.out.println("Exercício Mensagem");

            Mensagem.obterMensagem(9);
            Mensagem.obterMensagem(15);
            Mensagem.obterMensagem(22);

            //Exercício 3 - Empréstimo

            System.out.println("Exercício Empréstimo");

            Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
            Emprestimo.calcular(1000,Emprestimo.getTresParcelas());
            Emprestimo.calcular(1000,5);

        }
    }
