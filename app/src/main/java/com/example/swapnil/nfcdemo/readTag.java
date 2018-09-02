package com.example.swapnil.nfcdemo;

import android.content.Context;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Swapnil on 4/25/2017.
 */

public class readTag extends AppCompatActivity {
    NfcAdapter nfcAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nfcAdapter = NfcAdapter.getDefaultAdapter(this);
    }
}
