package com.example.tp233;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import com.example.tp233.ExampleAdapter;
public class MainActivity extends AppCompatActivity implements ExampleAdapter.onNoteListnner {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter rcAdap;
    private RecyclerView.LayoutManager Rmanger;
    private ArrayList<example> ex;
    public LinearLayout Linear;
    private ExampleAdapter.onNoteListnner listnner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Linear = (LinearLayout) findViewById(R.id.Linear);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ex = new ArrayList<>();

        ex.add(new example("chapati", "Very Delicious"));
        ex.add(new example("Crepe", "Yami!!!"));
        ex.add(new example("Pizza", "wawww"));


        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        Rmanger = new LinearLayoutManager(this);
        rcAdap = new ExampleAdapter(ex, this, this);

        recyclerView.setLayoutManager(Rmanger);
        recyclerView.setAdapter(rcAdap);

Log.d("question1","All list items look the same.");
Log.d("Question2","RecyclerView.ViewHolder");
Log.d("Question 3","View.onClickListener");
    }


    @Override
    public void onNoteClick(int position, View v) {

                Log.d("tag", "clicked");
                Intent i = new Intent(getApplicationContext(), Second.class);
                i.putExtra("rec", "recette Chapati:");
                    startActivity(i);

    }
 /*   switch(position){
            case 0:
                i.putExtra("11",R.drawable.chapatii);
                i.putExtra("1", "recette Chapati:");
             break;
            case 1:
                i.putExtra("22",R.drawable.crepe);
                i.putExtra("2","recette Crepe");
              break;
            default:
                i.putExtra("33",R.drawable.pizza);
                i.putExtra("3","recette Pizza");
               break;


    }
    */

}



