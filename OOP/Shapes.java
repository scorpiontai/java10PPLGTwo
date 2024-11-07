package OOP;
class Shape {
    public void tampilkanHasil() {
      
    }
}

class Persegi extends Shape {
    private int sisi;
    private int luasPersegi;
    private int kelilingPersegi;

    public void hitungLuasPersegi() {
        this.luasPersegi = this.sisi * this.sisi;
    }

    public void hitungKelilingPersegi() {
        this.kelilingPersegi = 4 * this.sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public void tampilkanHasil() {
        System.out.println("Persegi:");
        System.out.println("Keliling persegi: " + this.kelilingPersegi);
        System.out.println("Luas persegi: " + this.luasPersegi);
    }
}

class PersegiPanjang extends Shape {
    private int panjang;
    private int lebar;
    private int luasPersegiPanjang;
    private int kelilingPersegiPanjang;

    public void hitungLuasPersegiPanjang() {
        this.luasPersegiPanjang = this.panjang * this.lebar;
    }

    public void hitungKelilingPersegiPanjang() {
        this.kelilingPersegiPanjang = 2 * (this.panjang + this.lebar);
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    @Override
    public void tampilkanHasil() {
        System.out.println("Persegi Panjang:");
        System.out.println("Keliling persegi panjang: " + this.kelilingPersegiPanjang);
        System.out.println("Luas persegi panjang: " + this.luasPersegiPanjang);
    }
}

class Lingkaran extends Shape {
    private int jariJari;
    private double luasLingkaran;
    private double kelilingLingkaran;

    public void hitungLuasLingkaran() {
        this.luasLingkaran = Math.PI * this.jariJari * this.jariJari;
    }

    public void hitungKelilingLingkaran() {
        this.kelilingLingkaran = 2 * Math.PI * this.jariJari;
    }

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public void tampilkanHasil() {
        System.out.println("Lingkaran:");
        System.out.println("Keliling lingkaran: " + this.kelilingLingkaran);
        System.out.println("Luas lingkaran: " + this.luasLingkaran);
    }
}

class Segitiga extends Shape {
    private int alas;
    private int tinggi;
    private int kelilingSegitiga;
    private double luasSegitiga;

    public void hitungLuasSegitiga() {
        this.luasSegitiga = 0.5 * this.alas * this.tinggi;
    }

    public void hitungKelilingSegitiga(int sisi1, int sisi2, int sisi3) {
        this.kelilingSegitiga = sisi1 + sisi2 + sisi3;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public void tampilkanHasil() {
        System.out.println("Segitiga:");
        System.out.println("Keliling segitiga: " + this.kelilingSegitiga);
        System.out.println("Luas segitiga: " + this.luasSegitiga);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Shape persegi = new Persegi();
        Shape persegiPanjang = new PersegiPanjang();
        Shape lingkaran = new Lingkaran();
        Shape segitiga = new Segitiga();

        ((Persegi) persegi).setSisi(5);
        ((Persegi) persegi).hitungLuasPersegi();
        ((Persegi) persegi).hitungKelilingPersegi();

        ((PersegiPanjang) persegiPanjang).setPanjang(6);
        ((PersegiPanjang) persegiPanjang).setLebar(4);
        ((PersegiPanjang) persegiPanjang).hitungLuasPersegiPanjang();
        ((PersegiPanjang) persegiPanjang).hitungKelilingPersegiPanjang();

        ((Lingkaran) lingkaran).setJariJari(7);
        ((Lingkaran) lingkaran).hitungLuasLingkaran();
        ((Lingkaran) lingkaran).hitungKelilingLingkaran();

        ((Segitiga) segitiga).setAlas(5);
        ((Segitiga) segitiga).setTinggi(10);
        ((Segitiga) segitiga).hitungLuasSegitiga();
        ((Segitiga) segitiga).hitungKelilingSegitiga(5, 7, 8);

        persegi.tampilkanHasil();
        persegiPanjang.tampilkanHasil();
        lingkaran.tampilkanHasil();
        segitiga.tampilkanHasil();
    }
}
