package com.example.semana3.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.semana3.FormActivity;
import com.example.semana3.Models.Persona;
import com.example.semana3.R;

public class CargaFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.carga_fragment, container, false);

        //Button btnNext = (Button) view.findViewById(R.id.btn_next);
        setupUI(view);
        return view;
    }

    public void setupUI(final View view){
        Bundle bundle = getArguments();
        Persona obj= (Persona) bundle.getSerializable("Persona");

         TextView txv = (TextView) view.findViewById(R.id.Carga);

       // final EditText mEdittext = (EditText) findViewById(R.id.editText);
        String vContenido;
                //mEdittext.getText().toString();

        vContenido =obj.getName().toString();

        txv.setText(vContenido);

    }

}
