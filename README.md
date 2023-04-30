![PrimeirosImpares](https://user-images.githubusercontent.com/125104298/235328174-8caa29ea-f874-43fc-a6af-65b1a0f5ff9b.gif)

# N° Inittial odd numbers / Números ímpares iniciais

- The user inputs an integer number, such as "9", and the program returns the first 9 odd numbers.

- O usuário digita um número inteiro, como "9", e o programa retorna os 9 primeiros números ímpares.
 
## How does it work / Como funciona?

In Java, using "while" and two counters, the program first prompts for an integer number and sets that input number as the limit of how far the "odd counter" can go. Then, within the while loop, an "if" statement checks whether the number is odd using the modulo operation by 2. If the number is odd, it adds one to the "odd counter" and one to the other counter (to check whether the next number is odd), and prints the odd number. The loop then goes back to the beginning and moves to the next number. If the number is even, it adds one only to the other counter to check whether the next number is odd. This process continues until the odd counter reaches the limit specified by the user.

Em java, usando "while", e dois contadores, o programa primeiro pede um número inteiro, e define esse número digitado como o limite de até onde o "contador de ímpar " pode ir, e então, dentro do while, um "if" verifica se o número é ímpar usando módulo por 2, se for ímpar, é somado um ao "contador de ímpar" , e um ao outro contador (para assim verificar se o numero seguinte é ímpar), e o número ímpar é impresso, assim o loop volta ao começo e vai para o próximo número, se for par, ele soma mais um apenas para o outro contador, assim verificando se o próximo é ímpar, e assim vai, até o contador de ímpares atingir o limite que o usuário digitou.

## Technologies used / Tecnologias utilizadas:

![Java](https://img.shields.io/badge/-Java-orange)
