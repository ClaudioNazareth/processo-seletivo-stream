package br.com.stream;

/**
 * Implementação da interface Strem conforme solicitado na Questão
 * @author : Claudio Nazareth  chtnazareth@gmail.com
 */
public class StreamImpl implements Stream {

    private String entrada;

    private int indexAtual = -1;

    public StreamImpl(String entrada) {
        if(entrada != null) {
            this.entrada = entrada;
        }else{
            this.entrada = "";
        }
    }

    @Override
    public char getNext() {
        indexAtual++;
        return entrada.charAt(indexAtual);
    }

    @Override
    public boolean hasNext() {
        try {
            entrada.charAt(indexAtual +1);
            return true;
        }catch (IndexOutOfBoundsException ex){
            //Não existe mais nenhum caracter na String
        }
        return false;
    }
}
