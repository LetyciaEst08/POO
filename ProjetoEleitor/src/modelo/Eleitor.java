/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import visao.TelaPrincipal;

/**
 *
 * @author ALUNO
 */
public class Eleitor {
    //atributos
    private String nome = "";
    private float anoNasc = 0;
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(float anoNasc) {
        this.anoNasc = anoNasc;
    }
    
    //métodos
    
    public float calcularEleitor(){
        return (float) (2022 - anoNasc);
                
    }
}
