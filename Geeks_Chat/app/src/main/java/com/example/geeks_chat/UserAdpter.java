package com.example.geeks_chat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserAdpter extends RecyclerView.Adapter<UserAdpter.vieholder>{
    MainActivity mainActivity;
    ArrayList<Users> usersArrayList;
    List<Users> usersList;
    public UserAdpter(ArrayList<Users> usersArrayList)
    {
       this.usersArrayList=new ArrayList<>();
    }


    @NonNull
    @Override
    public UserAdpter.vieholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mainActivity).inflate(R.layout.user_item,parent,false);
        return new vieholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdpter.vieholder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return usersArrayList.size();

    }

    public class vieholder extends RecyclerView.ViewHolder {
        CircleImageView userimg;
        TextView username;
        TextView userstatus;
        public vieholder(@NonNull View itemView) {
            super(itemView);
            userimg=itemView.findViewById(R.id.user_img);
            username=itemView.findViewById(R.id.username);
            userstatus=itemView.findViewById(R.id.userstatus);


        }

    }
}
