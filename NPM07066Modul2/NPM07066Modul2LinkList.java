package NPM07066Modul2;

public class NPM07066Modul2LinkList
{
    public static void main(String[] args){
        pegawai karyawan=new pegawai();
        karyawan.tambah(karyawan,1,"Andi","Programmer");
        karyawan.tambah(karyawan,2,"Budi","Designer");
        karyawan.tambah(karyawan,3,"Cici","PM");
        karyawan.tambah(karyawan,4,"Didi","Programmer");
        karyawan.lihat(karyawan);
    }
}
