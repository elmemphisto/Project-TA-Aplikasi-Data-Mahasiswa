/*
 * mendeklarasikan clas simpan yang dimana di dalam ini menjelaskan tentang struktur tabel pada menu java gui
 * 
 */
package rozziq_s;

import javax.swing.table.DefaultTableModel;//mengimport javax.swing yang berfungsi untuk agar dapat meggunakan tabel

public class Update {
    private DefaultTableModel tabel=new DefaultTableModel();
    public Update(){
        getTabel().addColumn("NO");
        getTabel().addColumn("Nim"); // memenggil tabel dan menambah kolom nim
        getTabel().addColumn("nama");// memenggil tabel dan menambah kolom nama
        getTabel().addColumn("Jurusan");// memenggil tabel dan menambah kolom jurusan
        getTabel().addColumn("Tgl kahir");// memenggil tabel dan menambah kolom tgl lahir
        
    }
    
    public DefaultTableModel getTabel(){ //methot pemanggilan tabel 
        return tabel;
    }
       
}
