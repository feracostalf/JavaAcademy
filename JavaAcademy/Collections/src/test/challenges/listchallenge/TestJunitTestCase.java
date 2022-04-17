package test.challenges.listchallenge;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runners.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.console.shadow.picocli.CommandLine.Parameters;
import org.junit.runner.RunWith;
import org.junit.runner.*;



import challenges.listchallenge.Theatre;

@TestMethodOrder(OrderAnnotation.class)
@RunWith(Parameterized.class)
public class TestJunitTestCase {
    public static Theatre theatre= new Theatre("CINEPOLIS",8, 8);
    
    @ParameterizedTest
    @ValueSource(strings= {"a3","A4","A7","D3","D4","D5","C7","B4","H7"})
    @Test
    @Order(1)
    public void reserve(String seat) {  
        boolean result= theatre.reserve(seat);
        assertEquals("Reserve valid seat", true, result);
    } 

    @ParameterizedTest
    @ValueSource(strings= {"a0","A400","X7","","00","AA","D4"})
    @Test  
    @Order(2)
    public void notAllowed(String seat) {  
        boolean result= theatre.reserve(seat);
        assertEquals("Reserve not allowed seat", false, result);  
    } 

    @ParameterizedTest
    @ValueSource(strings={"A4"})
    @Test  
    @Order(3)
    public void calcel(String seat) {  
        boolean result= theatre.cancelReservation(seat);
        
        assertEquals("Calcel valid seat", 8, theatre.getSoldSeats());  
        assertEquals("Calcel valid seat",true, result);
    } 
    
    
}
