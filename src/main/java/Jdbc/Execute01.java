package Jdbc;
import dev.failsafe.internal.util.Assert;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Execute01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        List<Object> rowList = new ArrayList<>();
        //2) Bağlantı Oluştur.
        Connection con = DriverManager.getConnection("jdbc:postgresql://medunna.com:5432/medunna_db",
                "medunna_user",
                "medunna_pass_987");

        //3) Statament
        Statement st = con.createStatement();

        //4) ResultSet
        ResultSet veri = st.executeQuery("select * from room");

        //Sonuçları Al
        while (veri.next()){
            rowList.add(veri.getObject("created_by"));


            System.out.printf("%-6d %-15.15s %-8s %-8s\n", veri.getInt(1), veri.getString(2), veri.getString(3), veri.getString(4));

        }
        for (int i = 0; i <rowList.size() ; i++) {
            if (rowList.get(i)=="john_doe"){
                System.out.println("ok");
            }else {
                //System.out.println("not");
            }

        }

        //6) Kapatma
        con.close();
        st.close();
        veri.close();
    }
    }

