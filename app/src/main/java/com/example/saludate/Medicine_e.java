package com.example.saludate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.view.View;

public class Medicine_e extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_e);
    }

    private static final int PICK_PDF_FILE = 2;

    private void openFile(View view) {
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("application/pdf");

        // Optionally, specify a URI for the file that should appear in the
        // system file picker when it loads.
        startActivityForResult(intent, PICK_PDF_FILE);
    }
}