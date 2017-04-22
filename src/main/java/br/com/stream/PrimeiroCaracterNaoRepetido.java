package br.com.stream;

import java.util.*;

/**
 * Classa java que encapsula o algoritomo para busca da primeira vogal não repetida
 * @author : Claudio Nazareth  chtnazareth@gmail.com
 */
public class PrimeiroCaracterNaoRepetido {

    private static final String VOGAIS = "aeiou";

    /**
     * Retorna um Optional com o primeiro char vogal não repetido encontrado ou um Optional vazio caso não encontre
     * @param stream
     * @return ptional<Character>
     */
    public static Optional<Character> encontraPrimeiraVogalNaoRepetida(Stream stream) {

        if(stream != null) {

            Set<Character> recorrente = new HashSet<>();
            List<Character> naoRecorrente = new ArrayList<>();

            while (stream.hasNext()) { // Faz o uso do haxNext conforme solicitado na questão

                char letra = Character.toLowerCase(stream.getNext());  // Faz o uso do getNext conforme solicitado

                if (recorrente.contains(letra)) {
                    continue;
                }
                if (naoRecorrente.contains(letra)) {
                    naoRecorrente.remove((Character) letra);
                    recorrente.add(letra);
                } else {
                    if (isVogal(letra)) {
                        naoRecorrente.add(letra);
                    }
                }
            }
            try {
                return Optional.of(naoRecorrente.get(0));
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Não foi encontrado nenhuma vogal não repetida");
            }
        }
        return Optional.empty();
    }

    private static boolean isVogal(char letra) {
        return VOGAIS.indexOf(letra) >= 0;
    }
}
