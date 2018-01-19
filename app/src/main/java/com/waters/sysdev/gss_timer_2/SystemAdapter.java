package com.waters.sysdev.gss_timer_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by usskel on 1/19/2018.
 */

public class SystemAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<System> systems;

    public SystemAdapter(Context mContext, ArrayList<System> systems) {
        this.mContext = mContext;
        this.systems = systems;
    }

    @Override
    public int getCount() {
        return systems.size();
    }

    @Override
    public Object getItem(int position) {
        return systems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public class SystemHolder{
        TextView system_text;
        ImageView system_img;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final System system = systems.get(position);


        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.item_system_option, null);
        }


        //SystemHolder holder = new SystemHolder();
        final ImageView system_img;
        final TextView system_name;

        system_img = (ImageView) convertView.findViewById(R.id.item_system_image);
        system_name = (TextView) convertView.findViewById(R.id.item_system_name);


        system_name.setText(system.getTitle());
        system_img.setImageResource(system.getImg());

        return convertView;
    }
}
