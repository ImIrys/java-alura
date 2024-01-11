package conversor_temperatura;

public class Conversor {

    public static void main(String[] args) {
        double temperaturaCelsius = 30.5;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %.2f Celsius é equivalente a %.2f Fahrenheit", temperaturaCelsius, temperaturaFahrenheit);
        System.out.println(mensagem);

        int temperaturaFahrenheitInteira = (int) temperaturaFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaFahrenheitInteira);

    }



}
