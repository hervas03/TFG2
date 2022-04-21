package com.example.tfg.ui.tienda;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.tfg.databinding.FragmentTiendaBinding;

public class TiendaFragment extends Fragment {

    private FragmentTiendaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentTiendaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textTienda;

        textView.setText("tienda");

        return root;
    }
}
