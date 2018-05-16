package com.example.kjell.browserproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    WebView webView_Browser;
    EditText editText_Url;
    Button forward_Button, backward_Button, refresh_Button, clear_Button, go_Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        webView_Browser = (WebView) findViewById(R.id.webView_Browser);

        webView_Browser.setWebViewClient(new WebViewClient());

        editText_Url = (EditText) findViewById(R.id.editText_Url);

        go_Button = (Button) findViewById(R.id.go_Button);
        forward_Button = (Button) findViewById(R.id.forward_Button);
        backward_Button = (Button) findViewById(R.id.backward_Button);
        refresh_Button = (Button) findViewById(R.id.refresh_Button);
        clear_Button = (Button) findViewById(R.id.clear_Button);

        go_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTextValue = editText_Url.getText().toString();
                String url_String = editTextValue;
                webView_Browser.loadUrl(url_String);
            }
        });


    }



}
