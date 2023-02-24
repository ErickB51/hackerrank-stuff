<h2 align="center">Entrada Padrão e Saída Padrão II — Java Stdin/Stdout (Standard Input/Output) II</h2>
  <p  align="justify">Neste desafio, você deve ler um inteiro, um número flutuante de precisão dupla e uma String de stdin e, em seguida, imprimir os valores conforme as instruções na seção Formato de Saída abaixo. Para tornar o problema um pouco mais fácil, uma parte do código é fornecida-lhe no editor.</p>
  <p  align="justify">Observação: recomendamos concluir Java Stdin e Stdout I antes de tentar este desafio.</p>

<h4>Formato de Entrada</h4>
  <p  align="justify">Existem três linhas de entrada:</p>

```
A primeira linha contém um inteiro.
A segunda linha contém um flutuante de precisão dupla (double).
A terceira linha contém uma String.
```

<h4>Formato de Saída</h4>
  <p  align="justify">Deverão existir três linhas de saída:</p>

```
1. Na primeira linha, imprima "String:" seguido pela String inalterada lida de stdin.
2. Na segunda linha, imprima "Double:" seguido pelo double inalterado lido de stdin.
3. Na terceira linha, imprima "Int:" seguido pelo inteiro inalterado lido de stdin.
```

  <p  align="justify">Para facilitar o problema, uma parte do código já é fornecida no editor.</p>
  <p  align="justify">Observação: se você usar o método nextLine() imediatamente após o método nextInt(), lembre-se de que nextInt() lê tokens inteiros; por causa disso, o último caractere de nova linha para essa linha de entrada de inteiro ainda está na fila no buffer de entrada e o próximo nextLine() estará lendo o restante da linha de inteiro (que está vazia).</p>

<h4>Exemplo de Entrada</h4>

```
42
3.1415
Welcome to HackerRank's Java tutorials!
```

<h4>Exemplo de Saída</h4>

```
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
```

#### O texto acima foi retirado de [Hackerrank](https://www.hackerrank.com/), traduzido e adaptado.

  <br>
  https://github.com/ErickB51/hackerrank-stuff/blob/32ce10ba897c342808cb3f9de2c0f694bbf5d288/topicos/introducao/codigos/StdinStdout2.java#L1-L24

<h4>Anotações & Observações</h4>

```  
É importante ressaltar, principalmente neste desafio, que a utilização do método nextLine() da 
classe Scanner, isto é, em seguida a chamada de nextDouble(), nextInt() e afins, deve ser 
precedida pela chamada deste mesmo método. Isto ocorre em virtude do funcionamento dos 
métodos que, na verdade, buscam tokens.
```