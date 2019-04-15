package chung.fpoly.vn.foododer.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

import chung.fpoly.vn.foododer.R;
import chung.fpoly.vn.foododer.model.Category;
import chung.fpoly.vn.foododer.ui.AllProductActivity;
import chung.fpoly.vn.foododer.viewholder.CategoryViewHolder;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryViewHolder> {

    private Context context;
    private List<Category> list;

    public CategoryAdapter(Context context, List<Category> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_category,null);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, final int i) {
        holder.textView_item1.setText(list.get(i).getName());

        Picasso.with(context).load(list.get(i).getImage())
                .into(holder.imageView_item1);
//        holder.linearLayout_item1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, ""+i, Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(context, AllProductActivity.class);
//                context.startActivity(intent);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        if (list == null) return 0;
        return list.size();
    }
}
