package tasks.com.bookproject;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Freeware Sys on 26/03/2018.
 */

public class ListAdapter extends BaseAdapter {
    LayoutInflater inflater;
    private List<DataActivity> Datalist = null;
    private ArrayList<DataActivity> arraylist;

    Context context;

    public ListAdapter(Context context, List<DataActivity> openSite) {
        this.context = context;
        this.Datalist = openSite;
        inflater = LayoutInflater.from(context);
        this.arraylist = new ArrayList<>();
        this.arraylist.addAll(openSite);

    }

    @Override
    public int getCount() {
        return Datalist.size();
    }

    @Override
    public Object getItem(int position) {
        return Datalist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, final View view, ViewGroup parent) {
        final View Item = inflater.inflate(R.layout.item_listview, null, true);

        TextView txtTitle = (TextView) Item.findViewById(R.id.titleTv);
        TextView txtPart = (TextView) Item.findViewById(R.id.chapterTv);
        final ImageView heart = (ImageView)Item.findViewById(R.id.heart) ;

        txtTitle.setText(Datalist.get(position).getTitle());
        txtPart.setText(Datalist.get(position).getChapterNum());




        Item.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(context, ItemDetailsActivity.class);
                i.putExtra("title", Datalist.get(position).getTitle());
                i.putExtra("subject", Datalist.get(position).getSubject());
                context.startActivity(i);
            }
        });

        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                heart.setImageResource(R.drawable.heart_fill);
                Log.i("itemmmmmmmmmmmmm", String.valueOf(Item)) ;
            }
        });

        return Item;


    };
}
