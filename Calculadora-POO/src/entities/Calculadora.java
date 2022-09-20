package entities;

import java.util.ArrayList;

public class Calculadora {
    private ArrayList<Double> listaNumeros = new ArrayList<>();

    public Double somar() {
        Double resultado = 0.0;
        for (int i = 0; i < this.listaNumeros.size(); i++) {
            resultado += this.getListaNumeros().get(i);
        }

        return resultado;
    }

    public Double subtrair() {
        Double resultado = this.listaNumeros.get(0);
        for (int i = 1; i < this.listaNumeros.size(); i++) {
            resultado -= this.getListaNumeros().get(i);
        }

        return resultado;
    }

    public double dividir() {
        Double resultado = this.listaNumeros.get(0);
        for (int i = 1; i < this.listaNumeros.size(); i++) {
            resultado /= this.getListaNumeros().get(i);
        }

        return resultado;
    }

    public double multiplicar() {
        Double resultado = this.listaNumeros.get(0);
        for (int i = 1; i < this.listaNumeros.size(); i++) {
            resultado *= this.getListaNumeros().get(i);
        }

        return resultado;
    }

    public double potenciacao() {
        Double resultado = this.listaNumeros.get(0);
        for (int i = 1; i < this.listaNumeros.size(); i++) {
            resultado = Math.pow(resultado, this.listaNumeros.get(i));
        }

        return resultado;
    }

    public double porcentagem() {
        Double resultado = this.listaNumeros.get(0);
        for (int i = 1; i < this.listaNumeros.size(); i++) {
            resultado = resultado * this.listaNumeros.get(i) / 100.0;
        }

        return resultado;
    }

    public Double fazerOperacao(int operacao) {
        switch (operacao) {
            case 1:
                return this.somar();
            case 2:
                return this.subtrair();
            case 3:
                return this.dividir();
            case 4:
                return this.multiplicar();
            case 5:
                return this.potenciacao();
            case 6:
                return this.porcentagem();
            case 7:
                return this.raizQuadrada();
        }
        return null;
    }

    public double raizQuadrada() {
        return Math.sqrt(this.listaNumeros.get(0));
    }

    public void addNumeroLista(Double numero) {
        this.listaNumeros.add(numero);
    }

    public ArrayList<Double> getListaNumeros() {
        return listaNumeros;
    }
}
