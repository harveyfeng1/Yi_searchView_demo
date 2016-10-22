package com.sgukl.Yi_searchview_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.support.v7.widget.SearchView;
import android.util.Log;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;

//http://www.trinea.cn/android/android-searchview-and-search-tips-impl/
//http://stackoverflow.com/questions/21705654/setting-setonquerytextlistener-for-searchview-gives-null-pointer-exception
public class MainActivity extends AppCompatActivity  {

    private SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        SearchView s_view =(SearchView) findViewById(R.id.my_search_view);
        searchView = (SearchView) findViewById(R.id.my_search_view);

        searchView.setOnQueryTextListener(new OnQueryTextListener() {
            @Override

            public boolean onQueryTextSubmit(String myQuery) {
                // "myQuery" represents query as submitted.  Go ahead
                // and do your searchy stuff here

                Log.e( "onQueryTextChange: ", myQuery );
                return (false);
            } /* on query text submit */

            @Override
            public boolean onQueryTextChange(String change)
            {
                // "change" represents current text string as being typed
                Log.e( "onQueryTextChange: ", change );
                return(false);
            }
        });


//                ListView listView_main = (ListView) findViewById(R.id.listView_main);
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.countries));
//        listView_main.setAdapter(adapter);



    }




}