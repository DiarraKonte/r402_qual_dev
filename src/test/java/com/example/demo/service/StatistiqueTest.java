package com.example.demo.service;

import com.example.demo.data.Voiture;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.mockito.Mockito.*;

@SpringBootTest
public class StatistiqueTest {
    @MockBean
    Statistique mockStatistique;

    @Test
     void ajouter(){
        Voiture v1 = new Voiture("Peugeot", 1000);

        mockStatistique.ajouter(v1);
        verify(mockStatistique).ajouter(v1);
    }

    @Test
     void prixMoyen(){

        Echantillon H = new Echantillon(2, 1000);

        when(mockStatistique.prixMoyen()).thenReturn(H);

    }

    @Test
    void when_two_voiture_prixmoyen_should_calculate_echantillon_with_2_voiture_and_the_average_price_of_2_voiture(){
        //arrange on prepare le test
        doNothing().when(mockStatistique).ajouter(any());
        Echantillon expected = new Echantillon(2, 1500);
        when(mockStatistique.prixMoyen()).thenReturn(expected);
        mockStatistique.ajouter(new Voiture("ferrari", 2000));
        mockStatistique.ajouter(new Voiture("Bugatti", 5000));

        //act on lance les services a tester avec le resultat obtenu et le resultat espere
        Echantillon actual = mockStatistique.prixMoyen();

        //assertions on effectue le test sous forme d'assertions
        Assertions.assertEquals(expected,actual);


    }

    @Test
    void when_one_voiture_prixmoyen_should_calculate_echantillon_with_1_voiture_and_the_average_price_of_1_voiture(){
        //arrange on prepare le test
        doNothing().when(mockStatistique).ajouter(any());
        Echantillon expected = new Echantillon(1, 1500);
        when(mockStatistique.prixMoyen()).thenReturn(expected);
        mockStatistique.ajouter(new Voiture("ferrari", 2000));

        //act on lance les services a tester avec le resultat obtenu et le resultat espere
        Echantillon actual = mockStatistique.prixMoyen();

        //assertions on effectue le test sous forme d'assertions
        Assertions.assertEquals(expected,actual);


    }

    @Test
    void when_no_voiture_prixmoyen_should_calculate_echantillon_with_no_voiture_and_the_average_price_of_0_voiture(){
        //arrange on prepare le test
        doNothing().when(mockStatistique).ajouter(any());
        Echantillon expected = new Echantillon(0, 1500);
        when(mockStatistique.prixMoyen()).thenReturn(expected);;

        //act on lance les services a tester avec le resultat obtenu et le resultat espere
        Echantillon actual = mockStatistique.prixMoyen();

        //assertions on effectue le test sous forme d'assertions
        Assertions.assertEquals(expected,actual);
    }
}