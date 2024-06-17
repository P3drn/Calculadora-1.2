/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.calculadoraSimples;

/**
 *
 * @author pedro
 */
public class Calculadora {
    
    private float num1 = 0;
    private float num2 = 0;
    private float resultado;
    private boolean bsomar = false;
    private boolean bsubtrair = false;
    private boolean bmultiplicar = false;
    private boolean bdividir = false;

    public boolean isBsubtrair() {
        return bsubtrair;
    }

    public void setBsubtrair(boolean bsubtrair) {
        this.bsubtrair = bsubtrair;
    }

    public boolean isBmultiplicar() {
        return bmultiplicar;
    }

    public void setBmultiplicar(boolean bmultiplicar) {
        this.bmultiplicar = bmultiplicar;
    }

    public boolean isBdividir() {
        return bdividir;
    }

    public void setBdividir(boolean bdividir) {
        this.bdividir = bdividir;
    }
    
    public boolean isBsomar() {
        return bsomar;
    }

    public void setBsomar(boolean bsomar) {
        this.bsomar = bsomar;
    }  

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    
    public float somar(float num1, float num2){
        return resultado = this.num1 + this.num2;
    }
    public float subtrair(float num1, float num2){
        return resultado = this.num1 - this.num2;
    }
    public float multiplicar(float num1, float num2){
        return resultado= this.num1 * this.num2;
    }
    public float dividir(float num1, float num2){
        return resultado = this.num1 / this.num2;
    }
    
}
