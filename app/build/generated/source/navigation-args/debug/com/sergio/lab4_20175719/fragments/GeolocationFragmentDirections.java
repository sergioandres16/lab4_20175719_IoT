package com.sergio.lab4_20175719.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.sergio.lab4_20175719.R;

public class GeolocationFragmentDirections {
  private GeolocationFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionFragmentGeolocationToFragmentClima() {
    return new ActionOnlyNavDirections(R.id.action_fragmentGeolocation_to_fragmentClima);
  }
}
