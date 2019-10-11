package NPM07066Modul2_2Array;

import java.sql.SQLOutput;

static class node{
    int nip;
    String nama;
    String jabatan;
    public node(int a,String b, String c){
        this.nip=a;
        this.nama=b;
        this.jabatan=c;
    }
}
static class node1{
    node[]nod=new node[100];
    int indeks=0;
    void tambah(int npm, String nama, String jabatan){
        nod[indeks]=new node(npm, nama, jabatan);
        indeks=indeks+1;
    }
    void delok(){
        System.out.println("= = = DATA PEGAWAI = = =");
        for(int=0; i<indeks,i++){
            System.out.println(nod[i].nip+".  "+nod[i].nama+"->"+nod[i].jabatan);
        }
    }    System.out.println("===================");
}

public class NPM07066Modul2_2Array {

}
