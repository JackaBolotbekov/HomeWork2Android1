package com.example.homework2android1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {

    private ImageView ivFullscreen;
    private TextView tvText;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        inagalize(view);
        getData();
    }

    private void inagalize(View view) {
        ivFullscreen = view.findViewById(R.id.iv_fullscreen);
        tvText = view.findViewById(R.id.tv_text);
    }

    private void getData() {
        Bundle data = getArguments();
        if (data != null){
            String text = data.getString(FirstFragment.TEXT_BUNDLE_KEY);
            Uri imageForGet = Uri.parse(data.getString(FirstFragment.IMAGE_BUNDLE_KEY));
            tvText.setText(text);
            ivFullscreen.setImageURI(imageForGet);
        }
    }
}