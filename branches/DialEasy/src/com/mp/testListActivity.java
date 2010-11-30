package com.mp;

import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.Contacts.People;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class testListActivity extends ListActivity{

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			Cursor c = getContentResolver().query(People.CONTENT_URI, null, null, null, null);
			startManagingCursor(c);
			
			setListAdapter(new SimpleCursorAdapter(this,R.layout.testlist,c,new String[]{People.NAME},new int[]{R.id.tv_contact}));
			//setListAdapter(new ArrayAdapter<String>(this,R.layout.testlist,new String[]{"Rahul","Sumanth"}));
			
			ListView lv = getListView();
			lv.setTextFilterEnabled(true);
			
			
		}
}
