
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VoitureTest {

    /**
     * @Test
     * Annotation utilisé pour indiqué que la méthode effectue un test
     */

    @Test
    void when_getprix_should_return_same_price_of_instanciate_car(){
        // Arrange
        Voiture voiture = new Voiture("Ferrari", 5000);

        // Act
        double expectedPrice = 5000;
        double price = voiture.getPrix();


        // Verify
        Assertions.assertEquals(price, expectedPrice, "Doit être " + expectedPrice);
    }

    @Test
    void when_getmarque_should_return_same_marque_of_instanciate_car(){
        // Arrange
        Voiture voiture = new Voiture("Ferrari", 5000);

        // Act
        String expectedMarque = "Ferrari";
        String marque= voiture.getMarque();


        // Verify
        Assertions.assertEquals(marque, expectedMarque, "Doit être " + expectedMarque);
    }

    @Test
    void when_get_prix_after_set_prix_should_return_same_price(){
        // Arrange
        Voiture voiture = new Voiture();
        voiture.setPrix(5000);

        // Act
        double expectedPrice = 5000;
        double price = voiture.getPrix();


        // Verify
        Assertions.assertEquals(price, expectedPrice, "Doit être " + expectedPrice);
    }


    @Test
    void when_get_marque_after_set_marque_should_return_same_marque(){
        // Arrange
        Voiture voiture =  new Voiture();
        voiture.setMarque("Ferrari");

        // Act
        String expectedMarque = "Ferrari";
        String marque = voiture.getMarque();


        // Verify
        Assertions.assertEquals(marque, expectedMarque, "Doit être " + expectedMarque);
    }




    @Test
    void when_tostring_should_return_correct_string(){
        // Arrange
        Voiture voiture = new Voiture("Ferrari", 5000);

        // Act
        String expecteString =  "\"Car\":{\"marque\":\"Ferrari\",\"prix\":5000.0}";

        String stringFromToString= voiture.toString();


        // Verify
        // La clef primaire est générée par la courche de persistance JPA
        Assertions.assertEquals(stringFromToString,expecteString, "Doit être " + expecteString);
    }

}