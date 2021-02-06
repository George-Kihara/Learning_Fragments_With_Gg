package com.ninja.learn.fragments_with_gg.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavHostController;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ninja.learn.fragments_with_gg.R;

/**
 * 1st fragment
 */
public class FragmentA extends Fragment {

    private static final String TAG = "FragmentA";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        Button button  = (Button) view.findViewById(R.id.btnGoToB);

        // set on-click listener here
        button.setOnClickListener(v -> proceedToFragmentB());

        return view;
    }

    /**
     * move to fragment B
     */
    private void proceedToFragmentB() {
        try {
            NavHostFragment.findNavController(this).navigate(R.id.action_fragmentA_to_fragmentB);
        } catch (Exception e) {
            Log.e(TAG, "proceedToFragmentB: ", e);
        }
    }
}