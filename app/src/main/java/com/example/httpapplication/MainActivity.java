package com.example.httpapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void MakeRequest() throws IOException {
        URL url = new URL("http://google.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        try {

            InputStream stream = new BufferedInputStream(connection.getInputStream());

        } finally {
            connection.disconnect();
        }
    }
}