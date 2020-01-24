# heapsort

## Definição
Tem um desempenho em tempo de execução muito bom em conjuntos ordenados aleatoriamente, tem um uso de memória bem comportado e o seu desempenho em pior cenário é praticamente igual ao desempenho em cenário médio. Alguns algoritmos de ordenação rápidos têm desempenhos espectacularmente ruins no pior cenário, quer em tempo de execução, quer no uso da memória. O heapsort trabalha no lugar e o tempo de execução em pior cenário para ordenar "n" elementos é de O (n lg n). Lê-se logaritmo (ou log) de "n" na base 2. Para valores de n, razoavelmente grandes, o termo log n é quase constante, de modo que o tempo de ordenação é quase linear com o número de itens a ordenar.

## Estabilidade
O heapsort não é um algoritmo de ordenação estável. Porém, é possível adaptar a estrutura a ser ordenada de forma a tornar a ordenação estável. Cada elemento da estrutura adaptada deve ficar no formato de um par (elemento original, índice original). Assim, caso dois elementos sejam iguais, o desempate ocorrerá pelo índice na estrutura original.

## Funcionamento
O heapsort utiliza uma estrutura de dados chamada heap, para ordenar os elementos à medida que os insere na estrutura. Assim, ao final das inserções, os elementos podem ser sucessivamente removidos da raiz da heap, na ordem desejada, lembrando-se sempre de manter a propriedade de max-heap.

A heap pode ser representada como uma árvore (uma árvore binária com propriedades especiais) ou como um vetor. Para uma ordenação decrescente, deve ser construída uma heap mínima (o menor elemento fica na raiz). Para uma ordenação crescente, deve ser construído uma heap máxima (o maior elemento fica na raiz).


Fontes: https://pt.wikipedia.org/wiki/Heapsort | https://www.geeksforgeeks.org/java-program-for-heap-sort/
