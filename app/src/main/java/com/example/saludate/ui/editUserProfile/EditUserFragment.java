package com.example.saludate.ui.editUserProfile;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.saludate.R;
import com.example.saludate.databinding.FragmentEditUserBinding;
import com.example.saludate.databinding.FragmentGalleryBinding;
import com.example.saludate.ui.gallery.GalleryViewModel;

public class EditUserFragment extends Fragment {

    private FragmentEditUserBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        EditUserViewModel editUserViewModel =
                new ViewModelProvider(this).get(EditUserViewModel.class);

        binding = FragmentEditUserBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textEdit;
        editUserViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}