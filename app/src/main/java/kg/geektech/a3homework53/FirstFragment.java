package kg.geektech.a3homework53;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    private RecyclerView recyclerAddress;
    private ArrayList<String> addressList;
    private AddressAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerAddress = view.findViewById(R.id.recycler_address);
        addressList = new ArrayList<>();
        addressList.add("Grove Street, 81a, 24");
        addressList.add("Grove Street, 81a, 24");
        addressList.add("Grove Street, 81a, 24");
        addressList.add("Grove Street, 81a, 24");
        addressList.add("Grove Street, 81a, 24");
        addressList.add("Grove Street, 81a, 24");
        addressList.add("Grove Street, 81a, 24");
        addressList.add("Grove Street, 81a, 24");
        addressList.add("Grove Street, 81a, 24");
        addressList.add("Grove Street, 81a, 24");
        addressList.add("Grove Street, 81a, 24");
        addressList.add("Grove Street, 81a, 24");
        addressList.add("Grove Street, 81a, 24");
        addressList.add("Grove Street, 81a, 24");
        addressList.add("Grove Street, 81a, 24");
        addressList.add("Grove Street, 81a, 24");
        addressList.add("Grove Street, 81a, 24");
        addressList.add("Grove Street, 81a, 24");
        adapter = new AddressAdapter(addressList);
        recyclerAddress.setAdapter(adapter);
    }
}