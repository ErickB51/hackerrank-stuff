<h2 align="center">Formatação de Saída — Java Output Formatting</h2>
  <p  align="justify">A função System.out.printf do Java pode ser usada para imprimir a saída formatada. O objetivo deste exercício é testar sua compreensão de formatação da saída usando printf.</p>
  <p  align="justify">Para começar, uma parte da solução é fornecida no editor; você deve formatar e imprimir a entrada para concluir a solução.</p>

<h4>Formato de Entrada</h4>
  <p  align="justify">Cada linha de entrada conterá uma String seguida por um inteiro.</p>
  <p align="justify">Cada String terá no máximo 10 caracteres alfabéticos, e cada número inteiro estará no intervalo inclusivo de 0 a 999.</p>

<h4>Formato de Saída</h4>
  <p  align="justify">Em cada linha de saída deve haver duas colunas:</p>

```
1. A primeira coluna contém a String e é justificada à esquerda usando exatamente 15 caracteres.
2. A segunda coluna contém o inteiro, expresso em exatamente 3 dígitos; se a entrada original 
tiver menos de três dígitos, você deve preencher os dígitos iniciais de sua saída com zeros.
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
<p  align="justify">Cada String é justificada à esquerda com espaços em branco nos primeiros 15 caracteres. O dígito inicial do número inteiro é o 16º caractere, e cada número inteiro com menos de 3 dígitos agora tem zeros iniciais.</p>

#### O texto acima foi retirado de [Hackerrank](https://www.hackerrank.com/), traduzido e adaptado.

  <br>
  https://github.com/ErickB51/hackerrank-stuff/blob/8769b055c3074f4963398454ddfbf96d580de659/topicos/introducao/codigos/OutputFormatting.java#L1-L25

<h4>Anotações & Observações</h4>

```  
Aqui o objetivo é exibir uma String no formato "nome dígito", isto é, onde o nome está
justificado em 15 espaços à esquerda. Existem diversas maneiras de se realizar isto, porém,
nesse caso, optou-se por utilizar o método printf da classe out (de acordo com as recomen
dações propostas pelo desafio).
```
