package com.example.sam.rajiotaiso;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by sam on 15/10/17.
 */

public class UserModel implements Parcelable {

    private String username;

    public UserModel(String username) {
        this.username = username;
    }

    protected UserModel(Parcel in) {
        username = in.readString();
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

    public String getUsername() {
        return username;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(username);
    }


}
