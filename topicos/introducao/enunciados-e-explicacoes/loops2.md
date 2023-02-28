<h2 align="center">Laços de Repetição II — Java Loops II</h2>
  <p  align="justify">Nós utilizaremos os inteiros A, B e N para criar as seguintes séries:</p>

```
(a + 2^0 * b),(a + 2^0 * b + 2^1 * b),...,(a + 2^0 * b + 2^1 * b + ... + 2^n-1 * b)
```
  
  <p  align="justify">Você receberá Q consultas na forma de A, B, e N. Para cada consulta, imprima as séries correspondentes aos valores de A, B, e N na forma de uma única linha de N inteiros separados por espaço.</p>

<h4>Formato de Entrada</h4>

```
A primeira linha contém um inteiro, Q, denotando o número de consultas que serão realizadas.
Cada linha i das Q subsequentes linhas contém três inteiros separados por espaços descrevendo os respectivos valores de Ai, Bi, Ni e os valores para aquela consulta.
```

<h4>Restrições</h4>
	<ul>
		<li>0 <= Q <= 500</li>
		<li>0 <= A, B <= 50</li>
		<li>1 <= N <= 15</li>
	</ul>

<h4>Formato de Saída</h4>
	<p  align="justify">Para cada consulta, imprima as séries correspondentes em uma nova linha. Cada série deve ser impressa em ordem como uma única linha de N inteiros separados por espaço.</p>

<h4>Exemplo de Entrada</h4>

```
2
0 2 10
5 3 5
```

<h4>Exemplo de Saída</h4>

```
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
```

<h4>Explicação</h4>
<p align="justify">Temos duas consultas:</p>
<ol>
	<li>Utilizaremos A = 0, B = 2 e N = 10 para produzir algumas séries</li>
	<p align="justify">S0, S1, ... , SN-1</p>
	<ul>
		<li>S0 = 0 + 1 * 2 = 2</li>
		<li>S1 = 0 + 1 * 2 + 2 * 2 = 6</li>
		<li>S2 = 0 + 1 * 2 + 2 * 2 + 4 * 2 = 14</li>
	</ul>

	<p align="justify">... e assim por diante.</p>

	<p align="justify">Uma vez que atingirmos N = 10, nós iremos imprimir os primeiros dez termos, resultados destas séries de operações, em uma única linha na forma de inteiros separados por espaços.</p>

	<li> Em um outro exemplo, iremos usar A = 5, B = 3 e N = 5 para produzir algums séries (S0, S1, ... , SN-1).</li>
	<ul>
		<li>S0 = 5 + 1 * 3 = 8</li>
		<li>S1 = 5 + 1 * 3 + 2 * 3 = 14</li>
		<li>S2 = 5 + 1 * 3 + 2 * 3 + 4 * 3 = 26</li>
		<li>S3 = 5 + 1 * 3 + 2 * 3 + 4 * 3 + 8 * 3 = 50</li>
		<li>S4 = = 5 + 1 * 3 + 2 * 3 + 4 * 3 + 8 * 3 + 16 * 3 = 98</li>
	</ul>
	<p align="justify">Nós então impriremos cada termo resultante de nossas séries em uma única linha de inteiros separados por espaços.</p>
</ol>

#### O texto acima foi retirado de [Hackerrank](https://www.hackerrank.com/), traduzido e adaptado.

  <br>
  https://github.com/ErickB51/hackerrank-stuff/blob/8769b055c3074f4963398454ddfbf96d580de659/topicos/introducao/codigos/Loops2.java#L1-L50

<h4>Anotações & Observações</h4>

``` 
Outro exemplo da utilização da estrutura de repetição For dentro da linguagem Java, porém, dessa vez estão 
sendo utilizadas as estruturas de seleção vistas previamente neste documento (Se e Senão). É importante 
observar que o valor inicial de X poderia ser atribuído antes do inicio do laço for (no caso do valor 
utilizamos um Se para selecionar a primeira repetição do laço para atribuir o valor inicial de X).
```