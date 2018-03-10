package petapp.com.petapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by orimu on 03/03/2018.
 */

public class AdaptadorPersonajes extends RecyclerView.Adapter<AdaptadorPersonajes.ViewHolderPersonajes> {



    ArrayList<PersonajesVo> listaPersonajes;

    public AdaptadorPersonajes(ArrayList<PersonajesVo> listaPersonajes) {
        this.listaPersonajes = listaPersonajes;
    }
//recyclerviewadapter -- inicio
    @Override
    public AdaptadorPersonajes.ViewHolderPersonajes onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_gatos,null,false);
        return new ViewHolderPersonajes(view);
    }

    @Override
    public void onBindViewHolder(AdaptadorPersonajes.ViewHolderPersonajes holder, int position) {
        holder.etiNombre.setText(listaPersonajes.get(position).getNombre());
        holder.etiInformacion.setText(listaPersonajes.get(position).getInfo());
        holder.foto.setImageResource(listaPersonajes.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return listaPersonajes.size();
    }
    //recyclerviewadapter -- fin
    public class ViewHolderPersonajes extends RecyclerView.ViewHolder {

        TextView etiNombre,etiInformacion;
        ImageView foto;


        public ViewHolderPersonajes(View itemView) {
            super(itemView);
            etiNombre= (TextView) itemView.findViewById(R.id.idNombre);
            etiInformacion= (TextView) itemView.findViewById(R.id.idInfo);
            foto= (ImageView) itemView.findViewById(R.id.idImagen);


        }
    }
}
