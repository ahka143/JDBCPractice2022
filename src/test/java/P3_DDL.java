import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class P3_DDL {
    /*
                 A) CREATE TABLE, DROP TABLE, ALTER TABLE gibi DDL ifadeleri icin sonuc kümesi (ResultSet)
                    dondurmeyen metotlar kullanilmalidir. Bunun icin JDBC’de 2 alternatif bulunmaktadir.
                       1) execute() metodu
                       2) excuteUpdate() metodu.

                 B)   - execute() metodu her tur SQL ifadesiyle kullanibilen genel bir komuttur.
                      - execute(), Boolean bir deger dondurur.
                      - DDL islemlerin false dondururken, DML islemlerinde true deger dondurur.(ResultSet olusturur)
                      - Ozellikle hangi tip SQL ifadesinin kullanilmasinin gerektiginin belli olmadigi
                        durumlarda tercih edilmektedir.

                 C) - executeUpdate() metodu ise INSERT, Update gibi DML islemlerinde yaygin kullanilir.
                    -  bu islemlerde islemden etkilenen satir sayisini dondurur.
                    - Ayrıca, DDL islemlerinde de kullanilabilir ve bu islemlerde 0 dondurur.

                  execute() her turlu SQL kjomutuyla kullanilir .......  DDL ---> False    DML----> True
                  executeUpdate()  DDL ----> 0           DML ----->etkilenen satir sayisini verir
             */

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch60_61?serverTimezone=UTC", "root", "elif.12345");

        Statement st = con.createStatement();

        // SORU: markalar adında bir tablo oluşturunuz. marka_id int, marka_isim VARCHAR(15), calisan_sayisi int


        //1.yontem : execute () methodu ile


        //2.yontem : executeUpdate() methodu ile


        // SORU: markalar tablosunu siliniz


        // SORU : markalar tablosuna yeni bir sutun {sube_sayisi int} ekleyiniz


        // SORU : markalar tablosuna yeni bir sutun {sube_sayisi int} ekleyiniz, ancak bu sutunun yeri marka_id den sonra olsun


        // SORU : markalar tablosunun adini  brands olarak degistiriniz


        // SORU : markalar tablosunda marka_isim sutununu isim olarak degistiriniz


        // SORU : markalar tablosunda marka_isim sutununun data type ini char(20) olarak degistiriniz



    }
}