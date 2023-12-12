package com.example.geeks_chat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.animation.IntArrayEvaluator;
import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    FirebaseAuth auth;
    RecyclerView mainUserRecyclerView;
    UserAdpter adpter;
    FirebaseDatabase database;
    ArrayList<Users>usersArrayList;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database=FirebaseDatabase.getInstance();
        auth=FirebaseAuth.getInstance();

        DatabaseReference reference=database.getReference().child("user");
        usersArrayList=new ArrayList<>();
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    Users users = dataSnapshot.getValue(Users.class);
                    usersArrayList.add(users);
                }
                adpter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mainUserRecyclerView=findViewById(R.id.mainUserRecyclerView);
        mainUserRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //adpter
                mainUserRecyclerView.setAdapter(adpter);

        //if(auth.getCurrentUser()=null){
            Intent intent=new Intent(MainActivity.this,login.class);
            startActivity(intent);
        }



    }


