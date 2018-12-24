package com.example.saurabh.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int[] IMAGES={R.drawable.brio,R.drawable.honda,R.drawable.swift,R.drawable.elantra,R.drawable.hyun,R.drawable.brio,R.drawable.honda,R.drawable.swift,R.drawable.elantra,R.drawable.hyun};
    String[] Names={"BRIO","HONDA","SWIFT","Elantra","Hyundai","BRIO","HONDA","SWIFT","Elantra","Hyundai"};
    String[] Price={"Price:2000","Price:1200","Price:3000","Price:5000","Price:2500","Price:2000","Price:1200","Price:3000","Price:5000","Price:2500"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.ListView);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);

    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
            convertView =getLayoutInflater().inflate(R.layout.customlyout,null);
            ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView);
            TextView textView_name=(TextView)convertView.findViewById(R.id.textView_name);
            TextView textView_price=(TextView)convertView.findViewById(R.id.textView_price);

            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(Names[i]);
            textView_price.setText(Price[i]);

            return convertView;
        }
    }
}
