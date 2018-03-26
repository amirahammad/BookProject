package tasks.com.bookproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class ItemDetailsActivity extends AppCompatActivity {
    private TextView titleTv, subjectTv;
    private SeekBar seekBar;
    private ImageView backButton ;
    int MAX = 50;
    int MIN = 20;
    int PLUS = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);
        titleTv = (TextView) findViewById(R.id.titleTv_Item);
        subjectTv = (TextView) findViewById(R.id.subjectTv_Item);
        seekBar = (SeekBar) findViewById(R.id.seekBar);

        backButton = (ImageView)findViewById(R.id.backBtn)  ;
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        int title = getIntent().getExtras().getInt("title");
        String subject = getIntent().getExtras().getString("subject");

        titleTv.setText(title);
        subjectTv.setText(subject);
        seekBar.setMax((MAX - MIN) / PLUS);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                subjectTv.setTextSize(MIN + (progress * PLUS));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
