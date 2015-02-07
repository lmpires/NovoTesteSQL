package com.example.lauramarra.novotestesql;

/**
 * Created by lauramarra on 07/02/15.
 */
public class Fluxograma {

    private int _id;
    private String _codigo, _nome;

    public Fluxograma(){}

    public Fluxograma(String codigo, String nome) {
        this._codigo = codigo;
        this._nome = nome;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_codigo(String _codigo) {
        this._codigo = _codigo;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;
    }

    public int get_id() {
        return _id;
    }

    public String get_codigo(){
        return _codigo;
    }

    public String get_nome() {
        return _nome;
    }
}
