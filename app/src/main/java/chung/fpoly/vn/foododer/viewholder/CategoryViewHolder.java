package chung.fpoly.vn.foododer.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import chung.fpoly.vn.foododer.R;

public class CategoryViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView_item1;
    public TextView textView_item1;
    public LinearLayout linearLayout_item1;

    public CategoryViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView_item1 = itemView.findViewById(R.id.image_item1);
        textView_item1 = itemView.findViewById(R.id.txt_item1);
        linearLayout_item1 = itemView.findViewById(R.id.ll_category);
    }
}
