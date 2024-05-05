// Generated by view binder compiler. Do not edit!
package com.sergio.lab4_20175719.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sergio.lab4_20175719.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentGeolocationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText cityInput;

  @NonNull
  public final Button climaButton;

  @NonNull
  public final ConstraintLayout fragmentGeolocation;

  @NonNull
  public final Button geolocationButton;

  @NonNull
  public final Button searchButton;

  @NonNull
  public final Toolbar toolbar;

  private FragmentGeolocationBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText cityInput, @NonNull Button climaButton,
      @NonNull ConstraintLayout fragmentGeolocation, @NonNull Button geolocationButton,
      @NonNull Button searchButton, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.cityInput = cityInput;
    this.climaButton = climaButton;
    this.fragmentGeolocation = fragmentGeolocation;
    this.geolocationButton = geolocationButton;
    this.searchButton = searchButton;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentGeolocationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentGeolocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_geolocation, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentGeolocationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cityInput;
      EditText cityInput = ViewBindings.findChildViewById(rootView, id);
      if (cityInput == null) {
        break missingId;
      }

      id = R.id.climaButton;
      Button climaButton = ViewBindings.findChildViewById(rootView, id);
      if (climaButton == null) {
        break missingId;
      }

      ConstraintLayout fragmentGeolocation = (ConstraintLayout) rootView;

      id = R.id.geolocationButton;
      Button geolocationButton = ViewBindings.findChildViewById(rootView, id);
      if (geolocationButton == null) {
        break missingId;
      }

      id = R.id.searchButton;
      Button searchButton = ViewBindings.findChildViewById(rootView, id);
      if (searchButton == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new FragmentGeolocationBinding((ConstraintLayout) rootView, cityInput, climaButton,
          fragmentGeolocation, geolocationButton, searchButton, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
