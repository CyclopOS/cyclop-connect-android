// Generated by view binder compiler. Do not edit!
package com.cyclopos.cyclop_connect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.cyclopos.cyclop_connect.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class WidgetRemoteCommandPluginDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ListView runCommandsDeviceList;

  private WidgetRemoteCommandPluginDialogBinding(@NonNull LinearLayout rootView,
      @NonNull ListView runCommandsDeviceList) {
    this.rootView = rootView;
    this.runCommandsDeviceList = runCommandsDeviceList;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static WidgetRemoteCommandPluginDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static WidgetRemoteCommandPluginDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.widget_remote_command_plugin_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static WidgetRemoteCommandPluginDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.run_commands_device_list;
      ListView runCommandsDeviceList = rootView.findViewById(id);
      if (runCommandsDeviceList == null) {
        break missingId;
      }

      return new WidgetRemoteCommandPluginDialogBinding((LinearLayout) rootView,
          runCommandsDeviceList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
