# BonoAREP

## Reto

Modifique su proyecto publicando servicios REST para calcular:

- Sin

- Cos

- Determinar si una cadena es un palíndromo

- Retorna la maginitud de un vector real de dos dimensiones, es decir recibe dos parámetros reales.

Modifique el Cliente para que se puedan llamar asíncronamente estas funciones, por ejemplo con una formulario para cada función.

## Iniciando
Para descargar el repositorio y verlo local, utiliza el siguiente código:
```
  git clone https://github.com/YeSte114/BonoAREP.git
```
```
  cd BonoAREP
```
### Prerequisitos
Es necesario tener Java 8 y Maven instalados. Compruebe con los siguientes comandos:

```
java --version
mvn --version
Docker
```

## Funciones
### Función Seno
Puedes usar la url:
```
  http://localhost:4567/sin?x=90
```
![](https://github.com/YeSte114/BonoAREP/blob/main/imgs/sin.PNG)
### Función Coseno
Puedes usar la url:
```
  http://localhost:4567/cos?x=60
```
![](https://github.com/YeSte114/BonoAREP/blob/main/imgs/cos.PNG)
### Función palíndromo
Puedes usar la url:
```
  http://localhost:4567/palindrome?s=holoh
```
![](https://github.com/YeSte114/BonoAREP/blob/main/imgs/palindromeV.PNG)

Puedes usar la url:
```
  http://localhost:4567/palindrome?s=hola
```
![](https://github.com/YeSte114/BonoAREP/blob/main/imgs/palindromeF.PNG)
### Función magnitud de vector
Puedes usar la url:
```
  http://localhost:4567/magnitude?x=5&y=40
```
![](https://github.com/YeSte114/BonoAREP/blob/main/imgs/vector.PNG)

## Pruebas de Funcionamiento en Docker
Cuando se crea la imagen, funcionamiento en cada uno de los contenedores:
3400
![](https://github.com/YeSte114/BonoAREP/blob/main/imgs/Docker34000.PNG)

34001

![](https://github.com/YeSte114/BonoAREP/blob/main/imgs/Docker34001.PNG)

## Imagen en Doker

Primero,
```
  docker pull yeisonbarreto114/firstsprkwebapprepo:latest
```

Luego,

```
  docker run -d -p 4567:4567 --name firstsprkwebapprepo yeisonbarreto114/firstsprkwebapprepo
```

Podremos entrar al cliente web entrando en la url:
```
  localhost:4567/home
```

## Autor

Yeison Steven Barreto
