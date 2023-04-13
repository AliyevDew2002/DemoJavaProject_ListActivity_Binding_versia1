package com.example.demojavaproject_listactivity_binding_versia1.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demojavaproject_listactivity_binding_versia1.R;
import com.example.demojavaproject_listactivity_binding_versia1.databinding.MemberListQolibBinding;
import com.example.demojavaproject_listactivity_binding_versia1.model.Member;

import java.util.ArrayList;

public class MemberAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    ArrayList<Member> members;

    MemberListQolibBinding listBinding;


    public MemberAdapter(Context context, ArrayList<Member> members){
        this.members=members;
        this.context=context;
        this.inflater=(LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return members.size();
    }

    @Override
    public Member getItem(int position) {
        return members.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MemberListQolibBinding mBinding;
        if(convertView==null){
            mBinding=MemberListQolibBinding.inflate(LayoutInflater.from(context),parent,false);
            convertView=mBinding.getRoot();
            convertView.setTag(mBinding);

        }else{
            mBinding=(MemberListQolibBinding)convertView.getTag();
        }

        Member member=members.get(position);

        mBinding.ivProfile.setImageResource(member.getProfile());
        mBinding.tvFullname.setText(member.getFullname());


        return convertView;
    }



}
