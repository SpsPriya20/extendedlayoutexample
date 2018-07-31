package examplelayout.priya.com.examplelayout.adapter;

import android.app.Activity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import examplelayout.priya.com.examplelayout.R;

public class NumberAdapter extends BaseAdapter{
    private Activity activity;
    private String[]numbers;
    public NumberAdapter(Activity activity, String[]numbers)
    {
        this.activity=activity;
        this.numbers=numbers;

    }

    @Override
    public int getCount() {
        return numbers.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(activity).inflate(R.layout.liat_item_number,parent,false);
        TextView textView = view.findViewById(R.id.number);
        textView.setText(numbers[position]);

        return view
                ;
    }
}
