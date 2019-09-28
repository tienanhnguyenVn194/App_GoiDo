package com.example.listviewandroid37;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdaptorContact extends BaseAdapter {

    List<Contact> contactList;

    public AdaptorContact(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public int getCount() {
        return contactList.size();
    }

    @Override
    public Object getItem(int i) {
        return contactList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View v = inflater.inflate(R.layout.item_contact,viewGroup,false);

        TextView tvName = v.findViewById(R.id.tvName);
        TextView tvPrice = v.findViewById(R.id.tvPrice);
        Button btnAdd = v.findViewById(R.id.btnAdd);
        Button btnDel = v.findViewById(R.id.btnDel);
        final TextView tvSoLuong = v.findViewById(R.id.tvSoLuong);

        Contact contact = contactList.get(i);

        tvName.setText(contact.getName());
        tvPrice.setText(contact.getPrice());

        ImageView ImgFoods = v.findViewById(R.id.ImgFoods);

        if(contact.getIdIcon()==1){
            ImgFoods.setImageResource(R.drawable.duabo);
        }
        if(contact.getIdIcon()==2){
            ImgFoods.setImageResource(R.drawable.xucxich);
        }
        if(contact.getIdIcon()==3){
            ImgFoods.setImageResource(R.drawable.nuocchanh);
        }
        if(contact.getIdIcon()==4){
            ImgFoods.setImageResource(R.drawable.metanvat);
        }
        if(contact.getIdIcon()==5){
            ImgFoods.setImageResource(R.drawable.mitontrung);
        }
        if(contact.getIdIcon()==6){
            ImgFoods.setImageResource(R.drawable.comga);
        }
        if(contact.getIdIcon()==7){
            ImgFoods.setImageResource(R.drawable.mixucxich);
        }
        if(contact.getIdIcon()==8){
            ImgFoods.setImageResource(R.drawable.comnieu);
        }
        if(contact.getIdIcon()==9){
            ImgFoods.setImageResource(R.drawable.garan);
        }
        if(contact.getIdIcon()==10){
            ImgFoods.setImageResource(R.drawable.stingvang);
        }

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("AAAAA", "onclick");
                int soluong;
                soluong = Integer.parseInt(tvSoLuong.getText().toString());
                soluong = soluong + 1;
                String newsoluong;
                newsoluong = String.valueOf(soluong);
                tvSoLuong.setText(newsoluong);
            }
        });


        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int soluong;
                soluong = Integer.parseInt(tvSoLuong.getText().toString());
                soluong = soluong - 1;
                String newsoluong;
                newsoluong = String.valueOf(soluong);
                tvSoLuong.setText(newsoluong);
            }
        });

        return v;
    }
}
