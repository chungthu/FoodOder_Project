package chung.fpoly.vn.foododer.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import chung.fpoly.vn.foododer.R;
import chung.fpoly.vn.foododer.adapter.CategoryAdapter;
import chung.fpoly.vn.foododer.model.Category;



public class CategorysFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<Category> list;
    private CategoryAdapter adapter;
    private LinearLayoutManager linearLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_categorys, container, false);

        recyclerView = view.findViewById(R.id.re_categorys);
        linearLayoutManager = new LinearLayoutManager(getContext());

        list = new ArrayList<>();
        list.add(new Category("Chung",R.drawable.pizza));
        list.add(new Category("Chung",R.drawable.mainactivitys));
        list.add(new Category("Chung",R.drawable.hello));
        adapter = new CategoryAdapter(getContext(),list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);

        Log.e("Tag", "List" + list.size());
        return view;
    }

}
