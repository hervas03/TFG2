package com.example.tfg.ui.configuracion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.tfg.databinding.FragmentConfiguracionBinding;
import com.example.tfg.databinding.FragmentEventosBinding;

public class ConfiguracionFragment extends Fragment {

    private FragmentConfiguracionBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentConfiguracionBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textConfiguracion;

        textView.setText("configuracion");

        return root;
    }

}
