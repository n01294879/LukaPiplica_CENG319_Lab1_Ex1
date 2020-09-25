package com.example.lukapiplica_lab1_ex1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AIActivity extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Toast.makeText(getActivity(), "AIActivity executed", Toast.LENGTH_LONG);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void onStart() {
        super.onStart();
        Toast.makeText(getActivity(), "AIActivity executed", Toast.LENGTH_LONG);

        TextView textview = getActivity().findViewById(R.id.cyclesactive);
        textview.append("onCreate executed\n");
    }
}
