package ru.kozhukhov.sergey.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private final String LINK_MAIN = "http://my.market.com";
    private final String LINK_CATALOG = "http://my.market.com/catalog";
    private final String LINK_MAP = "http://my.market.com/map";
    private final String LINK_SEARCH = "http://my.market.com/search";
    private final String LINK_ACCOUNT = "http://my.market.com/account";


    private Button mButton_open_market_main;
    private Button mButton_open_market_catalog;
    private Button mButton_open_market_map;
    private Button mButton_open_market_search;
    private Button mButton_open_market_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton_open_market_main = findViewById(R.id.button_open_market_main);
        mButton_open_market_catalog = findViewById(R.id.button_open_market_catalog);
        mButton_open_market_map = findViewById(R.id.button_open_market_map);
        mButton_open_market_search = findViewById(R.id.button_open_market_search);
        mButton_open_market_account = findViewById(R.id.button_open_market_account);


        mButton_open_market_main.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            Uri address = Uri.parse(LINK_MAIN);
                                                            Intent openLink = new Intent(Intent.ACTION_VIEW, address);
                                                            startActivity(openLink);
                                                        }
                                                    }
        );

        mButton_open_market_catalog.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            Uri address = Uri.parse(LINK_CATALOG);
                                                            Intent openLink = new Intent(Intent.ACTION_VIEW, address);
                                                            startActivity(openLink);
                                                        }
                                                    }
        );
        mButton_open_market_map.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            Uri address = Uri.parse(LINK_MAP);
                                                            Intent openLink = new Intent(Intent.ACTION_VIEW, address);
                                                            startActivity(openLink);
                                                        }
                                                    }
        );
        mButton_open_market_search.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            Uri address = Uri.parse(LINK_SEARCH);
                                                            Intent openLink = new Intent(Intent.ACTION_VIEW, address);
                                                            startActivity(openLink);
                                                        }
                                                    }
        );
        mButton_open_market_account.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            Uri link = Uri.parse(LINK_ACCOUNT);
                                                            Intent openLink = new Intent(Intent.ACTION_VIEW, link);
                                                            startActivity(openLink);
                                                        }
                                                    }
        );
    }
}
