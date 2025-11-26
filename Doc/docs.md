# Projeto A3 – Teoria da Computação e Compiladores

## ÂNIMA EDUCAÇÃO 
---
### PROJETO A3 – TEORIA DA COMPUTAÇÃO E COMPILADORES


ALEXANDRE FARIA MELO COSTA - RA: 323220690

WESLEY DA AVILLA BASTOS - RA: 12524233840

ARTHUR ANDRADE ROSA - RA: 1252211622843

CAIQUE DA SILVA MIRANDA SANTOS – RA: 12723216257

ANTONIO C. R. OLIVEIRA RUSSO – RA: 12523118842 


PROJETO DE DESENVOLVIMENTO DO COMPILADOR 

Orientadores: Augusto Mendes Gomes Junior e 

Wanfranklin de Carvalho Moreira Alves 


 

NOVEMBRO / 2025 

CÓDIGO FONTE



ARQUIVOS COM EXTENSÃO DO AntLR 

DETALHAMENTO DA LINGUAGEM CRIADA: 

Gramática da Linguagem

Aspectos Gerais:

O nome escolhido para a linguagem foi “Marte”. A gramática desta linguagem é regida pelas seguintes características:

Possui os tipos de variáveis inteiros, decimais e booleanos. 

Possui estruturas de controle dos tipos IF e IF/ELSE.

Possui estrutura de repetições dos tipos FOR e WHILE.

Possui declarações de atribuição.

Possui comandos de entrada de teclado (SCAN) e saída (PRINT).



Para realizar uma declaração, a estrutura segue o padrão das linguagens comuns, com o tipo da variável antecedente à sua identificação, seguida ou não pela atribuição (símbolo “=”) e uma expressão, mas sempre finalizando com ponto e vírgula.


De modo geral, os identificadores léxicos para as variáveis seguem a expressão regular a seguir:



Ela foi criada dessa maneira para garantir que cada identificador possa ser escrito com letras minúsculas, maiúsculas e números inteiros.

Tipos de Variáveis:


Como dito, a gramática da linguagem possui como tipos de variáveis os booleanos e números inteiros e decimais. 



Na sua estrutura léxica, suas declarações respeitam as declarações lexicas das linguagens mais comuns, com ‘int’ se referindo a inteiros, ‘float’ a números decimais, e ‘bool’ a booleanos. Elas se dão da seguinte maneira:



 


Com relação aos números em específico, eles são aceitos por meio de declarações de forma que aceitem um número seguido de outros números, infinitas vezes, seguido ou não de decimais, delimitados pela grafia ‘.’ e um número (repetidos zero ou várias vezes). Isso é visto da seguinte forma lexical:





Tipos de Declaração:






Na gramática criada, para evitar expressões vazias, quando necessário, utilizamos um token chamado de PASSE, bem como declaramos explicitamente cada uma das possibilidades. Elas podem ser vistas a seguir:


Bloco de Código:

Feita por meio do uso de declarações ou afirmações entre duas chaves (“{ e }”)



Controle de fluxo do tipo IF, sem ELSE:



Controle de fluxo do tipo IF, com ELSE:



Laço do tipo WHILE:



Laço do tipo FOR:


Ele pode ser entendido da seguinte maneira:

(Inicialização; condição; passo seguinte.)

Nesse caso, o laço do tipo for contém duas declarações especiais - uma para sua inicialização e uma para o passo seguinte. Ambas podem incluir a palavra-chave PASSE, para quando não forem necessárias declarações, de modo a evitar que surjam expressões vazias. No mais, quando a expressão condicional determinar um laço infinito, basta inserir um true nele.


No caso da inicialição:


Um exemplo de declaração seria:
	para (passe; i < 10; i = i + 1) { ... }


No caso de passage para a próxima iteração:


Por exemplo:
 	para  (i = 0; i < 10; passe) { ... }


No caso de Laço infinito:
	para (i = 0; true; passe) { … }





Declaração de atribuição:




Declaração de Leitura de Input de teclado



Declaração de exibição na tela:



Por fim, há ainda um tipo de declaração para um tipo de comando vazio explícito, onde se usa apenas um ponto e vírgula como token, de modo que a a declaração nunca será vazia (pois consumirá o ponto e vírgula como token).

Tipos de Expressões:



Em relação às expressões, elas foram declaradas de forma explícita na gramática, de modo que devem seguir as regras de precedência matemática e não contenham recursão à esquerda. De modo geral elas são representadas à seguir:





Elas foram feitas de forma que sigam uma cadeia de precedência explícita, ou seja, a precedência se dará da seguinte maneira: or -> and -> eq -> rel -> add -> mul -> unary -> primary, onde cada regra chama a próxima hierarquicamente superior em sua precedência.


Dessa forma,  garante-se que na lógica matemática de uma expressão, os parênteses venham primeiro, seguidos das expressões de multiplicação e divisão, e por fim de adição e subtração.


Identificadores Léxicos:


Como mencionado anteriormente, os identificadores podem ser identificados por meio da expressão léxica abaixo, de modo a garantir que cada identificador possa ser escrito com letras minúsculas, maiúsculas e números inteiros:




Já os números podem ser reconhecidos pela utilização dos inteiros de 0 à 9.





Mas para identificar um número propriamente dito, como mencionado anteriormente, eles são aceitos por meio de declarações de forma que aceitem um número, adicionado ou não de outros números infinitas vezes, e seguido ou não de decimais, delimitados pela grafia ‘.’ e um número (repetidos zero ou várias vezes).





Podemos identificar as seguintes palavras-chave utilizadas na gramática da linguagem:







Por fim, conforme solicitado no enunciado, foram adicionadas regras especiais para eliminar espaços em branco, tabs e enter, além de comentários e comentários em várias linhas:





APLICAÇÃO EXECUTÁVEL




CÓDIGOS DE TESTE - Composição:



Testes de Sucesso





calculadora.mar: Calculadora simples que lê dois números e realiza as quatro operações básicas.

operacoes_basicas.mar: Demonstra os três tipos de variáveis (int, float, bool) e operações básicas.

estruturas_controle.mar: Testa todas as estruturas de controle: if-else, while e for.

precedencia.mar: Testa a precedência de operadores matemáticos.



Testes de Erros




Cada arquivo na pasta Errors/ contém um erro específico:


erro_variavel_nao_declarada.mar: Variável usada sem declaração

erro_sintaxe_faltando_ponto_virgula.mar: Falta ponto e vírgula

erro_tipo_incompativel.mar: Atribuição de tipo incompatível

erro_palavra_reservada.mar: Uso de palavra reservada como variável

erro_expressao_invalida.mar: Expressão incompleta

erro_parenteses_nao_fechados.mar: Parênteses não balanceados

erro_leia_variavel_nao_declarada.mar: Leitura de variável não declarada

erro_for_sintaxe_invalida.mar: Sintaxe incorreta no for



Pré-requisitos



O projeto deve ser compilado na pasta compilador abrindo o powersheel e rodando o comando:

mvn package

Validar o JAR no caminho: compilador/target/compilador-1.0-SNAPSHOT.jar

Java deve estar instalado e no PATH do sistema



Execução de testes:

Executar Todos os Testes de Sucesso

Acesse a pasta TestCodes

Execute o script no powersheel:

.\executar_teste_sucesso.bat

O que esse script faz:

Executa cada arquivo .mar da pasta Success/

Compila e executa cada programa

Mostra os resultados no terminal

Executar Todos os Testes de Erros

Execute o script:

cd TestCodes

executar_teste_erros.bat



Executar Todos os Testes completos

Acesse a pasta TestCodes

Execute o script no powersheel:

.\gerar_relatorio_teste.bat

O que esse script faz:

Executa cada arquivo .mar das pastas Success/ e Errors/

Compila e executa cada programa

E cria o arquivo relatorio_testes.txt com todos os resultados



Notas

Os scripts assumem que você está executando a partir do diretório TestCodes/

O compilador espera encontrar o arquivo teste.mar no diretório compilador/

O documento com os testes executados e registrados na pasta Doc com o nome Documentação dos Erros de Compilação.docx





Documentação dos Testes executados

Aspectos Gerais:

Este documento descreve os sucessos e erros de compilação encontrados nos arquivos de teste e explica por que cada um não compila.



Estrutura dos Testes



TestCodes/Success: Contém programas que devem compilar e executar corretamente

TestCodes/Errors: Contém programas com erros intencionais que devem falhar na compilação.

Sucesso de compilação 



Calculadora.mar



Descrição: Calculadora simples (4 operações)

```marte
int num1;
int num2;
int resultado;

leia(num1);
leia(num2);

resultado = num1 + num2;
imprima(resultado);

resultado = num1 - num2;
imprima(resultado);

resultado = num1 * num2;
imprima(resultado);

resultado = num1 / num2;
imprima(resultado);
```

Teste: 



Estruturas controle



Descrição: Testa if-else, while e for

```marte
int x = 5;
int y = 10;

// Teste if-else
se (x < y) {
    imprima(x);
} senao {
    imprima(y);
}

// Teste while
int contador = 0;
enquanto (contador < 3) {
    imprima(contador);
    contador = contador + 1;
}

// Teste for - usando assignStmt no forInit
int i;
para (i = 0; i < 3; i = i + 1) {
    imprima(i);
}
```


Teste: 



Operações básicas 



Descrição: Demonstra os 3 tipos de variáveis

```marte
int a = 10;
float b = 3.14;
bool c = true;

imprima(a);
imprima(b);
imprima(c);

a = a + 5;
b = b * 2.0;
c = false;

imprima(a);
imprima(b);
imprima(c);
```

Teste: 



Testando precedência 



Descrição: Testa precedência de operadores

```marte
int a = 2;
int b = 3;
int c = 4;
int resultado;

// Deve calcular: (2 + 3) * 4 = 20
resultado = (a + b) * c;
imprima(resultado);

// Deve calcular: 2 + 3 * 4 = 14 (multiplicação primeiro)
resultado = a + b * c;
imprima(resultado);

// Deve calcular: 2 * 3 + 4 = 10
resultado = a * b + c;
imprima(resultado);

// Teste com divisão e módulo
resultado = a + b * c / 2;
imprima(resultado);
```

Teste: 





Erros de Compilação



Erros Sintáticos




1. Erro variável não declarada



Descrição: O programa tenta usar a variável `c` sem declará-la primeiro



Teste

```marte
int a = 10;
int b = 20;

// Variável 'c' não foi declarada
int resultado = a + c;

imprima(resultado);
```

Teste


Motivo da Falha: O compilador verifica se todas as variáveis foram declaradas antes de serem usadas. A variável `c` não existe no escopo.




2. Erro sintaxe faltando ponto e virgula



Descrição: O programa está faltando o ponto e vírgula após a declaração da variável `a`.



Teste

```marte
int a = 10
int b = 20;

imprima(a);
imprima(b);
```

Motivo da Falha: Em Marte, todas as declarações e atribuições devem terminar com ponto e vírgula (`;`). A gramática exige este terminador.



3. Erro tipo incompatível 



Descrição**: O programa tenta atribuir um valor booleano a uma variável inteira.



Teste

```marte
int a = 10;
bool b = true;

// Tentando atribuir boolean a int
a = b;

imprima(a);
```

Motivo da Falha: O compilador verifica a compatibilidade de tipos. Não é permitido atribuir um valor booleano a uma variável do tipo inteiro.



4. Erro palavra reservada



Descrição: O programa tenta usar palavras reservadas (`se`, `enquanto`) como nomes de variáveis.



Teste

```marte
int se = 10;
float enquanto = 3.14;

imprima(se);
imprima(enquanto);
```

Motivo da Falha: As palavras reservadas da linguagem (`se`, `senao`, `enquanto`, `para`, `leia`, `imprima`, `int`, `float`, `bool`, etc.) não podem ser usadas como identificadores de variáveis.



5. Erro expressão invalida	



Descrição: A expressão está incompleta, faltando o segundo operando da operação de adição.



Teste

```marte
int a = 10;
int b;

b = a + ;
imprima(b);
```

Motivo da Falha: A gramática exige que operadores binários tenham operandos em ambos os lados. A expressão `a +` está incompleta.



6. Erro parênteses não fechados



Descrição: O programa tem um parêntese de abertura sem o correspondente de fechamento na estrutura `se`



Teste 

```marte
int a = 10;
int b = 20;

se (a < b {
    imprima(a);
}
```

Motivo da Falha**: A gramática exige que todos os parênteses sejam balanceados. A estrutura `se` requer `se (expr) statement`, mas está faltando o parêntese de fechamento.



7. Erro leia variável não declarada 



Descrição**: O programa tenta ler uma variável que não foi declarada



Teste

```marte
int a = 10;

// Tentando ler variável 'b' que não foi declarada
leia(b);

imprima(a);
```

Motivo da Falha**: O comando `leia` requer que a variável já tenha sido declarada antes de ser usada. A variável `b` não existe no escopo.



8. erro_for_sintaxe_invalida.mar



Descrição: O laço `para` está faltando o ponto e vírgula entre as partes da inicialização e da condição.



Teste

```marte
int i;

// Falta ponto e vírgula após a inicialização
para (i = 0 i < 5; i = i + 1) {
    imprima(i);
}
```




Para conhecer mais sobre o nosso projeto, acesse o repositório no GitHub:



