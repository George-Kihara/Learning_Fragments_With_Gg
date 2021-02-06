package com.ninja.learn.fragments_with_gg.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ninja.learn.fragments_with_gg.MainActivity;
import com.ninja.learn.fragments_with_gg.R;

/**
 * 2nd fragment
 */
public class FragmentB extends Fragment {

    private static final String TAG = "FragmentB";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b, container, false);

        Button button = (Button) view.findViewById(R.id.btnGoToA);

        // set on-click listener
        button.setOnClickListener( v -> goBackToFragmentA());

        return view;
    }

    /**
     * go back to fragment A
     */
    private void goBackToFragmentA() {
        try {
            NavHostFragment.findNavController(this).navigate(R.id.action_fragmentB_to_fragmentA);
        } catch (Exception e) {
            Log.e(TAG, "goBackToFragmentA: ", e);
        }
    }
}