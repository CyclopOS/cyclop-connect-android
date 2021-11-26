// Generated by view binder compiler. Do not edit!
package com.cyclopos.cyclop_connect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.cyclopos.cyclop_connect.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentStoragePreferenceDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextInputEditText storageDisplayName;

  @NonNull
  public final TextInputLayout storageDisplayNameInputLayout;

  @NonNull
  public final TextInputEditText storageLocation;

  private FragmentStoragePreferenceDialogBinding(@NonNull LinearLayout rootView,
      @NonNull TextInputEditText storageDisplayName,
      @NonNull TextInputLayout storageDisplayNameInputLayout,
      @NonNull TextInputEditText storageLocation) {
    this.rootView = rootView;
    this.storageDisplayName = storageDisplayName;
    this.storageDisplayNameInputLayout = storageDisplayNameInputLayout;
    this.storageLocation = storageLocation;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentStoragePreferenceDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentStoragePreferenceDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_storage_preference_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentStoragePreferenceDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.storageDisplayName;
      TextInputEditText storageDisplayName = rootView.findViewById(id);
      if (storageDisplayName == null) {
        break missingId;
      }

      id = R.id.storageDisplayNameInputLayout;
      TextInputLayout storageDisplayNameInputLayout = rootView.findViewById(id);
      if (storageDisplayNameInputLayout == null) {
        break missingId;
      }

      id = R.id.storageLocation;
      TextInputEditText storageLocation = rootView.findViewById(id);
      if (storageLocation == null) {
        break missingId;
      }

      return new FragmentStoragePreferenceDialogBinding((LinearLayout) rootView, storageDisplayName,
          storageDisplayNameInputLayout, storageLocation);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
