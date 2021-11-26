// Generated by view binder compiler. Do not edit!
package com.cyclopos.cyclop_connect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.cyclopos.cyclop_connect.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFindMyPhoneBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final Button bFindMyPhone;

  @NonNull
  public final ToolbarBinding toolbarLayout;

  private ActivityFindMyPhoneBinding(@NonNull CoordinatorLayout rootView,
      @NonNull Button bFindMyPhone, @NonNull ToolbarBinding toolbarLayout) {
    this.rootView = rootView;
    this.bFindMyPhone = bFindMyPhone;
    this.toolbarLayout = toolbarLayout;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFindMyPhoneBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFindMyPhoneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_find_my_phone, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFindMyPhoneBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bFindMyPhone;
      Button bFindMyPhone = rootView.findViewById(id);
      if (bFindMyPhone == null) {
        break missingId;
      }

      id = R.id.toolbar_layout;
      View toolbarLayout = rootView.findViewById(id);
      if (toolbarLayout == null) {
        break missingId;
      }
      ToolbarBinding binding_toolbarLayout = ToolbarBinding.bind(toolbarLayout);

      return new ActivityFindMyPhoneBinding((CoordinatorLayout) rootView, bFindMyPhone,
          binding_toolbarLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
