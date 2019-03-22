package chung.fpoly.vn.foododer.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;


import chung.fpoly.vn.foododer.R;
import chung.fpoly.vn.foododer.model.Category;
import chung.fpoly.vn.foododer.viewholder.CategoryViewHolder;



public class CategorysFragment extends Fragment {

    private RecyclerView recyclerView;
    private FirebaseRecyclerAdapter<Category, CategoryViewHolder> adapter;
    private LinearLayoutManager linearLayoutManager;
    private FirebaseDatabase database;
    private DatabaseReference ref;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_categorys, container, false);


        recyclerView = view.findViewById(R.id.re_categorys);
        linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        FirebaseApp.initializeApp(getContext());
        
        loadlist();
        
        return view;
    }

    private void loadlist() {


        database = FirebaseDatabase.getInstance();
        ref = database.getReference().child("Categorys");

        Log.e("Tag","Name "+ref);

        FirebaseRecyclerOptions<Category> options = new FirebaseRecyclerOptions.Builder<Category>().setQuery(ref,Category.class).build();
        adapter = new FirebaseRecyclerAdapter<Category, CategoryViewHolder>(options) {
            @NonNull
            @Override
            public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
                View view =LayoutInflater.from(getContext()).inflate(R.layout.item_category,viewGroup,false);
                return new CategoryViewHolder(view);
            }

            @Override
            protected void onBindViewHolder(@NonNull CategoryViewHolder holder, int position, @NonNull Category model) {
                holder.textView_item1.setText(model.getName());
                Log.e("Tag","Name "+model.getName());
                Picasso.with(getContext()).load(model.getImage())
                        .into(holder.imageView_item1);


            }
        };

        recyclerView.setAdapter(adapter);

    }

}
