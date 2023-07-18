package khodro;

public class NameKhodroChapKon {

            Khodro []  khodroa;

    public NameKhodroChapKon(Khodro[] khodroa) {
    }

    //Constructor
            public void NameKhodroChapkon(Khodro[] khodroa){
                this.khodroa = khodroa;
            }

    public String execute() {
        String nameKhodroha = " ";
        for (int neshaneger = 0; neshaneger < khodroa.length; neshaneger++){
            Khodro khodro = khodroa[neshaneger];
            nameKhodroha = nameKhodroha + khodro.getMark() + "-";
        }
        return nameKhodroha;
    }
}
