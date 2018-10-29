package developer.ism.iit.healthcen.models;

import java.io.Serializable;

public class Doctor implements Serializable {
    String id;
    String title;
    String speciality;
    String timeavailable;
    String posterPath;
    String backdropPath;


    public Doctor(String id, String title, String speciality, String timeavailable, String posterPath,String backdropPath) {
        this.id = id;
        this.title = title;
        this.speciality = speciality;
        this.timeavailable = timeavailable;
        this.posterPath = posterPath;
        this.backdropPath=backdropPath;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getTimeavailable() {
        return timeavailable;
    }

    public void setTimeavailable(String timeavailable) {
        this.timeavailable = timeavailable;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }
    public String getbackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }
}
