// Generated by view binder compiler. Do not edit!
package com.cyclopos.cyclop_connect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.cyclopos.cyclop_connect.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListItemCategoryBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView listItemCategoryEmptyPlaceholder;

  @NonNull
  public final TextView listItemCategoryText;

  private ListItemCategoryBinding(@NonNull LinearLayout rootView,
      @NonNull TextView listItemCategoryEmptyPlaceholder, @NonNull TextView listItemCategoryText) {
    this.rootView = rootView;
    this.listItemCategoryEmptyPlaceholder = listItemCategoryEmptyPlaceholder;
    this.listItemCategoryText = listItemCategoryText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListItemCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListItemCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_item_category, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListItemCategoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.list_item_category_empty_placeholder;
      TextView listItemCategoryEmptyPlaceholder = rootView.findViewById(id);
      if (listItemCategoryEmptyPlaceholder == null) {
        break missingId;
      }

      id = R.id.list_item_category_text;
      TextView listItemCategoryText = rootView.findViewById(id);
      if (listItemCategoryText == null) {
        break missingId;
      }

      return new ListItemCategoryBinding((LinearLayout) rootView, listItemCategoryEmptyPlaceholder,
          listItemCategoryText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}