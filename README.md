#### Hello, welcome to your **Merchant's Guide to the Galaxy**!

_Here are some steps to install and use:_

#### Installation:

##### 1 - Inside the unpatched folder, open the terminal (DOS or Linux) and execute the command below:

Linux and Mac:

`./gradlew clean assemble`

Windows:

`gradlew clean assemble`

This command will build and generate the necessary files to use the application.

##### 2 - With the `.jar` file generated, the application can be executed.

_(Attention, the computer must have Java 8 installed)_

Run the command below to check your Java:

`
java -version
`

The result should look like the one shown below.:

```
java version "1.8.0_181"
Java(TM) SE Runtime Environment (build 1.8.0_181-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.181-b13, mixed mode)
```

If not, install Java before proceeding to the next step..

With Java OK, go to `/build/libs` inside the` merchants-guide-to-the-galaxy` folder. And run the command below:

`cd build/libs`

And the command: 

`java -jar merchants-guide-to-the-galaxy-1.0-SNAPSHOT.jar`

Or just the command:


`java -jar build/libs/merchants-guide-to-the-galaxy-1.0-SNAPSHOT.jar`

##### 3 - The following text will be displayed on the screen signaling the success of the operation:

``` 
Welcome to Merchant's Guide to the Galaxy!
Tip: Type a command and then click ENTER
Tip: To end the application type 'exit' and click ENTER
```

#### Application usage

The following commands are available:

##### 1 - Command to add or change a parameter:

###### Pattern:

`<name> is <roman number>`

###### Detail:

_name_ = parameter name to include.

_roman number_ = Roman numerals between: I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000

###### Examples: 

```
glob is I
prok is V
pish is X
tegj is L
```

#### 2 - Command to include or change material credit:

###### Pattern:

`<parameter> is <Credit> Credits`

###### Detail:

_parameter_ = Represents the parameter that has a given roman number. The separation between parameters is made with 
a space.

_Credit_ = Represents the value in Credits of the material. Must have the first capital letter.

###### Examples: 

```
glob glob Silver is 34 Credits
glob prok Gold is 57800 Credits
pish pish Iron is 3910 Credits
```

#### 3 - Question command (how much):

###### Pattern:

`how much is <parameter> ?`

###### Detail:

_parameter_ = represents the parameter that has a given roman number. The separation between parameters is made with 
a space.
 
###### Examples: 

```
how much is pish tegj glob glob ?
```

#### 4 - Question command (how many):

###### Pattern:

`how many Credits is <parameter> <Material> ?`

###### Detail:

_parameter_ = Represents the parameter that has a given roman number. The separation between parameters is done with 
a space.

_Material_ = Represents the name of the material that has Credits. Must have the first capital letter.

###### Examples: 

```
how many Credits is glob prok Iron ?
how many Credits is glob prok Gold ?
how many Credits is glob prok Iron ?
```

Enjoy!

_Developed by Alex Silveira da Rosa - alexsros@gmail.com.br_