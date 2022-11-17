package com.example.saludate.ui.gallery.OTPVerification;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.saludate.R;

public class OTPVerification extends Fragment {

    private OTPVerificationViewModel mViewModel;

    public static OTPVerification newInstance() {
        return new OTPVerification();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_o_t_p_verification, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(OTPVerificationViewModel.class);
        // TODO: Use the ViewModel
    }

}