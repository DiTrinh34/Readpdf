package com.example.docpdf;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {

    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pdfView = findViewById(R.id.pdfView);

        // Load a PDF file from assets folder
        pdfView.fromAsset("sample.pdf") // Đảm bảo bạn có file sample.pdf trong thư mục assets
                .load();
    }
}