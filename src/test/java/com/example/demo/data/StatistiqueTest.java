package com.example.demo.data;

import com.sun.tools.javac.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;

@SpringBootTest
public class StatistiqueTest {

    @MockBean
    Statistique mockStatistique;

    @Test
    public void setMockStatistique(){
        List<Voiture> voitures = new ArrayList<voiture>();
        voitures.add(new Voiture("Car 1", 100));
        voitures.add(new Voiture("Car 2", 200));    }

}
