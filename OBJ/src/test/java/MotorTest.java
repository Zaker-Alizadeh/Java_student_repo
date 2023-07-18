import khodro.Khodro;
import khodro.Motor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
public class MotorTest {
    @Test
    void Motor_Bayed_Harekat_konad_waqti_roshan_ast() {
        //Given

        // چون موتور در جمع خودرو حساب می شود چون یک رابطه is a  بین موتور و ماشین وجود دارد
        // و زمانی که یک کلاس abstract شد دیگه نمی توانیم از آن کلاس یک نمونه جدید درست کنیم
        Khodro motor = new Motor() {
            @Override
            public String getMark() {
                return null;
            }
        };
        //  Khodro khodro = new Khodro(); دیکر یک نمونه جدید درست نمیتونیم

        //When
        motor.roshan();
        boolean ayaHarekatMekonad = motor.ayaDarHaleHarekatAst();

        //then

        Assertions.assertTrue(ayaHarekatMekonad);
    }
  }

