package ru.kozhukhov.sergey.activity;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestModel implements Parcelable {

    private String string_random_first;
    private String string_random_second;

    private List<Character> list_random_first;
    private List<Integer> list_random_second;

    private byte size;

    protected TestModel(Parcel in) {
        string_random_first = in.readString();
        string_random_second = in.readString();
        list_random_first = new ArrayList<>();
        list_random_second = new ArrayList<>();
        in.readList(list_random_first, getClass().getClassLoader());
        in.readList(list_random_second, getClass().getClassLoader());
    }


    public TestModel(String dict_lang)
    {
        size = 10;
        Random random = new Random();

        StringBuilder string_random_first = new StringBuilder();
        StringBuilder string_random_second = new StringBuilder();

        list_random_first = new ArrayList<>(size);
        list_random_second = new ArrayList<>(size);

        for (int i = 0; i < 10; i++)
        {
            string_random_first.append(dict_lang.charAt(random.nextInt(dict_lang.length())));
            string_random_second.append(dict_lang.charAt(random.nextInt(dict_lang.length())));
            list_random_first.add(dict_lang.charAt(random.nextInt(dict_lang.length())));
            list_random_second.add(random.nextInt(9));
        }
        this.string_random_first = string_random_first.toString();
        this.string_random_second = string_random_second.toString();
    }

    public static final Creator<TestModel> CREATOR = new Creator<TestModel>() {
        @Override
        public TestModel createFromParcel(Parcel in) {
            return new TestModel(in);
        }

        @Override
        public TestModel[] newArray(int size) {
            return new TestModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(string_random_first);
        dest.writeString(string_random_second);
        dest.writeList(list_random_first);
        dest.writeList(list_random_second);
    }

    @Override
    public String toString() {

        StringBuilder list_random_first = new StringBuilder();
        StringBuilder list_random_second = new StringBuilder();

        for (int i=0; i<size;i++)
        {
            list_random_first.append(this.list_random_first.get(i));
            list_random_second.append(this.list_random_second.get(i));
        }


        return "TestModel{" + "\n" +
                "string_random_first = " + this.string_random_first + ",\n" +
                "string_random_second = " + this.string_random_second + ",\n" +
                "list_random_first = " + list_random_first.toString() + ",\n"+
                "list_random_second = " + list_random_second.toString() + "\n" +
                '}';
    }

    public String get_string_random_first() { return string_random_first;
    }

    public void set_string_random_first(String string_random_first) {
        this.string_random_first = string_random_first;
    }

    public String get_string_random_second() {
        return string_random_second;
    }

    public void set_string_random_second(String string_random_second) {
        this.string_random_second = string_random_second;
    }


    public List<Character> get_list_random_first() {
        return list_random_first;
    }

    public List<Integer> get_list_random_second() {
        return list_random_second;
    }

}
