#### Olá, seja bem vindo ao seu **Guia do Comerciante da Galáxia**!

_Segue alguns passos para instalação e utilização:_

#### Instalação:

##### 1 - Dentro da pasta descopactada, abra o terminal (DOS ou Linux) e execute o comando abaixo:

Linux e Mac:

`./gradlew clean assemble`

Windows:

`gradlew clean assemble`

Este comando ira fazer o build e gerar os arquivos necessários para utilização da aplicação.

##### 2 - Com o arquivo `.jar` gerado, a aplicação pode ser executada.

_(Atenção, o computador deve possuir o Java 8 instalado)_

Rode o comando abaixo para verificar seu Java:

`
java -version
`

O resultado deve ser parecido com o apresentado abaixo:

```
java version "1.8.0_181"
Java(TM) SE Runtime Environment (build 1.8.0_181-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.181-b13, mixed mode)
```

Caso contrário, instale o Java antes de prosseguir para o próximo passo.

Com o Java OK, acesse `/build/libs` dentro da pasta `merchants-guide-to-the-galaxy`. E rode o comando abaixo:

`cd build/libs`

E depois o comando: 

`java -jar merchants-guide-to-the-galaxy-1.0-SNAPSHOT.jar`

Ou somente o comando:


`java -jar build/libs/merchants-guide-to-the-galaxy-1.0-SNAPSHOT.jar`

##### 3 - Será exibido o seguinte texto na tela sinalizando o sucesso da operação:

``` 
Welcome to Merchant's Guide to the Galaxy!
Tip: Type a command and then click ENTER
Tip: To end the application type 'exit' and click ENTER
```

#### Utilização da aplicação:

Existem os seguintes comandos disponíveis:

##### 1 - Comando para incluir ou alterar um parâmetro:

###### Padrão:

`<nome> is <número romano>`

###### Detalhe:

_nome_ = Nome do parâmetro a ser incluído.

_número romano_ = números romanos entre: I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000


###### Exemplos: 

```
glob is I
prok is V
pish is X
tegj is L
```

#### 2 - Comando para incluir ou alterar crédito de materiais:

###### Padrão:

`<parâmetro> is <Crédito> Credits`

###### Detalhe:

_parâmetro_ = representa o parâmetro que possui um determinado número romano. A separação entre parâmetros é
 feita com um espaço.

_crédito_ = representa o valor em créditos do material. A primeira letra deve ser maiúscula.

###### Exemplos: 

```
glob glob Silver is 34 Credits
glob prok Gold is 57800 Credits
pish pish Iron is 3910 Credits
```

#### 3 - Comando de pergunta (how much):

###### Padrão:

`how much is <parâmetro> ?`

###### Detalhe:

_parâmetro_ = representa o parâmetro que possui um determinado número romano. A separação entre parâmetros é
 feita com um espaço.
 
###### Exemplos: 

```
how much is pish tegj glob glob ?
```

#### 4 - Comando de pergunta (how many):

###### Padrão:

`how many Credits is <parâmetro> <Material> ?`

###### Detalhe:

_parâmetro_ = representa o parâmetro que possui um determinado número romano. A separação entre parâmetros é
 feita com um espaço.

_Material_ = representa o nome do material que possuí créditos. Deve possui a primeira letra maiúscula.

###### Exemplos: 

```
how many Credits is glob prok Iron ?
```

Aproveite!

_Developed by Alex Silveira da Rosa - alexsros@gmail.com.br_