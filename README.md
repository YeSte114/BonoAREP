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
```

## Funciones
### Función Seno
Puedes usar la url:
```
  http://localhost:4567/sin?x=90
```
![](https://github.com/YeSte114/BonoAREP/blob/main/imgs/cos.PNG)
### Función Conseno
Puedes usar la url:
```
  http://localhost:4567/cos?x=60
```
![](imgs/cos.png)
### Función palíndromo
Puedes usar la url:
```
  http://localhost:4567/palindrome?s=holoh
```
![](imgs/palindromeV.png)
Puedes usar la url:
```
  http://localhost:4567/palindrome?s=hola
```
![](imgs/palindromeF.png)
### Función magnitud de vector
Puedes usar la url:
```
  http://localhost:4567/magnitude?x=5&y=40
```
![](imgs/vector.png)
