package com.example.semana3.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.semana3.FormActivity;
import com.example.semana3.Models.Persona;
import com.example.semana3.R;

import java.util.Set;

public class SecondFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        //Button btnNext = (Button) view.findViewById(R.id.btn_next);
        setupUI(view);
        return view;
    }

    public void setupUI(final View view){
        final EditText snombre = (EditText) view.findViewById(R.id.nombre);
        final EditText sapellido = (EditText) view.findViewById(R.id.apellido);
        final EditText scorreo = (EditText) view.findViewById(R.id.correo);
        final EditText stelefono = (EditText) view.findViewById(R.id.telefono);

        Button btnDatos = (Button) view.findViewById(R.id.btndatos);
        btnDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nombre = snombre.getText().toString();

                String apellido = sapellido.getText().toString();

                String correo = scorreo.getText().toString();

                String telefono = stelefono.getText().toString();

                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                CargaFragment fragment3 = new CargaFragment();
                Bundle bundle = new Bundle();
                Persona obj = new Persona(nombre, apellido, correo, telefono); //Our Persona Object
                bundle.putSerializable("Persona", obj);
                fragment3.setArguments(bundle);
                ft.replace(android.R.id.content, fragment3);
                ft.addToBackStack(null); //Add fragment in back stack
                ft.commit();

                /*Intent intent = new Intent(getContext(), FormActivity.class);
                getActivity().startActivity(intent);
                getActivity().finish();*/
            }
        });
    }


}
