public class NPM07066Modul2_2Array {
    static class node{
        int nip;
        String nama ,jabatan;
        // String jabatan;

        public node(int a,String b,String c){
            this.nip=a;
            this.nama=b;
            this.jabatan=c;
        }
    }
    static class node1{
        node [] nod=new node[1000];
        int indeks=0;
        void tambah(int npm,String nama,String jabatan){
            nod[indeks]= new node(npm,nama,jabatan);
            indeks=indeks+1;
        }
        void view(){
            System.out.println("===DATA PEGAWAI===");
            for(int i=0;i<indeks;i++){
                System.out.println(nod[i].nip+". "+nod[i].nama+"->"+nod[i].jabatan);
            }
            System.out.println("=============");
        }
    }
    public static void main(String[] args) {
        node1 nodd=new node1();
        nodd.tambah(1, "andi", "programer");
        nodd.tambah(2, "budi", "deisgner");
        nodd.tambah(3, "cici", "PM");
        nodd.tambah(4, "didi", "programer");
        nodd.view();
    }
}
