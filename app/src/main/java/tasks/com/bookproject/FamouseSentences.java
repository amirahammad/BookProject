package tasks.com.bookproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamouseSentences extends AppCompatActivity {
    ImageView backButton ;
    ListView listFamousSentences ;
    ArrayList<String> arraySentences ;
    ArrayAdapter adapter ;
    String[]arrayDialog ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famouse_sentences);
        backButton = (ImageView)findViewById(R.id.backBtn)  ;
        listFamousSentences = (ListView)findViewById(R.id.listView) ;

        arrayDialog = new String[]{getString(R.string.dialog0),getString(R.string.dialog1),getString(R.string.dialog2)
                ,getString(R.string.dialog3),getString(R.string.dialog4),getString(R.string.dialog5)
                ,getString(R.string.dialog6),getString(R.string.dialog7),getString(R.string.dialog8),getString(R.string.dialog9),getString(R.string.dialog10)
                ,getString(R.string.dialog11)} ;

        arraySentences = new ArrayList<String>() ;

        arraySentences.add(getString(R.string.sentence1)) ;
        arraySentences.add(getString(R.string.sentence2)) ;
        arraySentences.add(getString(R.string.sentence3)) ;
        arraySentences.add(getString(R.string.sentence4)) ;
        arraySentences.add(getString(R.string.sentence5)) ;
        arraySentences.add(getString(R.string.sentence6)) ;
        arraySentences.add(getString(R.string.sentence7)) ;
        arraySentences.add(getString(R.string.sentence8)) ;
        arraySentences.add(getString(R.string.sentence9)) ;
        arraySentences.add(getString(R.string.sentence10)) ;
        arraySentences.add(getString(R.string.sentence11)) ;
        arraySentences.add(getString(R.string.sentence12)) ;

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arraySentences) ;
        listFamousSentences.setAdapter(adapter);
        listFamousSentences.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                ViewDialog alert = new ViewDialog();
                alert.showDialog(FamouseSentences.this, arrayDialog[position] , arraySentences.get(position));


            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}
