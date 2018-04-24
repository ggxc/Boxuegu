package cn.edu.gdmec.android.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.ImageView;

import cn.edu.gdmec.android.Bean.ExercisesBean;
import cn.edu.gdmec.android.R;

public class ExercisesDetailListItemAdapter extends BaseAdapter {

    private List<ExercisesBean> objects = new ArrayList<ExercisesBean>();
    private ArrayList<String> selectedPosition  = new ArrayList<String>();

    private Context context;
    private LayoutInflater layoutInflater;


    public ExercisesDetailListItemAdapter(Context context) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return objects.size();
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.exercises_detail_list_item, null);
            convertView.setTag(new ViewHolder(convertView));
        }
        initializeViews((T)getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(T object, ViewHolder holder) {
        //TODO implement
    }

    protected class ViewHolder {
        private TextView tvSubject;
    private ImageView ivA;
    private TextView tvA;
    private ImageView ivB;
    private TextView tvB;
    private ImageView ivC;
    private TextView tvC;
    private ImageView ivD;
    private TextView tvD;

        public ViewHolder(View view) {
            tvSubject = (TextView) view.findViewById(R.id.tv_subject);
            ivA = (ImageView) view.findViewById(R.id.iv_a);
            tvA = (TextView) view.findViewById(R.id.tv_a);
            ivB = (ImageView) view.findViewById(R.id.iv_b);
            tvB = (TextView) view.findViewById(R.id.tv_b);
            ivC = (ImageView) view.findViewById(R.id.iv_c);
            tvC = (TextView) view.findViewById(R.id.tv_c);
            ivD = (ImageView) view.findViewById(R.id.iv_d);
            tvD = (TextView) view.findViewById(R.id.tv_d);
        }
    }
}
