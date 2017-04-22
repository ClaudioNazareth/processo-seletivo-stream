# Sobre o Projeto 

Dada uma stream, encontre o primeiro caractere Vogal, após uma consoante,
onde a mesma é antecessora a uma vogal e que não se repita no resto da stream. O
termino da leitura da stream deve ser garantido através do método hasNext(), ou
seja, retorna falso para o termino da leitura da stream. Voce tera acesso a leitura da
stream através dos métodos de interface fornecidos ao termino do enunciado. 

**Premissas:**

- Uma chamada para hasNext() ir retornar se a stream ainda contem caracteres para processar.

- Uma chamada para getNext() ir retornar o proximo caractere a ser processado na stream.

- Não será possível reiniciar o fluxo da leitura da stream.

**Não poderá ser utilizado nenhum framework Java, apenas código nativo.**

Exemplo:

_Input_:  **aAbBABacafe**

_Output_: **e**

No exemplo, ‘e’ é o primeiro caractere Vogal da stream que não se repete após a primeira

Consoante ‘f’o qual tem uma vogal ‘a’ como antecessora.

Segue o exemplo da interface em Java:

public interface Stream{

    public char getNext();

    public boolean hasNext();

}

public static char firstChar(Stream input) {

}

# Resolução

Foi criado a Inteface Java **Stream** confome o enunciado e uma implementação **StreamImpl** 
Esta Interface recebe uma String como parametro na sua construção que será usada no algoritimo para busca da primeira 
**vogal** não repetida.
Toda o algoritimo para encontrar o caracter esta contido dentro da classe java **PrimeiroCaracterNaoRepetido** no métodp
estático **encontraPrimeiraVogalNaoRepetida**

Dentro do pacote de testes encontra -se classe **PrimeiroCaracterNaoRepetidoTest** a qual testa 8 cenários , incluindo se foram
ou não passado valores nulos,  métodos **hasNext()** e **getNext()** e obviamente casos em que deve e não deve ser encontra
a vogal não repetida

_* Os únicos códigos não nativos utilizados foram os dos frameworks AssertJ e Junit , utilizados somente para os testes!_






