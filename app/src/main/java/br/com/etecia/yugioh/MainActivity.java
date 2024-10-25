package br.com.etecia.yugioh;

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
            lstCards.add(new Card("drafo", R.drawable.polimeriz));


        recyclerView = findViewById(R.id.idRecCard);

        Adaptador adaptador = new Adaptador(getApplicationContext(),lstCards);

        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));

        recyclerView.hasFixedSize();

        recyclerView.setAdapter(adaptador);
    }
}