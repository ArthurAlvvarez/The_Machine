# The_machine
 En esta segunda práctica vamos a crear una versión inicial muy sencilla de nuestra
máquina virtual. En concreto la aplicación será capaz de ejecutar una serie de comandos
introducidos por el usuario para crear, modificar y ejecutar programas, donde un programa
es una lista de instancias de las instrucciones que se presentan en la siguiente sección.

2 Práctica 2: Máquina Virtual

≥

Al arrancar la aplicación, se iniciarán todas las estructuras de la MV y se presentará
un prompt en donde el usuario irá tecleando los distintos comandos que se quieren
ejecutar. El conjunto de comandos disponibles serán:
HELP: Que muestra información sobre los distintos comandos disponibles.
QUIT: Cierra la aplicación.
NEWINST BC: Introduce la instrucción bytecode BC al programa actual. Si BC no
está correctamente escrito, entonces manda un mensaje de error y no lleva a cabo la
inserción.
RUN: Ejecuta el programa actual. En caso de que se produzca un error de ejecución,
avisa al usuario mediante un mensaje.

RESET: Inicializa el programa actual eliminando todas las instrucciones almacena-
das.

REPLACE N: Solicita al usuario una nueva instrucción BC, que en caso de ser correcta
reemplazará a la instrucción bytecode número N del programa.

Tras la ejecución de cada comando, la aplicación mostrará el programa actual almace-
nado. Para el caso del comando RUN, después de la ejecución de cada una de las instruc-
ciones del programa se mostrará además los estados en los que ha quedado la máquina (el

formato utilizado para mostrar esta información aparece en los ejemplos de ejecución).

Es posible que la ejecución de algún comando falle. En ese caso la aplicación simple-
mente mostrará un mensaje indicando que no ha sido posible la ejecución y pedirá un

nuevo comando. La aplicación terminará cuando se ejecute el comando QUIT.
