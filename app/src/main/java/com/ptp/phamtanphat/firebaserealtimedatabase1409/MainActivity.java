package com.ptp.phamtanphat.firebaserealtimedatabase1409;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference mDatabase;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.textview);
        //Ket noi voi database firebase
        mDatabase = FirebaseDatabase.getInstance().getReference();
//        // Dang 1 : Kieu du lieu String
//        mDatabase.child("Lop 10").child("Lop 10A").setValue("45 Dua");
//        // Dang 2 : Kieu du lieu dang object
//        Dongvat dongvat = new Dongvat("Con cho",4 );
//        mDatabase.child("Dong vat").setValue(dongvat);
//        //Dang 3 : Kieu du lieu Map
//        Map<String , String> mapxe = new HashMap<>();
//        mapxe.put("Xe hoi","4 banh");
//        mapxe.put("Xe lua","N banh");
//        mapxe.put("Xe dap","2 banh");
//
//        mDatabase.child("Phuong Tien").setValue(mapxe);
//        //Phat sinh ID tu dong khi them du lieu tranh su trung lap
//        mDatabase.child("Lop 10").push().child("Lop 10A").setValue("45 dua",Complete);
        GetData();

    }

    private void GetData() {
//        mDatabase.child("Phuong Tien").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                Dongvat dongvat = dataSnapshot.getValue(Dongvat.class);
//                Toast.makeText(MainActivity.this, dongvat.getTen(), Toast.LENGTH_SHORT).show();
//
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
        mDatabase.child("Dong vat").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
               Dongvat dongvat = dataSnapshot.getValue(Dongvat.class);
                Toast.makeText(MainActivity.this, dongvat.getTen(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
//    public DatabaseReference.CompletionListener Complete = new DatabaseReference.CompletionListener() {
//        @Override
//        public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
//            if (databaseError == null){
//                Toast.makeText(MainActivity.this, "Thanh cong", Toast.LENGTH_SHORT).show();
//            }else {
//                Toast.makeText(MainActivity.this, "That bai", Toast.LENGTH_SHORT).show();
//            }
//        }
//    };

}
