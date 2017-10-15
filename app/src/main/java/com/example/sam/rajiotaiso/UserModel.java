package com.example.sam.rajiotaiso;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by sam on 15/10/17.
 */

public class UserModel implements Parcelable {

    private String username;
    private String langage;
    private String ecole;

    public UserModel(String username, String langage, String ecole) {
        this.username = username;
        this.langage = langage;
        this.ecole = ecole;
    }

    public String getUsername() {
        return username;
    }

    public String getLangage() {
        return langage;
    }

    public String getEcole() {
        return ecole;
    }

    protected UserModel(Parcel in) {
        username = in.readString();
        langage = in.readString();
        ecole = in.readString();
    }

    public static final Creator<UserModel> CREATOR = new Creator<UserModel>() {
        @Override
        public UserModel createFromParcel(Parcel in) {
            return new UserModel(in);
        }

        @Override
        public UserModel[] newArray(int size) {
            return new UserModel[size];
        }
    };



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeString(langage);
        dest.writeString(ecole);
    }
}
