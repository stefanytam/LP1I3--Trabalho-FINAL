import java.util.Scanner;
import java.text.*;
import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpfinal;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class AmostraTemperatura {

    Scanner scan = new Scanner(System.in);
    Data data;
    Hora hora;
    int numseq;
    float valor;

    public AmostraTemperatura() {
        data = new Data();
        hora = new Hora();
        System.out.print("Valor da temperatura: ");
        valor = scan.nextFloat();
    }

    public AmostraTemperatura(int a, int b, int c, int d, int e, int f, float v) {
        this.valor = v;
        data = new Data(a, b, c);
        hora = new Hora(d, e, f);
    }

    public AmostraTemperatura(Data d, Hora h, float v) {
        this.data = d;
        this.hora = h;
        this.valor = v;
    }

    public void setData(int a, int b, int c) {
        data.setDia(a);
        data.setDia(b);
        data.setDia(c);
    }

    public void setData() {
        data.setDia();
        data.setDia();
        data.setDia();
    }

    public void setHora(int a, int b, int c) {
        hora.setHor(a);
        hora.setMin(b);
        hora.setHor(c);
    }

    public void setHora() {
        hora.setHor();
        hora.setMin();
        hora.setHor();
    }

    public void setValor(float v) {
        this.valor = v;
        numseq += 1;
    }

    public void setValor() {
        System.out.print("Valor da temperatura: ");
        valor = scan.nextFloat();
        numseq += 1;
    }

    public int getNumSeq() {
        return numseq;
    }

    public String getData() {
        return data.mostra1();
    }

    public String getHora() {
        return hora.getHora1();
    }

    public float getValor() {
        return valor;
    }
}
