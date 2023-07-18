import khodro.Khodro;
import khodro.Mashin;
import khodro.Motor;
import khodro.NameKhodroChapKon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameKhodroChapKonTest {

    public NameKhodroChapKonTest() {
        khodroa = new Khodro[]{Benz, Volvo, motor};
    }

    @Test
    void Bayed_Nam_Khodro_Ra_Chap_Konad() {
        Khodro benz = new Mashin("Benz", 120,"Automatic");
        Khodro volvo = new Mashin("Volvo", 100,"Dasti");
        Khodro motor = new Motor() {
            @Override
            public String getMark() {
                return getMark();
            }
        };
        };
    private Khodro Benz;
    Khodro[] khodroa;
        NameKhodroChapKon nameKhodroChapKon = new NameKhodroChapKon(khodroa);

        //when
        String listnamekhodroa = nameKhodroChapKon.execute();
        Assertions.assertEquals("Benz-Volvo-Motor",listnamekhodroa);
    }

    private String execute() {
        return null;
    }
}
