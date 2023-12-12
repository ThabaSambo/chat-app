package com.example.geeks_chat;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class UserAdpter extends RecyclerView.Adapter<UserAdpter.vieholder>{
    @NonNull
    @Override
    public UserAdpter.vieholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdpter.vieholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class vieholder extends RecyclerView.ViewHolder {
        public vieholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
