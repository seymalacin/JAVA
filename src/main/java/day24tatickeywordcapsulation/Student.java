package day24tatickeywordcapsulation;

//Encapsulation: "Data Hiding(Gizlemek)" demektir.

//Data'yi nicin gizlersiniz? Data'yi dis etkenlerden korumak icin.

//Data'yi nasil gizlersiniz? Access Modifier'ini "private" yaparak gizlerim

//Data'yi gizledikden sonr baska Classs'lardan okumak isdersen ne yaparsin?
//"get" method'lar(getter) olusturularak gizledigimiz datalari okunur hale getirilebiliriz

//Data'yi gizledikden sonr baska Classs'lardan degistirmek isdersen ne yaparsin?
//"set" method'lar olusturarak gizledigimiz data'lari degistirebilirsiniz.

//public'i private yaparsak gizlemis oluyoruz****

//Variable'in "data type" i ile get method'un "return type" i ayni olmalidir.
//get method'lari isimlendiriken "get+ + <variable name>" ancak variablen'in data type'i "boolean" ise "is + <variable name>"
public class Student {

    public String stdName = "To Hanks";
    private String sdtId = "TH202201";
    private double gpa = 3.8;
    private boolean retired = false;


    public String getSdtId() {
        return sdtId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }


    public void setSdtId(String sdtId) {
        this.sdtId = sdtId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
