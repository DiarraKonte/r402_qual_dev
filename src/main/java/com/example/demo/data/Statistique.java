package com.example.demo.data;
import com.example.demo.data.Echantillon;
import com.example.demo.data.Voiture;


import com.example.demo.data.Voiture;

public interface Statistique {

    public void ajouter(Voiture voiture);

    public Echantillon prixMoyen() throws ArithmeticException;

}