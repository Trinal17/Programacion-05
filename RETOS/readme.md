# RETOS
# RETO 1:
Crea una clase llamada 'Punto' que represente un punto en el plano. Definir los atributos x e y.

En la main creamos tres objetos de la clase Punto y llamamos al método equals que hemos implementado:

```
public static void main(String[] ar) {
        Punto punto1 = new Punto(10, 2);
        Punto punto2 = new Punto(10, 2);
        Punto punto3 = new Punto(20, 4);
        if (punto1.equals(punto2))
            System.out.println("punto1 y punto2 pertenecen al mismo punto en el plano.");
        if (punto1.equals(punto3))
            System.out.println("punto1 y punto3 pertenecen al mismo punto en el plano.");
        else
            System.out.println("punto1 y punto3 no pertenecen al mismo punto en el plano.");
    }
```

¿Ha funcionado correctamente?
