import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {

  private static final int MIN_VALUE = -50;
  private static final int MAX_VALUE = 50;

  Calculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new Calculator();
  }

  @Test
  void additionTest(){
    Random random = new Random();
    int x = random.nextInt(MIN_VALUE,MAX_VALUE);
    int y = random.nextInt(MIN_VALUE,MAX_VALUE);

    for (int i = 0; i < MAX_VALUE; i++){
      assertEquals((x+y),calculator.addition(x,y));
    }
  }


  @AfterEach
  void tearDown() {
    calculator = null;
  }
}