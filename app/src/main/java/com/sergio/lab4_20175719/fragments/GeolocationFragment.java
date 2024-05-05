package com.sergio.lab4_20175719.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sergio.lab4_20175719.R;
import com.sergio.lab4_20175719.databinding.FragmentGeolocationBinding;

public class GeolocationFragment extends Fragment {
FragmentGeolocationBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= FragmentGeolocationBinding.inflate(inflater, container, false);
        binding.climaButton.setOnClickListener(view -> {
            NavController navController = NavHostFragment.findNavController(GeolocationFragment.this);
            navController.navigate(GeolocationFragmentDirections.actionFragmentGeolocationToFragmentClima());
        });
        return binding.getRoot();
    }
}