import khodro.Khodro;
import khodro.Mashin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MashinTest {
// حالا میایم یک تست می سازیم


    @Test
    void Mashin_Bayaed_Haraket_Konad_Waqti_Mashin_Roshan_wa_dar_Baste_ast() {
        //یک object از ماشین میخواهیم درست کنیم
        //Given
        Khodro benz = new Mashin("Benz");
        Khodro volvo = new Mashin("Volvo");

        //When
        boolean HarekatMekonad = benz.ayaDarHaleHarekatAst();
        volvo.roshan();
        boolean ayaVolvoHarekatMekonad = volvo.ayaDarHaleHarekatAst();
        //then
        assertFalse(HarekatMekonad);
        assertTrue(ayaVolvoHarekatMekonad);
    }

}
