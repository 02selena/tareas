using System;

namespace FigurasGeometricas
{
    public class Circulo
    {
        private double radio;

        public Circulo(double radio)
        {
            this.radio = radio;
        }

        public double CalcularArea()
        {
            return Math.PI * radio * radio;
        }

        public double CalcularPerimetro()
        {
            return 2 * Math.PI * radio;
        }
    }

    public class Rectangulo
    {
        private double baseRect;
        private double altura;

        public Rectangulo(double baseRect, double altura)
        {
            this.baseRect = baseRect;
            this.altura = altura;
        }

        public double CalcularArea()
        {
            return baseRect * altura;
        }

        public double CalcularPerimetro()
        {
            return 2 * (baseRect + altura);
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Circulo circulo = new Circulo(5);
            Console.WriteLine("Área del círculo: " + circulo.CalcularArea());
            Console.WriteLine("Perímetro del círculo: " + circulo.CalcularPerimetro());

            Rectangulo rectangulo = new Rectangulo(4, 6);
            Console.WriteLine("Área del rectángulo: " + rectangulo.CalcularArea());
            Console.WriteLine("Perímetro del rectángulo: " + rectangulo.CalcularPerimetro());

            Console.ReadLine(); // Para pausar la consola
        }
    }
}
