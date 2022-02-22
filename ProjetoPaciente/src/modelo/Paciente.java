/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import visao.TelaPrincipal;

/**
 *
 * @author thur_
 */
public class Paciente {

    //atributos
    private String nome = "";
    private float peso = 0;
    private float altura = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //métodos
    public float calcularImc() {
        return (float) (peso / (altura * altura));
    }

    public String calcularFaixaPeso() {
        if (calcularImc() < 20) {
           return ("IMC= " + calcularImc() + " abaixo do peso ideal" + "\n");
        }

        if (calcularImc() >= 20 && calcularImc()<= 25) {
           return ("IMC= " + calcularImc() + " peso normal" + "\n");
        }

        if (calcularImc() 
             > 25 && calcularImc() <= 30)
        {
            return("IMC= " + calcularImc() + " excesso de peso" + "\n");
        }

        if (calcularImc() 
             > 30 && calcularImc() <= 35)
        {
            return("IMC= " + calcularImc() + " obesidade" + "\n");
        }

        if (calcularImc() > 35) {
            return("IMC= " + calcularImc() + " obesidade mórbida" + "\n");
        }
        return "erro ao calcular imc";

    
}
}