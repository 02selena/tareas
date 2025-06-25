/*Mostrar asignaturas en lista*/
  
using System;
using System.Collections.Generic;

class Ejercicio1
{
    static void Main()
    {
        List<string> asignaturas = new List<string> { "Matemáticas", "Física", "Química", "Historia", "Lengua" };
        Console.WriteLine("Asignaturas del curso:");
        foreach (string asignatura in asignaturas)
        {
            Console.WriteLine(asignatura);
        }
    }
}

/*Asignaturas con nota introducida por usuario*/

class Ejercicio2
{
    static void Main()
    {
        List<string> asignaturas = new List<string> { "Matemáticas", "Física", "Química", "Historia", "Lengua" };
        Dictionary<string, double> notas = new Dictionary<string, double>();

        foreach (var asignatura in asignaturas)
        {
            Console.Write($"Introduce la nota de {asignatura}: ");
            double nota = double.Parse(Console.ReadLine());
            notas[asignatura] = nota;
        }

        Console.WriteLine("\nNotas obtenidas:");
        foreach (var entry in notas)
        {
            Console.WriteLine($"En {entry.Key} has sacado {entry.Value}");
        }
    }
}

/*Números ganadores de la lotería primitiva ordenados*/


class Ejercicio3
{
    static void Main()
    {
        List<int> numeros = new List<int>();
        Console.WriteLine("Introduce los números ganadores de la lotería primitiva (6 números):");

        while (numeros.Count < 6)
        {
            Console.Write($"Número {numeros.Count + 1}: ");
            int num = int.Parse(Console.ReadLine());
            if (!numeros.Contains(num) && num > 0 && num <= 49)
            {
                numeros.Add(num);
            }
            else
            {
                Console.WriteLine("Número inválido o repetido, intenta de nuevo.");
            }
        }

        numeros.Sort();
        Console.WriteLine("\nNúmeros ganadores ordenados:");
        foreach (int num in numeros)
        {
            Console.Write(num + " ");
        }
    }
}

/* Mostrar números del 1 al 10 en orden inverso*/
class Ejercicio4
{
    static void Main()
    {
        List<int> numeros = new List<int>();
        for (int i = 1; i <= 10; i++)
        {
            numeros.Add(i);
        }

        numeros.Reverse();

        Console.WriteLine(string.Join(", ", numeros));
    }
}


class Asignatura
{
    public string Nombre { get; set; }
    public double Nota { get; set; }

    public Asignatura(string nombre)
    {
        Nombre = nombre;
    }

    public void PedirNota()
    {
        Console.Write($"Introduce la nota para {Nombre}: ");
        Nota = double.Parse(Console.ReadLine());
    }

    public void MostrarNota()
    {
        Console.WriteLine($"En {Nombre} has sacado {Nota}");
    }
}

/*Uso de clase Asignatura para notas (POO)*/

class Ejercicio5
{
    static void Main()
    {
        List<Asignatura> asignaturas = new List<Asignatura>
        {
            new Asignatura("Matemáticas"),
            new Asignatura("Física"),
            new Asignatura("Química"),
            new Asignatura("Historia"),
            new Asignatura("Lengua")
        };

        foreach (var asignatura in asignaturas)
        {
            asignatura.PedirNota();
        }

        Console.WriteLine("\nResultados:");
        foreach (var asignatura in asignaturas)
        {
            asignatura.MostrarNota();
        }
    }
}
