package com.mp;

import org.xml.sax.HandlerBase;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;

public class Home extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        for(int i=0 ;i<100000;i++)
        {
        	System.out.println("ssss"+i);
        }
        Intent listAct = new Intent(this,testListActivity.class);
       startActivity(listAct);
       
    }
}