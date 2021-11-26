// Generated by view binder compiler. Do not edit!
package com.cyclopos.cyclop_connect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import com.cyclopos.cyclop_connect.R;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ToolbarBinding implements ViewBinding {
  @NonNull
  private final AppBarLayout rootView;

  @NonNull
  public final Toolbar toolbar;

  private ToolbarBinding(@NonNull AppBarLayout rootView, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public AppBarLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.toolbar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ToolbarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.toolbar;
      Toolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      return new ToolbarBinding((AppBarLayout) rootView, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
