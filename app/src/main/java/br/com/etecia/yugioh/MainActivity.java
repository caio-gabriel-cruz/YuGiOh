package br.com.etecia.yugioh;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Card> lstCards;

    @SuppressLint("SuspiciousIndentation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        lstCards = new ArrayList<>();
        lstCards.add(new Card("Polimerização", R.drawable.polimeriz));
        lstCards.add(new Card("Dragão Alado de Rá", R.drawable.alado));
        lstCards.add(new Card("Dragão Branco de Olhos Azuis", R.drawable.bar));
        lstCards.add(new Card("Dragão Bebê", R.drawable.bebe));
        lstCards.add(new Card("Exodia", R.drawable.exodia));
        lstCards.add(new Card("Exodia Necross", R.drawable.exodiapreto));
        lstCards.add(new Card("Mago Negro", R.drawable.mago));
        lstCards.add(new Card("Maga Negra", R.drawable.maga));
        lstCards.add(new Card("Obelisco o Atormentador", R.drawable.obelisc));
        lstCards.add(new Card("Mago do Tempo", R.drawable.tempo));
        lstCards.add(new Card("Slifer o Dragão dos Céus", R.drawable.slifer));
        lstCards.add(new Card("Kuriboh", R.drawable.kudeburro));
        lstCards.add(new Card("Magna", R.drawable.magna));
        //lstCards.add(new Card("Monstro que Renasce", R.drawable.renasce));
        lstCards.add(new Card("Rei Caveira", R.drawable.caveira));
        lstCards.add(new Card("Tyranno", R.drawable.dinossauro));
        lstCards.add(new Card("Mundo Toon", R.drawable.fantasia));
        lstCards.add(new Card("Gaia", R.drawable.gaia));
        lstCards.add(new Card("Gazelle", R.drawable.gazelle));
        lstCards.add(new Card("Maldição do Dragão", R.drawable.maldicao));
        lstCards.add(new Card("Dragão Preto", R.drawable.preto));


        recyclerView = findViewById(R.id.idRecCard);

        Adaptador adaptador = new Adaptador(getApplicationContext(), lstCards);

        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        recyclerView.hasFixedSize();

        recyclerView.setAdapter(adaptador);
    }
}