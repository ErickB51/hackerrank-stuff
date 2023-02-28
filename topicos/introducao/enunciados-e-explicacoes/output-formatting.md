<h2 align="center">Formatação de Saída — Java Output Formatting</h2>
  <p  align="justify">Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.</p>
  <p  align="justify">To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.</p>

<h4>Formato de Entrada</h4>
  <p  align="justify">Every line of input will contain a String followed by an integer.</p>
  <p align="justify">Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range 0 from to 999.</p>

<h4>Formato de Saída</h4>
  <p  align="justify">In each line of output there should be two columns:</p>

```
1. The first column contains the String and is left justified using exactly 15 characters.
2. The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
```

<h4>Exemplo de Entrada</h4>

```
java 100
cpp 65
python 50
```

<h4>Exemplo de Saída</h4>

```
================================
java           100 
cpp            065 
python         050 
================================
```

<h4>Explicação</h4>
<p  align="justify">Each String is left-justified with trailing whitespace through the first 15 characters. The leading digit of the integer is the 16th character, and each integer that was less than 3 digits now has leading zeroes.</p>

#### O texto acima foi retirado de [Hackerrank](https://www.hackerrank.com/), traduzido e adaptado.

  <br>
  https://github.com/ErickB51/hackerrank-stuff/blob/8769b055c3074f4963398454ddfbf96d580de659/topicos/introducao/codigos/OutputFormatting.java#L1-L25

<h4>Anotações & Observações</h4>

```  
Aqui o objetivo é exibir uma String no formato "nome digito", isto é, onde o nome está
justificado em 15 espaços a esquerda. Existem diversas maneiras de se realizar isso, porém,
nesse caso, optou-se por utilizar o método printf da classe out.
```