package org.example;

public class Carro {
    private String cor;
    private String marca;
    private String modelo;
    private Boolean ligado;
    private Integer velocidadeAtual;
    private Integer velocidadeMax;

    public Carro() {
        this.ligado = false;
        this.velocidadeAtual = 0;
        this.velocidadeMax = 200;
    }

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        if(this.velocidadeAtual == 0 && this.ligado){
            this.ligado = false;
        }
    }

    public void acelerar(Integer velocidade){
        if(velocidadeAtual <= velocidadeMax && this.ligado){
            this.velocidadeAtual+=velocidade;
            if(this.velocidadeAtual > this.velocidadeMax){
                this.velocidadeAtual = this.velocidadeMax;
            }
        }
    }

    public void frear(Integer velocidade){
        if(this.velocidadeAtual > 0 && this.ligado){
            this.velocidadeAtual-=velocidade;
            if(this.velocidadeAtual < 0){
                this.velocidadeAtual = 0;
            }
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Integer getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(Integer velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }
}
