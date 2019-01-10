package www.yqc.com.wethertest.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2019/1/10.
 */

public class person implements Parcelable {
    private String name;
    private int age;

    protected person(Parcel in) {
        name = in.readString();
        age = in.readInt();
    }

    public static final Creator<person> CREATOR = new Creator<person>() {
        @Override
        public person createFromParcel(Parcel in) {
            return new person(in);
        }

        @Override
        public person[] newArray(int size) {
            return new person[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(age);
    }
}
