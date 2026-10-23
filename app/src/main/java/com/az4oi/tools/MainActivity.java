package com.example.fairoostools;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.view.ViewGroup;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView web = new WebView(this);
        web.setLayoutParams(new ViewGroup.LayoutParams(
            -1, -1
        ));

        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);

        setContentView(web);
        web.loadUrl("file:///android_asset/index.html");
    }
}