package com.example.listmahasiswa;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listmahasiswa.R;

public class DataMahasiswaActivity extends AppCompatActivity {

    //Deklarasi Variable
    private TextView GetNIM, GetNama, GetJurusan, GetSemester, GetFakultas, GetEmail, GetStatus, GetAngkatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tes);
        getSupportActionBar().setTitle("Data Mahasiswa");
        GetNIM = findViewById(R.id.getnim);
        GetNama = findViewById(R.id.getnama);
        GetJurusan = findViewById(R.id.getjurusan);
        GetSemester = findViewById(R.id.getsemester);
        GetEmail = findViewById(R.id.getemail);
        GetFakultas = findViewById(R.id.getfakultas);
        GetStatus = findViewById(R.id.getstatus);
        GetAngkatan = findViewById(R.id.getangkatan);
        showData();
    }

    @SuppressLint("SetTextI18n")
    private void showData(){
        //Mendapatkan Nama Mahasiswa dari Activity sebelumnya
        String nama = getIntent().getExtras().getString("MyName");

        //Menentukan identitas yang ditampilkan bedasarkan nama yang dipilih
        switch (nama){
            case "Rifky":
                GetNIM.setText("181402071");
                GetNama.setText("Abdul Qodir");
                GetEmail.setText("rifkirifki@gmail.com");
                GetFakultas.setText("Ilmu Komputer dan Teknologi Informasi");
                GetJurusan.setText("Ekonomi");
                GetSemester.setText("5");
                GetStatus.setText("Aktif");
                GetAngkatan.setText("2018");
                break;

            case "Abdul":
                GetNIM.setText("181402021");
                GetNama.setText("Abdul Qodir");
                GetEmail.setText("abdulqodir@gmail.com");
                GetFakultas.setText("Ilmu Komputer dan Teknologi Informasi");
                GetJurusan.setText("Ekonomi");
                GetSemester.setText("5");
                GetStatus.setText("Aktif");
                GetAngkatan.setText("2018");
                break;

            case "Arif":
                GetNIM.setText("NIM: 17720006");
                GetNama.setText("Nama: Adibil Muchtar");
                GetJurusan.setText("Jurusan: Akuntansi");
                GetSemester.setText("Semester: 6");
                break;

            case "Faris":
                GetNIM.setText("NIM: 17720007");
                GetNama.setText("Nama: Hari");
                GetJurusan.setText("Jurusan: Management Informatika");
                GetSemester.setText("Semester: 4");
                break;

            case "Fadlan":
                GetNIM.setText("NIM: 17720008");
                GetNama.setText("Nama: Adam Makmur");
                GetJurusan.setText("Jurusan: Fakultas Ilmu Komunikasi");
                GetSemester.setText("Semester: 8");
                break;

            case "Indah":
                GetNIM.setText("181402033");
                GetNama.setText("Indah Syahputri");
                GetEmail.setText("syahputriindah067@gmail.com");
                GetFakultas.setText("Ilmu Komputer dan Teknologi Informasi");
                GetJurusan.setText("Teknologi Informasi");
                GetSemester.setText("5");
                GetStatus.setText("Aktif");
                GetAngkatan.setText("2018");
                break;

            case "Amira":
                GetNIM.setText("181402009");
                GetNama.setText("Amira Nurul Amanda");
                GetEmail.setText("amiiraa00@gmail.com");
                GetFakultas.setText("Ilmu Komputer dan Teknologi Informasi");
                GetJurusan.setText("Teknologi Informasi");
                GetSemester.setText("5");
                GetStatus.setText("Aktif");
                GetAngkatan.setText("2018");
                break;
        }
    }
}