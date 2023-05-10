import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ConstructorTest {
  Calculator calculator;

  @BeforeAll
  void setup(){

  }

  @Test
  void constructorTest(){
    assertNull(calculator);
    calculator = new Calculator();
    assertNotNull(calculator);
  }


  @AfterAll
  void teardown(){
    calculator = null;
  }

}