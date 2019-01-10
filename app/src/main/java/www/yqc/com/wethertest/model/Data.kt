package www.yqc.com.wethertest.model

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by Administrator on 2019/1/9.
 */
class Data() : Parcelable {
    var date: String? = null
    var temp: String? = null
    var detail: String? = null
    var week: String? = null

    constructor(parcel: Parcel) : this() {
        date = parcel.readString()
        temp = parcel.readString()
        detail = parcel.readString()
        week = parcel.readString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(date)
        parcel.writeString(temp)
        parcel.writeString(detail)
        parcel.writeString(week)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Data> {
        override fun createFromParcel(parcel: Parcel): Data {
            return Data(parcel)
        }

        override fun newArray(size: Int): Array<Data?> {
            return arrayOfNulls(size)
        }
    }
}