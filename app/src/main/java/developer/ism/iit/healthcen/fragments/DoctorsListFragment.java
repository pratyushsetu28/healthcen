package developer.ism.iit.healthcen.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import developer.ism.iit.healthcen.R;
import developer.ism.iit.healthcen.adaptors.DoctorRecyclerViewAdapter;
import developer.ism.iit.healthcen.models.Doctor;

/**
 * A simple {@link Fragment} subclass.
 */
public class DoctorsListFragment extends Fragment {

    @BindView(R.id.rvdoctors)
    RecyclerView rvdoctors;
    Unbinder unbinder;
    public List<Doctor> doctors;

    public DoctorsListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_doctors_list, container, false);
        unbinder = ButterKnife.bind(this, view);

        initializeData();
        LinearLayoutManager llm = new LinearLayoutManager(this.getContext());
        rvdoctors.setHasFixedSize(true);
        rvdoctors.setLayoutManager(llm);

        DoctorRecyclerViewAdapter adapter= new DoctorRecyclerViewAdapter(getContext(), doctors);
        rvdoctors.setAdapter(adapter);

        return view;
    }

    public void initializeData() {

        doctors = new ArrayList<>();
        doctors.add(new Doctor("1", "Dr Vijay Sharma", "MEDICINE", "Thursday 6pm-7pm", "https://i0.wp.com/indianewengland.com/wp-content/uploads/2016/09/Doctor-Indian-Dreamtime-e1472735288122.jpg?fit=500%2C497","https://cdn.shopify.com/s/files/1/0040/8432/products/GetWellSoon_ChariMoss3.jpg?v=1409167493"));
        doctors.add(new Doctor("2", "Dr Arun", "DENTAL", "Monday and Thursday 5pm-6pm", "https://i0.wp.com/indianewengland.com/wp-content/uploads/2016/09/Doctor-Indian-Dreamtime-e1472735288122.jpg?fit=500%2C497","https://cdn.shopify.com/s/files/1/0040/8432/products/GetWellSoon_ChariMoss3.jpg?v=1409167493"));
        doctors.add(new Doctor("3", "Dr Viharma", "MEDICINE", "Thursday 6pm-7pm", "https://i0.wp.com/indianewengland.com/wp-content/uploads/2016/09/Doctor-Indian-Dreamtime-e1472735288122.jpg?fit=500%2C497","https://cdn.shopify.com/s/files/1/0040/8432/products/GetWellSoon_ChariMoss3.jpg?v=1409167493"));
        doctors.add(new Doctor("4", "Dr Sharma", "MEDICINE", "Thursday 6pm-7pm", "https://i0.wp.com/indianewengland.com/wp-content/uploads/2016/09/Doctor-Indian-Dreamtime-e1472735288122.jpg?fit=500%2C497","https://cdn.shopify.com/s/files/1/0040/8432/products/GetWellSoon_ChariMoss3.jpg?v=1409167493"));
        doctors.add(new Doctor("5", "Dr Vma", "MEDICINE", "Thursday 6pm-7pm", "https://i0.wp.com/indianewengland.com/wp-content/uploads/2016/09/Doctor-Indian-Dreamtime-e1472735288122.jpg?fit=500%2C497","https://cdn.shopify.com/s/files/1/0040/8432/products/GetWellSoon_ChariMoss3.jpg?v=1409167493"));
        doctors.add(new Doctor("6", "Dr y Sharma", "MEDICINE", "Thursday 6pm-7pm", "https://i0.wp.com/indianewengland.com/wp-content/uploads/2016/09/Doctor-Indian-Dreamtime-e1472735288122.jpg?fit=500%2C497","https://cdn.shopify.com/s/files/1/0040/8432/products/GetWellSoon_ChariMoss3.jpg?v=1409167493"));
        doctors.add(new Doctor("7", "Dr jay Sharma", "MEDICINE", "Thursday 6pm-7pm", "https://i0.wp.com/indianewengland.com/wp-content/uploads/2016/09/Doctor-Indian-Dreamtime-e1472735288122.jpg?fit=500%2C497","https://cdn.shopify.com/s/files/1/0040/8432/products/GetWellSoon_ChariMoss3.jpg?v=1409167493"));
        doctors.add(new Doctor("8", "Dr V Sharma", "MEDICINE", "Thursday 6pm-7pm", "https://i0.wp.com/indianewengland.com/wp-content/uploads/2016/09/Doctor-Indian-Dreamtime-e1472735288122.jpg?fit=500%2C497","https://cdn.shopify.com/s/files/1/0040/8432/products/GetWellSoon_ChariMoss3.jpg?v=1409167493"));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
