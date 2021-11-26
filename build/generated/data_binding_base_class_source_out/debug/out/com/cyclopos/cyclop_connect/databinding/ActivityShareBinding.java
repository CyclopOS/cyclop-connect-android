// Generated by view binder compiler. Do not edit!
package com.cyclopos.cyclop_connect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.cyclopos.cyclop_connect.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityShareBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final DevicesListBinding devicesListLayout;

  @NonNull
  public final ToolbarBinding toolbarLayout;

  private ActivityShareBinding(@NonNull CoordinatorLayout rootView,
      @NonNull DevicesListBinding devicesListLayout, @NonNull ToolbarBinding toolbarLayout) {
    this.rootView = rootView;
    this.devicesListLayout = devicesListLayout;
    this.toolbarLayout = toolbarLayout;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityShareBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityShareBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_share, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityShareBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.devices_list_layout;
      View devicesListLayout = rootView.findViewById(id);
      if (devicesListLayout == null) {
        break missingId;
      }
      DevicesListBinding binding_devicesListLayout = DevicesListBinding.bind(devicesListLayout);

      id = R.id.toolbar_layout;
      View toolbarLayout = rootView.findViewById(id);
      if (toolbarLayout == null) {
        break missingId;
      }
      ToolbarBinding binding_toolbarLayout = ToolbarBinding.bind(toolbarLayout);

      return new ActivityShareBinding((CoordinatorLayout) rootView, binding_devicesListLayout,
          binding_toolbarLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
