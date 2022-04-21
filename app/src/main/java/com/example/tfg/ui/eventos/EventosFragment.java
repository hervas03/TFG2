package com.example.tfg.ui.eventos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.tfg.databinding.FragmentEventosBinding;

public class EventosFragment extends Fragment {

    private FragmentEventosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentEventosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textEventos;

        textView.setText("eventos");

        return root;
    }
}
