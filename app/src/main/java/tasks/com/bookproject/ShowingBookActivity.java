package tasks.com.bookproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class ShowingBookActivity extends AppCompatActivity {
    ListView listView ;
    ArrayList<DataActivity> arraylist = new ArrayList<>();
    ListAdapter adapter;
    ImageView backButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showing_book);
        backButton = (ImageView)findViewById(R.id.backBtn)  ;
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        listView = (ListView) findViewById(R.id.listView);

        String[] subject = {getString(R.string.subject1),getString(R.string.subject2),getString(R.string.subject3),getString(R.string.subject4),
                getString(R.string.subject5),getString(R.string.subject6),getString(R.string.subject7),getString(R.string.subject8)
                ,getString(R.string.subject9),getString(R.string.subject10),getString(R.string.subject11),getString(R.string.subject12)
                ,getString(R.string.subject13),getString(R.string.subject14),getString(R.string.subject15),getString(R.string.subject16)
                ,getString(R.string.subject17),getString(R.string.subject18),getString(R.string.subject19),getString(R.string.subject20)
                ,getString(R.string.subject21),getString(R.string.subject22),getString(R.string.subject23)
                ,getString(R.string.subject24),getString(R.string.subject25),getString(R.string.subject26),getString(R.string.subject27)
                ,getString(R.string.subject28),getString(R.string.subject29),getString(R.string.subject30)};

        Integer[] chapter = {R.string.chapter1,R.string.chapter2,R.string.chapter3,R.string.chapter4,R.string.chapter5,R.string.chapter6,
                R.string.chapter7,R.string.chapter8,R.string.chapter9,R.string.chapter10,R.string.chapter11,R.string.chapter12,R.string.chapter13
                ,R.string.chapter14,R.string.chapter15,R.string.chapter16,R.string.chapter17,R.string.chapter18,R.string.chapter19,R.string.chapter20,
                R.string.chapter21,R.string.chapter22,R.string.chapter23,R.string.chapter24
                ,R.string.chapter25,R.string.chapter26,R.string.chapter27,R.string.chapter28,R.string.chapter29,R.string.chapter30};


        Integer[] title = {R.string.title1,R.string.title2,R.string.title3,R.string.title4,R.string.title5,
                R.string.title6,R.string.title7,R.string.title8,R.string.title9,R.string.title10,R.string.title11,
                R.string.title12,R.string.title13,R.string.title14,R.string.title15,
                R.string.title16,R.string.title17,R.string.title18,R.string.title19,R.string.title20,
                R.string.title21,R.string.title22,R.string.title23,R.string.title24,R.string.title25,
                R.string.title26,R.string.title27,R.string.title28,R.string.title29,R.string.title30};

        for (int i = 0; i < chapter.length; i++) {
            DataActivity abboudi = new DataActivity(title[i], chapter[i],subject[i]);
            arraylist.add(abboudi);
        }

        adapter = new ListAdapter(this,arraylist) ;
        listView.setAdapter(adapter);

    }
}
