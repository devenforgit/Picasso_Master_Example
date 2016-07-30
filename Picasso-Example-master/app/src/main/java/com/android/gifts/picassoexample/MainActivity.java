package com.android.gifts.picassoexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hacer que un objeto de la recyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.user_recycler_view);
        //  Adjuntar un controlador de distribución a la recyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Instantiate the adapter with the data -list of users- from getData method
        UserRecyclerViewAdapter recyclerViewAdapter = new UserRecyclerViewAdapter(this, getData());

        // Attach the recyclerView with the adapter
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    public List<User> getData() {
        List<User> users = new ArrayList<>();

        // Añadir 5 usuarios normales con el URL de trabajo
        for (int i = 0; i < 5; i++) {
            users.add(new User("Normal User", "http://goo.gl/SvTNsu"));
        }

        //  Añadir 2 usuarios con direcciones URL mal
        users.add(new User("Not Found User", "http://goo.gl/p7FbBB"));
        users.add(new User("Not Found User", "http://goo.gl/p7FbBB"));

        //     Añadir más usuarios con la URL de trabajo
        for (int i = 0; i < 4; i++) {
            users.add(new User("Normal User", "http://goo.gl/SvTNsu"));
        }

        return users;
    }
}
