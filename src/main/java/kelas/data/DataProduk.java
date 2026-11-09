
package kelas.data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import kelas.model.Produk;

public class DataProduk {

    private final ObservableList<Produk> daftar =
            FXCollections.observableArrayList();

    private int nomor = 1;

    public ObservableList<Produk> getDaftar() {
        return daftar;
    }

    public Produk tambah(String nama,
                         String kategori,
                         double harga) {

        String kode = String.format("PR%03d", nomor);

        Produk produk = new Produk(
                kode, nama, kategori, harga);

        daftar.add(produk);

        nomor++;

        return produk;
    }
}
