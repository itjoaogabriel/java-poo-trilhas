package com.joaotrilhas.trilha4.atividade2;

public class Temperatura {

    private double celsius;

    public void setCelsius(double celsius) {
        if (celsius >= -273.15 && celsius <= 1000) {
            this.celsius = celsius;
        } else {
            System.out.println("Temperatura inválida.");
        }
    }

    public double getCelsius() { return celsius; }
    public double getFahrenheit() { return celsius * 9.0/5.0 + 32; }
    public double getKelvin() { return celsius + 273.15; }

    public void exibir() {
        System.out.format("Celsius: %.2f°C | Fahrenheit: %.2f°F | Kelvin: %.2f°K%n",
                getCelsius(), getFahrenheit(), getKelvin());
    }
}
