
package kelas.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import kelas.Navigator;
import kelas.data.DataProduk;
import kelas.model.Produk;

public class FormController {

    @FXML
    private TextField namaField, hargaField;

    @FXML
    private ComboBox<String> kategoriBox;

    @FXML
    private Label pesanLabel;

    private Navigator navigator;
    private DataProduk data;

    @FXML
public void initialize() {
    kategoriBox.getItems().addAll(
        "Makanan",
        "Minuman"
    );

}

    public void setKonteks(
            Navigator navigator, DataProduk data) {

        this.navigator = navigator;
        this.data = data;
    }

    @FXML
private void simpan() {
    try {
        double harga = Double.parseDouble(hargaField.getText().trim());

        Produk p = data.tambah(
            namaField.getText(),
            kategoriBox.getValue(),
            harga
        );

        System.out.println("PRODUK BERHASIL DISIMPAN");
        System.out.println("Mencoba membuka halaman detail...");

        navigator.bukaDetail(p);

        System.out.println("Halaman detail berhasil dibuka");

    } catch (Exception e) {

    e.printStackTrace();

    Throwable penyebab = e;

    while (penyebab.getCause() != null) {
        penyebab = penyebab.getCause();
    }

    pesanLabel.setText(
        "Error: " + penyebab.getClass().getSimpleName()
        + "\nPesan: " + String.valueOf(penyebab.getMessage())
    );
}
}
    @FXML
    private void bukaDaftar() {

        try {
            navigator.bukaDaftar();

        } catch (IOException e) {

            pesanLabel.setText(
                    "Gagal membuka daftar produk.");
        }
    }
}
