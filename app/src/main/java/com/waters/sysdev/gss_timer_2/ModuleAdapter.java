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

public class ModuleAdapter extends BaseAdapter{

    private Context mContext;
    private ArrayList<Module> modules;


    public ModuleAdapter(Context mContext, ArrayList<Module> modules) {
        this.mContext = mContext;
        this.modules = modules;
    }

    @Override
    public int getCount() {
        return modules.size();
    }

    @Override
    public Object getItem(int position) {
        return modules.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Module module = modules.get(position);


        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.item_module_option, null);
        }


        //SystemHolder holder = new SystemHolder();
        final ImageView module_img;
        final TextView module_name;

        module_img = (ImageView) convertView.findViewById(R.id.item_module_image);
        module_name = (TextView) convertView.findViewById(R.id.item_module_name);

        module_name.setText(module.getTitle());
        module_img.setImageResource(module.getImg());

        return convertView;
    }
}
