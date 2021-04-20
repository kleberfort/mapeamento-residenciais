package com.example.mapeamentoresidenciais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.mapeamentoresidenciais.listaDeResidenciais.joseEuclides.JoseEuclidesQuadra1;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    private Spinner spnResidenciais, spnQuadras, spnBlocos;

    private ArrayAdapter<CharSequence> adpResidenciais,adpQdJe, adpQdLg, adpBlocos;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnResidenciais = findViewById(R.id.spinnerResidencial);
        spnQuadras = findViewById(R.id.spinnerQuadra);
        spnBlocos = findViewById(R.id.spinnerBloco);



        carregarListaResidenciais();
        carregarListaQuadraJoseEuclides();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    protected void onStart() {
       super.onStart();

       spnResidenciais.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               if(spnResidenciais.getSelectedItemPosition() == 0 ){
                   carregarListaQuadraJoseEuclides();
                    carregarListaBlocoAte15();
               }else{
                   carregarListaQuadraLuisGonzaga();
                   carregarListaBlocoAte20();
               }
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });

       spnQuadras.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 0 ){
                   carregarListaBlocoAte15();
               }else if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 1){
                   carregarListaBlocoAte15();
               }else if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 2){
                   carregarListaBlocoAte16();
               }else if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 3){
                   carregarListaBlocoAte17();
               }else if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 4){
                   carregarListaBlocoAte16();
               }else if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 5){
                   carregarListaBlocoAte16();
               }else if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 6){
                   carregarListaBlocoAte13();
               }else if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 7){
                   carregarListaBlocoAte16();
               }else if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 8){
                   carregarListaBlocoAte15();
               }else if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 9){
                   carregarListaBlocoAte16();
               }else if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 10){
                   carregarListaBlocoAte14();
               }else if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 11){
                   carregarListaBlocoAte16();
               }
               if(spnResidenciais.getSelectedItemPosition() == 1 && spnQuadras.getSelectedItemPosition() == 0){
                   carregarListaBlocoAte20();
               }else if(spnResidenciais.getSelectedItemPosition() == 1 && spnQuadras.getSelectedItemPosition() == 1){
                   carregarListaBlocoAte22();
               }else if(spnResidenciais.getSelectedItemPosition() == 1 && spnQuadras.getSelectedItemPosition() == 2){
                   carregarListaBlocoAte31();
               }else if(spnResidenciais.getSelectedItemPosition() == 1 && spnQuadras.getSelectedItemPosition() == 3){
                   carregarListaBlocoAte19();
               }else if(spnResidenciais.getSelectedItemPosition() == 1 && spnQuadras.getSelectedItemPosition() == 4){
                   carregarListaBlocoAte18();
               }
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });

       spnBlocos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 0 && spnBlocos.getCount() >= 0){
                   switch (spnBlocos.getSelectedItemPosition()){
                       case 0:
                           break;
                       case 1:
                           break;
                       case 2:
                           break;
                       case 3:
                           break;
                       case 4:
                           break;
                       case 5:
                           break;
                       case 6:
                           break;
                       case 7:
                           break;
                       case 8:
                           break;
                       case 9:
                           break;
                       case 10:
                           break;
                       case 11:
                           break;
                       case 12:
                           break;
                       case 13:
                           break;
                       case 14:
                           Toast.makeText(getApplicationContext(), "Blc 15, Quadra 1, JE", Toast.LENGTH_SHORT).show();
                           break;

                   }
               }else if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 1 && spnBlocos.getCount() >= 0 ){
                   switch (spnBlocos.getSelectedItemPosition()){
                       case 0:
                           Toast.makeText(getApplicationContext(), "Bc 1, quadra 2, JE", Toast.LENGTH_SHORT).show();
                           break;
                       case 1:
                           break;
                       case 2:
                           break;
                       case 3:
                           break;
                       case 4:
                           break;
                       case 5:
                           break;
                       case 6:
                           break;
                       case 7:
                           break;
                       case 8:
                           break;
                       case 9:
                           break;
                       case 10:
                           break;
                       case 11:
                           break;
                       case 12:
                           break;
                       case 13:
                           break;
                       case 14:
                           Toast.makeText(getApplicationContext(), "Blc 15, Quadra 1, JE", Toast.LENGTH_SHORT).show();
                           break;

                   }
               }else if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 2 && spnBlocos.getCount() >= 0 ){
                   switch (spnBlocos.getSelectedItemPosition()){
                       case 0:
                           break;
                       case 1:
                           break;
                       case 2:
                           break;
                       case 3:
                           break;
                       case 4:
                           break;
                       case 5:
                           break;
                       case 6:
                           break;
                       case 7:
                           break;
                       case 8:
                           break;
                       case 9:
                           break;
                       case 10:
                           break;
                       case 11:
                           break;
                       case 12:
                           break;
                       case 13:
                           break;
                       case 14:
                           Toast.makeText(getApplicationContext(), "Blc 15, Quadra 1, JE", Toast.LENGTH_SHORT).show();
                           break;
                       case 15:
                           break;


                   }
               }else if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 3 && spnBlocos.getCount() >= 0 ){
                   switch (spnBlocos.getSelectedItemPosition()){
                       case 0:
                           break;
                       case 1:
                           break;
                       case 2:
                           break;
                       case 3:
                           break;
                       case 4:
                           break;
                       case 5:
                           break;
                       case 6:
                           break;
                       case 7:
                           break;
                       case 8:
                           break;
                       case 9:
                           break;
                       case 10:
                           break;
                       case 11:
                           break;
                       case 12:
                           break;
                       case 13:
                           break;
                       case 14:
                           Toast.makeText(getApplicationContext(), "Blc 15, Quadra 1, JE", Toast.LENGTH_SHORT).show();
                           break;
                       case 15:
                           break;
                       case 16:
                           break;


                   }
               }else if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 4 && spnBlocos.getCount() >= 0 ){
                   switch (spnBlocos.getSelectedItemPosition()){
                       case 0:
                           break;
                       case 1:
                           break;
                       case 2:
                           break;
                       case 3:
                           break;
                       case 4:
                           break;
                       case 5:
                           break;
                       case 6:
                           break;
                       case 7:
                           break;
                       case 8:
                           break;
                       case 9:
                           break;
                       case 10:
                           break;
                       case 11:
                           break;
                       case 12:
                           break;
                       case 13:
                           break;
                       case 14:
                           Toast.makeText(getApplicationContext(), "Blc 15, Quadra 1, JE", Toast.LENGTH_SHORT).show();
                           break;
                       case 15:
                           break;


                   }
               }else if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 5 && spnBlocos.getCount() >= 0 ){
                   switch (spnBlocos.getSelectedItemPosition()){
                       case 0:
                           break;
                       case 1:
                           break;
                       case 2:
                           break;
                       case 3:
                           break;
                       case 4:
                           break;
                       case 5:
                           break;
                       case 6:
                           break;
                       case 7:
                           break;
                       case 8:
                           break;
                       case 9:
                           break;
                       case 10:
                           break;
                       case 11:
                           break;
                       case 12:
                           break;
                       case 13:
                           break;
                       case 14:
                           Toast.makeText(getApplicationContext(), "Blc 15, Quadra 1, JE", Toast.LENGTH_SHORT).show();
                           break;
                       case 15:
                           break;


                   }
               }else if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 6 && spnBlocos.getCount() >= 0 ){
                   switch (spnBlocos.getSelectedItemPosition()){
                       case 0:
                           break;
                       case 1:
                           break;
                       case 2:
                           break;
                       case 3:
                           break;
                       case 4:
                           break;
                       case 5:
                           break;
                       case 6:
                           break;
                       case 7:
                           break;
                       case 8:
                           break;
                       case 9:
                           break;
                       case 10:
                           break;
                       case 11:
                           break;
                       case 12:
                           break;

                   }
               }else if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 7 && spnBlocos.getCount() >= 0 ){
                   switch (spnBlocos.getSelectedItemPosition()){
                       case 0:
                           break;
                       case 1:
                           break;
                       case 2:
                           break;
                       case 3:
                           break;
                       case 4:
                           break;
                       case 5:
                           break;
                       case 6:
                           break;
                       case 7:
                           break;
                       case 8:
                           break;
                       case 9:
                           break;
                       case 10:
                           break;
                       case 11:
                           break;
                       case 12:
                           break;
                       case 13:
                           break;
                       case 14:
                           Toast.makeText(getApplicationContext(), "Blc 15, Quadra 1, JE", Toast.LENGTH_SHORT).show();
                           break;
                       case 15:
                           break;


                   }
               }else if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 8 && spnBlocos.getCount() >= 0 ){
                   switch (spnBlocos.getSelectedItemPosition()){
                       case 0:
                           break;
                       case 1:
                           break;
                       case 2:
                           break;
                       case 3:
                           break;
                       case 4:
                           break;
                       case 5:
                           break;
                       case 6:
                           break;
                       case 7:
                           break;
                       case 8:
                           break;
                       case 9:
                           break;
                       case 10:
                           break;
                       case 11:
                           break;
                       case 12:
                           break;
                       case 13:
                           break;
                       case 14:
                           Toast.makeText(getApplicationContext(), "Blc 15, Quadra 1, JE", Toast.LENGTH_SHORT).show();
                           break;

                   }
               }else if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 9 && spnBlocos.getCount() >= 0 ){
                   switch (spnBlocos.getSelectedItemPosition()){
                       case 0:
                           break;
                       case 1:
                           break;
                       case 2:
                           break;
                       case 3:
                           break;
                       case 4:
                           break;
                       case 5:
                           break;
                       case 6:
                           break;
                       case 7:
                           break;
                       case 8:
                           break;
                       case 9:
                           break;
                       case 10:
                           break;
                       case 11:
                           break;
                       case 12:
                           break;
                       case 13:
                           break;
                       case 14:
                           Toast.makeText(getApplicationContext(), "Blc 15, Quadra 8, JE", Toast.LENGTH_SHORT).show();
                           break;
                       case 15:
                           break;


                   }
               }else if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 10 && spnBlocos.getCount() >= 0 ){
                   switch (spnBlocos.getSelectedItemPosition()){
                       case 0:
                           break;
                       case 1:
                           break;
                       case 2:
                           break;
                       case 3:
                           break;
                       case 4:
                           break;
                       case 5:
                           break;
                       case 6:
                           break;
                       case 7:
                           break;
                       case 8:
                           break;
                       case 9:
                           break;
                       case 10:
                           break;
                       case 11:
                           break;
                       case 12:
                           break;
                       case 13:
                           break;

                   }
               }else if(spnResidenciais.getSelectedItemPosition() == 0 && spnQuadras.getSelectedItemPosition() == 11 && spnBlocos.getCount() >= 0 ){
                   switch (spnBlocos.getSelectedItemPosition()){
                       case 0:
                           break;
                       case 1:
                           break;
                       case 2:
                           break;
                       case 3:
                           break;
                       case 4:
                           break;
                       case 5:
                           break;
                       case 6:
                           break;
                       case 7:
                           break;
                       case 8:
                           break;
                       case 9:
                           break;
                       case 10:
                           break;
                       case 11:
                           break;
                       case 12:
                           break;
                       case 13:
                           break;
                       case 14:
                           Toast.makeText(getApplicationContext(), "Blc 15, Quadra 10B, JE", Toast.LENGTH_SHORT).show();
                           break;
                       case 15:
                           break;

                   }

               }
               if(spnResidenciais.getSelectedItemPosition() == 1 && spnQuadras.getSelectedItemPosition() == 0 && spnBlocos.getCount() >= 0){
                   switch (spnBlocos.getSelectedItemPosition()){
                       case 0:
                           break;
                       case 1:
                           break;
                       case 2:
                           break;
                       case 3:
                           break;
                       case 4:
                           break;
                       case 5:
                           break;
                       case 6:
                           break;
                       case 7:
                           break;
                       case 8:
                           break;
                       case 9:
                           break;
                       case 10:
                           break;
                       case 11:
                           break;
                       case 12:
                           break;
                       case 13:
                           break;
                       case 14:
                           Toast.makeText(getApplicationContext(), "Blc 15, Quadra 1, JE", Toast.LENGTH_SHORT).show();
                           break;
                       case 15:
                           break;
                       case 16:
                           break;
                       case 17:
                           break;
                       case 18:
                           break;
                       case 19:
                           break;

                   }
               }else if(spnResidenciais.getSelectedItemPosition() == 1 && spnQuadras.getSelectedItemPosition() == 1 && spnBlocos.getCount() >= 0){
                   switch (spnBlocos.getSelectedItemPosition()){
                       case 0:
                           break;
                       case 1:
                           break;
                       case 2:
                           break;
                       case 3:
                           break;
                       case 4:
                           break;
                       case 5:
                           break;
                       case 6:
                           break;
                       case 7:
                           break;
                       case 8:
                           break;
                       case 9:
                           break;
                       case 10:
                           break;
                       case 11:
                           break;
                       case 12:
                           break;
                       case 13:
                           break;
                       case 14:
                           Toast.makeText(getApplicationContext(), "Blc 15, Quadra 1, JE", Toast.LENGTH_SHORT).show();
                           break;
                       case 15:
                           break;
                       case 16:
                           break;
                       case 17:
                           break;
                       case 18:
                           break;
                       case 19:
                           break;
                       case 20:
                           break;
                       case 21:
                           break;

                   }
               }else if(spnResidenciais.getSelectedItemPosition() == 1 && spnQuadras.getSelectedItemPosition() == 2 && spnBlocos.getCount() >= 0){
                   switch (spnBlocos.getSelectedItemPosition()){
                       case 0:
                           break;
                       case 1:
                           break;
                       case 2:
                           break;
                       case 3:
                           break;
                       case 4:
                           break;
                       case 5:
                           break;
                       case 6:
                           break;
                       case 7:
                           break;
                       case 8:
                           break;
                       case 9:
                           break;
                       case 10:
                           break;
                       case 11:
                           break;
                       case 12:
                           break;
                       case 13:
                           break;
                       case 14:
                           Toast.makeText(getApplicationContext(), "Blc 15, Quadra 1, JE", Toast.LENGTH_SHORT).show();
                           break;
                       case 15:
                           break;
                       case 16:
                           break;
                       case 17:
                           break;
                       case 18:
                           break;
                       case 19:
                           break;
                       case 20:
                           break;
                       case 21:
                           break;
                       case 22:
                           break;
                       case 23:
                           break;
                       case 24:
                           break;
                       case 25:
                           break;
                       case 26:
                           break;
                       case 27:
                           break;
                       case 28:
                           break;
                       case 29:
                           break;
                       case 30:
                           break;

                   }
               }else if(spnResidenciais.getSelectedItemPosition() == 1 && spnQuadras.getSelectedItemPosition() == 3 && spnBlocos.getCount() >= 0){
                   switch (spnBlocos.getSelectedItemPosition()) {
                       case 0:
                           break;
                       case 1:
                           break;
                       case 2:
                           break;
                       case 3:
                           break;
                       case 4:
                           break;
                       case 5:
                           break;
                       case 6:
                           break;
                       case 7:
                           break;
                       case 8:
                           break;
                       case 9:
                           break;
                       case 10:
                           break;
                       case 11:
                           break;
                       case 12:
                           break;
                       case 13:
                           break;
                       case 14:
                           Toast.makeText(getApplicationContext(), "Blc 15, Quadra 1, JE", Toast.LENGTH_SHORT).show();
                           break;
                       case 15:
                           break;
                       case 16:
                           break;
                       case 17:
                           break;
                       case 18:
                           break;
                   }
               }else if(spnResidenciais.getSelectedItemPosition() == 1 && spnQuadras.getSelectedItemPosition() == 4 && spnBlocos.getCount() >= 0){
                   switch (spnBlocos.getSelectedItemPosition()) {
                       case 0:
                           break;
                       case 1:
                           break;
                       case 2:
                           break;
                       case 3:
                           break;
                       case 4:
                           break;
                       case 5:
                           break;
                       case 6:
                           break;
                       case 7:
                           break;
                       case 8:
                           break;
                       case 9:
                           break;
                       case 10:
                           break;
                       case 11:
                           break;
                       case 12:
                           break;
                       case 13:
                           break;
                       case 14:
                           Toast.makeText(getApplicationContext(), "Blc 15, Quadra 1, JE", Toast.LENGTH_SHORT).show();
                           break;
                       case 15:
                           break;
                       case 16:
                           break;
                       case 17:
                           break;
                   }
               }
           }// fim do método onItemSelected do spnBlocos.

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });

    }//fim do método onStart

    @Override
    protected void onResume() {
        super.onResume();

        int errorCode = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this);
        switch (errorCode){
            case ConnectionResult.SERVICE_MISSING:
            case ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED:
            case ConnectionResult.SERVICE_DISABLED:
                Log.d("Teste", "Show Dialog");
                GoogleApiAvailability.getInstance().getErrorDialog(this, errorCode,
                        0, new DialogInterface.OnCancelListener() {
                            @Override
                            public void onCancel(DialogInterface dialog) {
                                finish();
                            }
                        }).show();
                break;
            case ConnectionResult.SUCCESS:
                Log.d("Teste", "Google Play Services up-to-update");
                break;
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);


        LatLng basePoliceJE = new LatLng(-3.851056,-38.518426);

        mMap.addMarker(new MarkerOptions().position(basePoliceJE).title("Base Policia José Euclides"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(basePoliceJE, 18));


    }

    public void carregarListaResidenciais(){
        adpResidenciais = ArrayAdapter.createFromResource(this, R.array.lista_residenciais,
                android.R.layout.simple_spinner_item);

        adpResidenciais.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spnResidenciais.setAdapter(adpResidenciais);

    }

    public void carregarListaQuadraJoseEuclides(){
        adpQdJe = ArrayAdapter.createFromResource(this, R.array.quadra_je,
                android.R.layout.simple_spinner_item);

        adpQdJe.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spnQuadras.setAdapter(adpQdJe);
    }

    public void carregarListaQuadraLuisGonzaga(){
        adpQdLg = ArrayAdapter.createFromResource(this, R.array.quadra_lg,
                android.R.layout.simple_spinner_item);
        adpQdLg.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spnQuadras.setAdapter(adpQdLg);
    }


    public void carregarListaBlocoAte13(){
        adpBlocos = ArrayAdapter.createFromResource(this, R.array.lista_bloco_ate13,
                android.R.layout.simple_spinner_item);

        adpBlocos.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spnBlocos.setAdapter(adpBlocos);


    }

    public void carregarListaBlocoAte14(){
        adpBlocos = ArrayAdapter.createFromResource(this, R.array.lista_bloco_ate14,
                android.R.layout.simple_spinner_item);
        adpBlocos.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spnBlocos.setAdapter(adpBlocos);

    }

    public void carregarListaBlocoAte15(){
        adpBlocos = ArrayAdapter.createFromResource(this, R.array.lista_bloco_ate15,
                android.R.layout.simple_spinner_item);
        adpBlocos.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spnBlocos.setAdapter(adpBlocos);
    }

    public void carregarListaBlocoAte16(){
        adpBlocos = ArrayAdapter.createFromResource(this, R.array.lista_bloco_ate16,
                android.R.layout.simple_spinner_item);
        adpBlocos.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spnBlocos.setAdapter(adpBlocos);
    }

    public void carregarListaBlocoAte17(){
        adpBlocos = ArrayAdapter.createFromResource(this, R.array.lista_bloco_ate17,
                android.R.layout.simple_spinner_item);
        adpBlocos.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spnBlocos.setAdapter(adpBlocos);
    }

    public void carregarListaBlocoAte18(){
        adpBlocos = ArrayAdapter.createFromResource(this, R.array.lista_bloco_ate18,
                android.R.layout.simple_spinner_item);
        adpBlocos.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spnBlocos.setAdapter(adpBlocos);
    }

    public void carregarListaBlocoAte19(){
        adpBlocos = ArrayAdapter.createFromResource(this, R.array.lista_bloco_ate19,
                android.R.layout.simple_spinner_item);
        adpBlocos.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spnBlocos.setAdapter(adpBlocos);

    }

    public void carregarListaBlocoAte20(){
        adpBlocos = ArrayAdapter.createFromResource(this, R.array.lista_bloco_ate20,
                android.R.layout.simple_spinner_item);
        adpBlocos.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spnBlocos.setAdapter(adpBlocos);
    }

    public void carregarListaBlocoAte22(){
        adpBlocos = ArrayAdapter.createFromResource(this, R.array.lista_bloco_ate22,
                android.R.layout.simple_spinner_item);
        adpBlocos.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spnBlocos.setAdapter(adpBlocos);
    }

    public void carregarListaBlocoAte31(){
        adpBlocos = ArrayAdapter.createFromResource(this, R.array.lista_bloco_ate31,
                android.R.layout.simple_spinner_item);
        adpBlocos.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spnBlocos.setAdapter(adpBlocos);
    }



}// fim da classe MainActivity
