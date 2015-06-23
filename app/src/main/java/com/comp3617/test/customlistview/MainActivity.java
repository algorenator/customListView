package com.comp3617.test.customlistview;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends ListActivity{


    private ArrayList<Item> m_parts = new ArrayList<Item>();

    private ItemAdapter m_adapter;
    ListView listView;




    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        m_parts.add(new Item("MyItemName #1", "This is item #1", 0));
        m_parts.add(new Item("MyItemName #2", "This is item #2", 0));

        m_adapter = new ItemAdapter(this, R.layout.list_item, m_parts);
        setListAdapter(m_adapter);



    };




}