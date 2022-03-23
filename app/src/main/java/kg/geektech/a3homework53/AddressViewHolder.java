package kg.geektech.a3homework53;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AddressViewHolder extends RecyclerView.ViewHolder {
    TextView addressTv;

    public AddressViewHolder(@NonNull View itemView) {
        super(itemView);
        addressTv = itemView.findViewById(R.id.address_tv);
    }

    public void bind(String address) {
        addressTv.setText(address);
    }
}
