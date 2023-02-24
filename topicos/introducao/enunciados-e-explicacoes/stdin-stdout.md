<h2 align="center">Entrada Padrão e Saída Padrão I — Java Stdin/Stdout (Standard Input/Output) I</h2>
  <p  align="justify">A maioria dos desafios do HackerRank exige que você leia a entrada padrão de dados (também conhecida como Standard In ou, simplesmente, stdin) e grave a saída no fluxo para saída padrão de dados (stdout). Uma maneira popular de ler a entrada do stdin é usar a classe Scanner e especificar o Input Stream como System.in. Por exemplo:</p>

```java
Scanner scanner = new Scanner(System.in);
String myString = scanner.next();
int myInt = scanner.nextInt();
scanner.close();

System.out.println("myString is: " + myString);
System.out.println("myInt is: " + myInt);
```

  <p  align="justify">O código acima cria um objeto Scanner chamado scanner e o utiliza para ler uma String e um int. Em seguida, ele fecha o objeto Scanner porque não há mais entrada para ler e imprime em stdout usando System.out.println(String). Então, se nossa entrada for:</p>

```
Hi 5
```
  <p  align="justify">Nosso código vai fazer com que seja exibido:</p>

```
myString is: Hi
myInt is: 5
```
  <p  align="justify">Alternativamente, você pode usar a classe BufferedReader.</p>

<h4>Tarefa</h4>
  <p  align="justify">Neste desafio, você deve ler inteiros de stdin e depois imprimi-los em stdout. Cada inteiro deve ser impresso em uma nova linha. Para tornar o problema um pouco mais fácil, uma parte do código é fornecida-lhe no editor abaixo.</p>

<h4>Formato de Entrada</h4>
  <p  align="justify">Existem três linhas de entrada, e cada linha contém apenas um inteiro.</p>

<h4>Exemplo de Entrada</h4>

```
42
100
125
```

<h4>Exemplo de Saída</h4>

```
42
100
125
```

#### O texto acima foi retirado de [Hackerrank](https://www.hackerrank.com/), traduzido e adaptado.

  <br>
  https://github.com/ErickB51/hackerrank-stuff/blob/32ce10ba897c342808cb3f9de2c0f694bbf5d288/topicos/introducao/codigos/StdinStdout.java#L1-L22

<h4>Anotações & Observações</h4>

```  
Neste desafio optei por utilizar apenas uma variável para armazenar os três números inteiros, 
isto é, já que não havia necessidade de utilização posterior destes números.
```