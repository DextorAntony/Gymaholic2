package technocrats.com.gymaholic;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ViewHolder extends RecyclerView.ViewHolder {

    View mView;


    public ViewHolder( View itemView) {
        super(itemView);

        mView = itemView;


    }

    public void  setDetails(String title, String image){
        TextView mTitleTv = mView.findViewById(R.id.rTitleTv);
        ImageView mImageTv = mView.findViewById(R.id.rImageView);

        mTitleTv.setText(title);
        Picasso.get().load(image).into(mImageTv);
    }
}
