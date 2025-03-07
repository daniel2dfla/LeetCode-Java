# Pesquisar e Descobrir Posição

Dado um array ordenado de inteiros distintos e um valor alvo, retorna o índice se o alvo for encontrado. Se não, retorna o índice onde ele estaria se fosse inserido em ordem.

Você deve escrever um algoritmo com  O(log n) complexidade de tempo de execução.



* Exemplo 1:

    Entrada: nums = [1,3,5,6], alvo = 5

    Saída: 2


* Exemplo 2:

    Entrada: nums = [1,3,5,6], 

    alvo = 2

    Saída: 1


* Exemplo 3:

    Entrada: nums = [1,3,5,6], 

    alvo = 7

    Saída: 4


Restrições:

1 <= nums.length <= 104

-104 <= nums[i] <= 104

numscontém valores distintos classificados em ordem crescente .

-104 <= target <= 104