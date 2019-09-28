package com.example.listviewandroid37;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    ListView lvContact;
    Contact contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9 ,contact10;
    List<Contact> contactList;
    AdaptorContact adaptorContact;

    RelativeLayout btnGioHang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTitle("Menu: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lvContact = findViewById(R.id.listView1);
        btnGioHang = findViewById(R.id.btnGioHang);
        contactList = new ArrayList<>();

        contact1 =  new Contact(1,"Cơm Rang Dưa Bò","35.0000 vnđ");
        contact2 =  new Contact(2,"Xúc Xích","10.0000 vnđ");
        contact3 =  new Contact(3,"Nước Chanh","15.0000 vnđ");
        contact4 =  new Contact(4,"Mẹt Ăn Vặt","50.0000 vnđ");
        contact5 =  new Contact(5,"Mì Tôm Trứng","20.0000 vnđ");
        contact6 =  new Contact(6,"Cơm Gà","45.0000 vnđ");
        contact7 =  new Contact(7,"Mì Tôm Xúc Xích","18.0000 vnđ");
        contact8 =  new Contact(8,"Cơm Niêu","35.0000 vnđ");
        contact9 =  new Contact(9,"Gà Rán KFC","40.0000 vnđ");
        contact10 =  new Contact(10,"String Vàng","8.0000 vnđ");

        contactList.add(contact1);
        contactList.add(contact2);
        contactList.add(contact3);
        contactList.add(contact4);
        contactList.add(contact5);
        contactList.add(contact6);
        contactList.add(contact7);
        contactList.add(contact8);
        contactList.add(contact9);
        contactList.add(contact10);

        adaptorContact = new AdaptorContact(contactList);
        lvContact.setAdapter(adaptorContact);

        btnGioHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,GioHang.class);
                startActivity(intent);
            }
        });


    }

}
