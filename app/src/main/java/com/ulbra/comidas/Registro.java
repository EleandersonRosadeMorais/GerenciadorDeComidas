package com.ulbra.comidas;

public class Registro {
    private String nome;
    private String kcal;
    private String carboidratos;
    private String proteinas;
    private String gorduras;

    public Registro(String nome, String kcal, String carboidratos, String proteinas, String gorduras) {
        this.nome = nome;
        this.kcal = kcal;
        this.carboidratos = carboidratos;
        this.proteinas = proteinas;
        this.gorduras = gorduras;
    }

    public String getNome() {
        return nome;
    }

    public String getKcal() {
        return kcal;
    }

    public String getCarboidratos() {
        return carboidratos;
    }

    public String getProteinas() {
        return proteinas;
    }

    public String getGorduras() {
        return gorduras;
    }
}
