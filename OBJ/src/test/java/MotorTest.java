import khodro.Motor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
public class MotorTest {
    @Test
    void Motor_Bayed_Harekat_konad_waqti_roshan_ast() {
        //Given
        Motor motor = new Motor();

        //When
        motor.roshan();
        boolean ayaHarekatMekonad = motor.ayaDarHaleHarekatAst();

        //then

        Assertions.assertTrue(ayaHarekatMekonad);
    }
  }

