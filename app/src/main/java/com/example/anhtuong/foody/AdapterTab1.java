package com.example.anhtuong.foody;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by anhtuong on 4/2/17.
 */

public class AdapterTab1 extends BaseAdapter {

    // Cấu hình các thông số
    String[] result;
    Context context;
    int[] imageId;
    int[] imageId2;
    private static LayoutInflater inflater = null;

    public AdapterTab1(Tab1Activity tab1Activity, String[] prgmNameList, int[] prgmImages, int[] prgmImages2) {
        // TODO Auto-generated constructor stub
        // Khởi tạo các thông số
        result = prgmNameList;
        context = tab1Activity;
        imageId = prgmImages;
        imageId2 = prgmImages2;
        inflater = (LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder {
        TextView tv;
        ImageView img;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        // Đổ dữ liệu vào listView
        final Holder holder = new Holder();
        final View rowView;
        rowView = inflater.inflate(R.layout.item_list_tab1, null);
        holder.tv = (TextView) rowView.findViewById(R.id.textView1);
        holder.img = (ImageView) rowView.findViewById(R.id.imageView1);
        holder.tv.setText(result[position]);
        holder.img.setImageResource(imageId[position]);
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked " + result[position], Toast.LENGTH_LONG).show();
            }
        });
        return rowView;
    }
}
