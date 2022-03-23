package com.dpcompany.tradutor.model;

import java.util.Objects;

public class Frase {
    private Long id;
    private String valor;

    public Frase(Long id, String valor) {
        this.id = id;
        this.valor = valor;
    }

    /**
     * get field
     *
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * set field
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get field
     *
     * @return valor
     */
    public String getValor() {
        return this.valor;
    }

    /**
     * set field
     *
     * @param valor
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frase frase = (Frase) o;
        return getId().equals(frase.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return valor;
    }
}
