package developer.ism.iit.healthcen.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import developer.ism.iit.healthcen.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyAppointmentFragment extends Fragment {


    public MyAppointmentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_appointment2, container, false);
    }

}
