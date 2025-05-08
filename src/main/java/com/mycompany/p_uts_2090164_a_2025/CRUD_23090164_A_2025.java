
package com.mycompany.p_uts_2090164_a_2025;

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

/*
 *
 * @author ASUS
 */

public class CRUD_23090164_A_2025 {
    public static void main(String[] args) {
        // Membuat koneksi ke MongoDB server lokal di port default (27017)
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

        // Mengakses database bernama 'uts_23090164_A_2025'
        MongoDatabase database = mongoClient.getDatabase("uts_23090164_A_2025");

        // Mengakses koleksi (collection) bernama 'coll_23090164_A_2025'
        MongoCollection<Document> collection = database.getCollection("coll_23090164_A_2025");

        //Menambahkan 3 dokumen dengan dimensi yang berbeda
        // ============================
        Document doc1 = new Document("nama", "Agung").append("usia", 22);
        Document doc2 = new Document("nama", "Idris").append("kota", "Kota Tegal").append("email", "idris01@gmail.com");
        Document doc3 = new Document("nama", "Sinta").append("hobi", "Membaca").append("tinggi", 165).append("menikah", false);

        // Menambahkan dokumen ke koleksi
        collection.insertOne(doc1);    // Tambah dokumen 1
        collection.insertOne(doc2);    // Tambah dokumen 2
        collection.insertOne(doc3);    // Tambah dokumen 3

        //Menampilkan seluruh data yang tersimpan di koleksi
        // ============================
//        System.out.println("=== Seluruh Data ===");
//        FindIterable<Document> semuaDokumen = collection.find(); // Mengambil semua dokumen
//        for (Document doc : semuaDokumen) {
//            System.out.println(doc.toJson()); // Menampilkan isi dokumen dalam format JSON
//        }

        //Mengubah isi data (value) pada dokumen
        // Misalnya ubah usia Andi menjadi 25
        // ============================
//        collection.updateOne(
//            Filters.eq("nama", "Agung"),             // Filter: cari dokumen dengan nama Agung
//            Updates.set("usia", 26)                 // Update: ubah field usia menjadi 26
//        );

        //Menghapus dokumen dari koleksi
        // Misalnya hapus dokumen dengan nama "Idris"
        // ============================
//        collection.deleteOne(Filters.eq("nama", "Idris")); // Menghapus satu dokumen dengan nama "Idris"

        //Menemukan data berdasarkan kata kunci (key)
        // Misalnya cari dokumen yang punya key 'hobi'
        // ============================
//        System.out.println("=== Dokumen dengan key 'hobi' ===");
//        FindIterable<Document> dokumenDenganHobi = collection.find(Filters.exists("hobi")); // Filter: hanya dokumen yang memiliki key 'hobi'
//        for (Document doc : dokumenDenganHobi) {
//            System.out.println(doc.toJson()); // Tampilkan hasilnya
//        }

        // Menutup koneksi setelah semua operasi selesai
        mongoClient.close();
    }
}
