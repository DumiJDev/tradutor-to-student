package com.dpcompany.tradutor.model;

import java.util.List;
import java.util.Objects;

public class Lingua {
    private String id;
    private String nome;
    private List<Palavra> palavras;
    private List<Frase> frases;

    public Lingua() {
        nome = "";
        id = "";
    }

    public Lingua(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }


    /**
     * get field
     *
     * @return nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * set field
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * get field
     *
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * set field
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lingua lingua = (Lingua) o;
        return getId().equals(lingua.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return nome;
    }
}
