package com.example.taylormarkryan.ticketviewer;


import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class QuestionsAdapter extends BaseExpandableListAdapter {
    private Context ctx;
    private HashMap<String, List<String>> Questions_Category;
    private List<String> Questions_List;

    public QuestionsAdapter(Context ctx, HashMap<String, List<String>> Questions_Category, List<String> Questions_List)
    {
        this.ctx = ctx;
        this.Questions_Category = Questions_Category;
        this.Questions_List = Questions_List;


    }



    @Override
    public int getGroupCount() {
        return Questions_List.size();
    }

    @Override
    public int getChildrenCount(int arg0) {
        return Questions_Category.get(Questions_List.get(arg0)).size();
    }

    @Override
    public Object getGroup(int arg0) {
        return Questions_List.get(arg0);
    }

    @Override
    public Object getChild(int parent, int child) {


        return Questions_Category.get(Questions_List.get(parent)).get(child);
    }

    @Override
    public long getGroupId(int arg0) {
        return arg0;
    }

    @Override
    public long getChildId(int parent, int child) {
        return child;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int parent, boolean isExpanded, View convertView, ViewGroup parentView) {
        String group_title = (String) getGroup(parent);
        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.parent_layout, parentView,false );
        }
        TextView parent_textview = (TextView) convertView.findViewById(R.id.parent_txt);
        parent_textview .setTypeface(null, Typeface.BOLD);
        parent_textview.setText(group_title);
        return convertView;
    }

    @Override
    public View getChildView(int parent, int child, boolean lastChild, View convertview, ViewGroup parentview)
    {
        String child_title = (String) getChild(parent, child);
        if(convertview == null)
        {
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertview = inflater.inflate(R.layout.child_layout, parentview,false);
        }
        TextView child_textview = (TextView) convertview.findViewById(R.id.child_txt);
        child_textview.setText(child_title);
        return convertview;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}