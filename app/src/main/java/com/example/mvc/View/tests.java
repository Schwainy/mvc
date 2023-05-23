package com.example.mvc.View;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvc.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class tests extends Fragment {

    AppCompatButton[] kateg;
    private BottomSheetDialog bottomSheetDialog;
    private AppCompatButton close;

    public tests() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tests, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        bottomSheetDialog = new BottomSheetDialog(getActivity());
        bottomSheetDialog.setContentView(R.layout.bottomsheet);

        close = bottomSheetDialog.findViewById(R.id.close);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sheephide();
            }
        });


        kateg = new AppCompatButton[12];
        for (int i = 0; i < 12; i++) {
            kateg[i] = requireView().findViewById(Resources.getSystem().getIdentifier("button" + (i+1), "id", getActivity().getPackageName()));
        }
    }

    public void OnClick(View v){
        AppCompatButton btn = (AppCompatButton) v;
        for (AppCompatButton bt : kateg) {
            bt.setBackgroundDrawable(getActivity().getApplication().getDrawable(R.drawable.butto_unact));
            bt.setTextColor(Color.parseColor("#7E7E9A"));
        }
        btn.setBackgroundDrawable(getActivity().getApplication().getDrawable(R.drawable.button_fone));
        btn.setTextColor(Color.parseColor("#ffffff"));
    }
    public void sheep(View v){
        bottomSheetDialog.show();
    }
    public void sheephide(){
        bottomSheetDialog.hide();

    }

}