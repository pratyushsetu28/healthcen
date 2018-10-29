package developer.ism.iit.healthcen.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import developer.ism.iit.healthcen.R;
import developer.ism.iit.healthcen.models.Doctor;

public class DoctorDetailActivity extends AppCompatActivity {
    Doctor doctor;
    @BindView(R.id.ivDoctorBackdrop)
    ImageView ivDoctorBackdrop;
    @BindView(R.id.tvOverview)
    TextView tvOverview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_detail);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "appointment done", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            doctor = (Doctor) extras.getSerializable("DOCTOR");
            this.setTitle(doctor.getTitle());
            tvOverview.setText(doctor.getSpeciality());
            Picasso.with(this)
                    .load(doctor.getbackdropPath())
                    .into(ivDoctorBackdrop);
        }
    }
}
