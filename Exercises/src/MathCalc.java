

public class MathCalc{
    public static void main(String[] args) {
        int a = 20;
        int b = 12;

        somar(a,b);
        subtrair(a,b);
        dividir(a,b);
        multiplicar(a,b);
    }

    public static void somar(int a, int b){
        int soma = a + b;
        System.out.println(soma);
    }
    public static void subtrair(int a, int b){
        int subtrair = a - b;
        System.out.println(subtrair);
    }
    public static  void dividir(int a, int b){
        int dividir = a / b;
        System.out.println(dividir);
    }
    public static void multiplicar(int a, int b){
        int multiplicar = a * b;
        System.out.println(multiplicar);
    }

}