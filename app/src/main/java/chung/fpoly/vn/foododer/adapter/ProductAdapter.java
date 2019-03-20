package chung.fpoly.vn.foododer.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import chung.fpoly.vn.foododer.R;
import chung.fpoly.vn.foododer.model.Product;

public class ProductAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Product> list;

    public ProductAdapter(Context context, ArrayList<Product> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        TextView name, pricel, pricem;
        ImageView imageView;
        CardView cardView;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        View row = view;
        ViewHolder holder = new ViewHolder();

        if (row == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.item_all,null);

            holder.name = row.findViewById(R.id.txt1_item2);
            holder.pricel = row.findViewById(R.id.txt3_item2);
            holder.pricem = row.findViewById(R.id.txt4_item2);
            holder.imageView = row.findViewById(R.id.image_item2);
            holder.cardView = row.findViewById(R.id.ll_item2);

            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, ""+list.get(position), Toast.LENGTH_SHORT).show();
                }
            });

        }
        else {
            holder = (ViewHolder) row.getTag();
        }


//        holder.name.setText(product.getName());
//        holder.imageView.setImageResource(product.getImage());
//        holder.pricem.setText(product.getPriceM());
//        holder.pricel.setText(product.getPriceL());
        return row;
    }
}
