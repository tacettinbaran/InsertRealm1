package com.example.insertrealm1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defineRealm();
        addTable();
        showRealmTableResults();
    }

    void defineRealm() {
        realm = Realm.getDefaultInstance(); // opens "myrealm.realm"
    }

    public void addTable() {

        realm.beginTransaction();

        PersonsTable personsTable = realm.createObject(PersonsTable.class);

        personsTable.setPersonName("tacettin");
        personsTable.setPersonSurname("baran");
        personsTable.setPersonAge(30);
        personsTable.setPersonSalary(12000);

        realm.commitTransaction();
    }

    public void showRealmTableResults() {

        realm.beginTransaction();

        RealmResults<PersonsTable> results = realm.where(PersonsTable.class).findAll();

        for (PersonsTable k : results) {

            Log.i("result ", k.toString());

        }

        realm.commitTransaction();
    }

}