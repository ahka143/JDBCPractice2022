import java.sql.*;

public class P1_ReadData {

      //MySql de day3 de..

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch59?serverTimezone=UTC", "root", "241143");

        Statement st = con.createStatement();

        // SORU1: Talebeler tablosundan tum kayitları listeleyiniz.
        ResultSet veri1=st.executeQuery("select * from talebeler;");
        while(veri1.next()){
            System.out.printf("%-6d   %-15.15s   %-8s %6d  \n",veri1.getInt(1),veri1.getString(2),veri1.getString(3),veri1.getInt(4));
        }
        System.out.println("=================================================");

        // SORU2: Talebeler tablosunda notları 90 uzeri olan kayitları listeleyiniz.

        ResultSet veri2=st.executeQuery("select * from talebeler where yazili_notu>=90;");

        while (veri2.next()){
            System.out.printf("%-6d   %-15.15s   %-8s %6d  \n",veri2.getInt(1),veri2.getString(2),veri2.getString(3),veri2.getInt(4));

        }

        System.out.println("=================================================");

        // SORU3: Talebeler tablosunda id'si 124 olan öğrencilerin tüm bilgilerini listeleyiniz.
        ResultSet veri3=st.executeQuery("select * from talebeler where id=124");
        while (veri3.next()){
            System.out.printf("%-6d   %-15.15s   %-8s %6d  \n",veri3.getInt(1),veri3.getString(2),veri3.getString(3),veri3.getInt(4));

        }

        System.out.println("=================================================");


        // SORU4: Talebeler tablosunda notu 70 ile 90 arasindaki kisilerin isimlerini listeleyiniz.
        ResultSet veri4=st.executeQuery("select isim from talebeler where yazili_notu between 70 and 90");

        while (veri4.next()){
            System.out.printf("%-15.15s\n",veri4.getString(1));

        }

        System.out.println("=================================================");


        // SORU5: Talebeler tablosunda isminin 2. harfi e olan kisilerin veli_isimleri ile birlikte listeleyiniz.

        ResultSet veri5=st.executeQuery("select isim,veli_isim from talebeler where isim like '_e%';");

        while (veri5.next()){
            System.out.printf("%-15.15s %-10s\n",veri5.getString(1),veri5.getString(2));

        }
        System.out.println("=================================================");
    }

    }


