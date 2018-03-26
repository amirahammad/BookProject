package tasks.com.bookproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AboutAfekiActivity extends AppCompatActivity {
    ImageView backButton  , moreButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_afeki);
        ImageView backButton  , moreButton;



            moreButton = (ImageView)findViewById(R.id.more_books) ;
            backButton = (ImageView)findViewById(R.id.backBtn)  ;
            backButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();
                }
            });
            moreButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(AboutAfekiActivity.this);
                    builder1.setMessage(" أقوى 15 كتاب للدكتور ابراهيم الفقي في التنمية البشرية PDF للتحميل و القراءة اونلاين" );
                    builder1.setCancelable(true);

                    builder1.setPositiveButton(
                            "ذهاب للموقع",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.maktbah.com/%D9%83%D8%AA%D8%A7%D8%A8-%D9%84%D9%84%D8%AF%D9%83%D8%AA%D9%88%D8%B1-%D8%A7%D8%A8%D8%B1%D8%A7%D9%87%D9%8A%D9%85-%D8%A7%D9%84%D9%81%D9%82%D9%8A-%D9%81%D9%8A-%D8%A7%D9%84%D8%AA%D9%86%D9%85%D9%8A%D8%A9/")));
                                }
                            });
                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
            });
    }
}
