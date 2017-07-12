package com.fragmentos.seas.fragmentosysharedpreferences.fragmentos;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fragmentos.seas.fragmentosysharedpreferences.R;


public class FragmentoMenu extends Fragment {


    public FragmentoMenu() {
        // Required empty public constructor
    }
    /*Bloque de instancia*/
    //Cualquier que requiera de un fragmento en vez de hacer un new llamará a este método estático que devolverá un fragmento
    public static FragmentoMenu newInstance(Bundle datos){//Bundle para poder transferir datos entre diferentes activities, parecido a HashMaps
        FragmentoMenu fragmentoMenu = new FragmentoMenu();

        if(datos!=null){
            fragmentoMenu.setArguments(datos);
        }
        return fragmentoMenu;

    }
    /**/

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        /*Vincular una interface que me notifique acciones desde el Activity y el Fragmento*/


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmento_menu, container, false);
    }

}
