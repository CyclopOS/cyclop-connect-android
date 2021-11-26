// Generated by view binder compiler. Do not edit!
package com.cyclopos.cyclop_connect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.cyclopos.cyclop_connect.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class SystemVolumeFragmentBinding implements ViewBinding {
  @NonNull
  private final RecyclerView rootView;

  @NonNull
  public final RecyclerView audioDevicesRecycler;

  private SystemVolumeFragmentBinding(@NonNull RecyclerView rootView,
      @NonNull RecyclerView audioDevicesRecycler) {
    this.rootView = rootView;
    this.audioDevicesRecycler = audioDevicesRecycler;
  }

  @Override
  @NonNull
  public RecyclerView getRoot() {
    return rootView;
  }

  @NonNull
  public static SystemVolumeFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SystemVolumeFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.system_volume_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SystemVolumeFragmentBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    RecyclerView audioDevicesRecycler = (RecyclerView) rootView;

    return new SystemVolumeFragmentBinding((RecyclerView) rootView, audioDevicesRecycler);
  }
}
