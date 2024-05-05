package com.sergio.lab4_20175719.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.sergio.lab4_20175719.R;

public class ClimaFragmentDirections {
  private ClimaFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionFragmentClimaToFragmentGeolocation() {
    return new ActionOnlyNavDirections(R.id.action_fragmentClima_to_fragmentGeolocation);
  }
}
