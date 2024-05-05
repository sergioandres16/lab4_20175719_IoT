package com.sergio.lab4_20175719.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.sergio.lab4_20175719.R;
import com.sergio.lab4_20175719.databinding.FragmentClimaBinding;

public class ClimaFragment extends Fragment {
    FragmentClimaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= FragmentClimaBinding.inflate(inflater, container, false);
        binding.geolocationButton.setOnClickListener(view -> {
            NavController navController = NavHostFragment.findNavController(ClimaFragment.this);
            navController.navigate(ClimaFragmentDirections.actionFragmentClimaToFragmentGeolocation());
        });

        return binding.getRoot();
    }
}