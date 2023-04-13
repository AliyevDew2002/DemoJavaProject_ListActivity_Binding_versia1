package com.example.demojavaproject_listactivity_binding_versia1.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.demojavaproject_listactivity_binding_versia1.R;
import com.example.demojavaproject_listactivity_binding_versia1.adapter.MemberAdapter;
import com.example.demojavaproject_listactivity_binding_versia1.databinding.ActivityMainBinding;
import com.example.demojavaproject_listactivity_binding_versia1.model.Member;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        initViews();
    }
    void initViews(){
        ArrayList<Member> members=listCreator();
        refreshAdapter(members);
    }



    ArrayList<Member> listCreator(){
       ArrayList<Member> members=new ArrayList<>();
       for(int i=0; i<=30; i++){
           members.add(new Member(R.mipmap.ic_launcher, "Shaxzod Aliyev:"+ i));
       }
        return members;
    }


    void refreshAdapter(ArrayList<Member> members){
        MemberAdapter memberAdapter=new MemberAdapter(this, members);
        binding.listView.setAdapter(memberAdapter);
    }
}