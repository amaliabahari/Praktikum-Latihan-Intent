package com.example.myintentapp

import android.os.Parcel
import android.os.Parcelable

data class Person () : Parcelable {
    val name: String?
        get() {
            TODO()
        }
    val age: Int?
        get() {
            TODO()
        }
    val email: String?
        get() {
            TODO()
        }
    val city: String?
        get() {
            TODO()
        }

    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Person> {
        override fun createFromParcel(parcel: Parcel): Person {
            return Person(parcel)
        }

        override fun newArray(size: Int): Array<Person?> {
            return arrayOfNulls(size)
        }
    }
}

