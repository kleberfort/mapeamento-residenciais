package com.example.mapeamentoresidenciais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.mapeamentoresidenciais.listaDeResidenciais.joseEuclides.JoseEuclidesQuadra1;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spnResidenciais, spnQuadras, spnBlocos;
    private List<String> listaResidenciais, listaQuadras, listaBlocos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnResidenciais = findViewById(R.id.spinnerResidencial);
        spnQuadras = findViewById(R.id.spinnerQuadra);
        spnBlocos = findViewById(R.id.spinnerBloco);

        carregarListaResidenciais();
        carregarListaQuadras();
        carregarListaBlocos();
    }

    private void carregarListaResidenciais(){
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.lista_residenciais,
                android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spnResidenciais.setAdapter(adapter);

    }
    private void carregarListaQuadras(){
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.lista_quadras_jose_euclides,
                android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spnQuadras.setAdapter(adapter);

    }

    private void carregarListaBlocos(){
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.lista_blocos,
                android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spnBlocos.setAdapter(adapter);

    }
}
