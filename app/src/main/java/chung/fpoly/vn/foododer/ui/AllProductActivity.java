package chung.fpoly.vn.foododer.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import chung.fpoly.vn.foododer.R;
import chung.fpoly.vn.foododer.adapter.ProductAdapter;
import chung.fpoly.vn.foododer.model.Product;

public class AllProductActivity extends AppCompatActivity {

    private GridView gridView;
    private List<Product> list;
    private ProductAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_product);
        init();

        list.add(new Product("Pizza",R.drawable.pizza,12,17));
        list.add(new Product("Pizza",R.drawable.pizza,12,17));
        list.add(new Product("Pizza",R.drawable.pizza,12,17));
        list.add(new Product("Pizza",R.drawable.pizza,12,17));
        list.add(new Product("Pizza",R.drawable.pizza,12,17));
        gridView.setAdapter(adapter);

    }

    public void init(){
        gridView = findViewById(R.id.gv_all);
        list = new ArrayList<>();
        adapter = new ProductAdapter(this, (ArrayList<Product>) list);
    }
}
