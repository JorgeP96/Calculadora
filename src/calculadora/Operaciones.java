/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Jorge Pichardo
 */
public class Operaciones {
    private float no1;
    private float no2;
    
    public Operaciones(float no1, float no2){
        this.no1 = getNo1();
        this.no2 = getNo2();
    }

    public float getNo1() {
        return no1;
    }
    
    public void setNo1(float no1) {
        this.no1 = no1;
    }
    
    public float getNo2() {
        return no2;
    }
    
    public void setNo2(float no2) {
        this.no2 = no2;
    }
    
    public float suma(){
        float resultado = getNo1() + getNo2();
        return resultado;
    }
    
    public float resta(){
        float resultado = getNo1() - getNo2();
        return resultado;
    }
    
    public float multiplicacion(){
        float resultado = getNo1() * getNo2();
        return resultado;
    }
    
    public float division(){
        float resultado = getNo1() / getNo2();
        return resultado;
    }
}
