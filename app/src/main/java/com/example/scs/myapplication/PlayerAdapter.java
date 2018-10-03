package com.example.scs.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder>{

    //1
    private Context context;
    private List<Player> playersList;


    public PlayerAdapter(Context context, List<Player> playersList) {
        this.context = context;
        this.playersList = playersList;
    }

    //2
    @NonNull
    @Override
    public PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_item,null);
        return new PlayerViewHolder(view);
    }

    //4
    @Override
    public void onBindViewHolder(@NonNull PlayerViewHolder holder, int position) {

        Player currentPlayer = playersList.get(position);
        String ranking = currentPlayer.getPlayerRanking() + " - " + currentPlayer.getPlayerPoints();

        holder.textViewName.setText(currentPlayer.getPlayerName());
        holder.textViewCountry.setText(currentPlayer.getPlayerCountry().toUpperCase());
        holder.textViewRanking.setText(ranking);

        holder.imageView.setImageDrawable(context.getResources().getDrawable(currentPlayer.getPlayerImage()));

    }

    @Override
    public int getItemCount() {
        return playersList.size();
    }

    //3
    class PlayerViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textViewName,textViewCountry, textViewRanking;

        public PlayerViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.player_image);
            textViewName = itemView.findViewById(R.id.player_name);
            textViewCountry = itemView.findViewById(R.id.player_country);
            textViewRanking = itemView.findViewById(R.id.player_ranking);
        }
    }
}
