package br.com.etecia.yugioh;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {
    private Context context;
    private List<Card> lstcards;


    public Adaptador(Context context, List<Card> lstcards) {
        this.context = context;
        this.lstcards = lstcards;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_card_activity,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.modeloTitulo.setText(lstcards.get(position).getNome());
        holder.modeloImagem.setImageResource(lstcards.get(position).getImagem());

    }

    @Override
    public int getItemCount() {
        return lstcards.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView modeloTitulo;
        ImageView modeloImagem;
        TextView modeloDescri;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        modeloTitulo = itemView.findViewById(R.id.idTituloModeloCard);
        modeloImagem = itemView.findViewById(R.id.idFotoModeloCard);
//        modeloDescri = itemView.findViewById(R.id.idDescModeloCard);
    }
}



}
