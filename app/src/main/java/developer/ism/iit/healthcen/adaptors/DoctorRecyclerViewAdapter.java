package developer.ism.iit.healthcen.adaptors;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import developer.ism.iit.healthcen.activities.DoctorDetailActivity;
import developer.ism.iit.healthcen.models.Doctor;

public class DoctorRecyclerViewAdapter extends RecyclerView.Adapter<DoctorRecyclerViewAdapter.ViewHolder> {

    List<Doctor> doctors;
    Context context;

    public DoctorRecyclerViewAdapter(Context context, List<Doctor> doctors) {
        this.doctors = doctors;
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doctor, parent, false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(ViewHolder Holder, int position) {
        Doctor doctor = doctors.get(position);
        Holder.tvTitle.setText(doctor.getTitle());
        Holder.tvSpeciality.setText(doctor.getSpeciality());
        Holder.submit.setOnClickListener(

                new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // callQuery("url")
                            }
        });
        Picasso.with(getContext())
                .load(doctor.getPosterPath())
                .into(Holder.ivDoctorsImage);
    }

    @Override
    public int getItemCount() {
        return doctors.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.ivDoctorsImage)
        ImageView ivDoctorsImage;
        @BindView(R.id.tvTitle)
        TextView tvTitle;
        @BindView(R.id.tvSpeciality)
        TextView tvSpeciality;
        @BindView(R.id.submitQueryl)
        Button submit;
        @BindView(R.id.cvMovie)
        CardView cvMovie;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Doctor doctor = doctors.get(getAdapterPosition());
            Intent intent = new Intent(getContext(), DoctorDetailActivity.class);
            intent.putExtra("DOCTOR", doctor);
            getContext().startActivity(intent);

        }
    }
}
