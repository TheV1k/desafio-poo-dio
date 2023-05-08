package one.digitalinnovation;

public class ListaEncadeada <T> {

    No<T> referenciaEntrada;

    public listaEncadeada(){
        this.referenciaEntrada = null;


    }

    public int size (){
            int tamanhoLista = 0;
            No <T> refAuxiliar = referenciaEntrada;
            while (true){
                if(refAuxiliar != null){
                    tamanhoLista++;
                    if (refAuxiliar.getProximoNo() != null){
                        refAuxiliar = refAuxiliar.getProximoNo();

                    }else {
                        break;
                    }

                }else {
                    break;
                }

            }

            return tamanhoLista;

    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;

    }
}
