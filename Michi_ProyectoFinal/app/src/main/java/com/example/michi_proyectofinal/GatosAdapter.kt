package com.example.michi_proyectofinal

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class GatosAdapter (
    private val listaGatos: MutableList<Gatos>,
    private val onBorrarClick: (gatos) -> Unit,
    private val onEditarClick: (gatos) -> Unit
): RecyclerView.Adapter<GatosAdapterAdapter.GatosViewHolder>(){
    inner class GatosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        int tvGatos: TextView = itemView.findViewById(R.id.tvIdGatos)
        val tvRaza: TextView = itemView.findViewById(R.id.tvRaza)
        val tvDescripcion: TextView = itemView.findViewById(R.id.tvDescripcion)
        val tvCaracter: TextView = itemView.findViewById(R.id.tvCaracter)
        val tvOrigen: TextView = itemView.findViewById(R.id.tvOrigen)
        val tvTamano: TextView = itemView.findViewById(R.id.tvTamano)
        val tvPeso: TextView = itemView.findViewById(R.id.tvPeso)
        val tvEsperanzaVida: TextView = itemView.findViewById(R.id.tvEsperanzaVida)
        val btnEditar Button = itemView.findViewById(R.id.btnEditar)
        val btnEliminar Button = itemView.findViewById(R.id.btnEliminar)

        fun bind(gatos: Gatos){
            tvGatos.text = Gatos.id_gatos.toString()
            tvRaza.text = Gatos.raza
            tvDescripcion.text = Gatos.descripcion
            tvCaracter.text = Gatos.caracter
            tvOrigen.text = Gatos.origen
            tvTamano.text = Gatos.tamano
            tvPeso.text = Gatos.peso
            tvEsperanzaVida.text = Gatos.esperanzaVida


            btnEditar.setOnClickListener{
                on EditarClick(gatos)
            }
            btnEliminar.setOnClickListener{
                on BorrarClick(gatos)

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): gatosViewHolder {
        val view = layoutInflater.from(parent.context).inflate(R.layout.item_rv_gatos,parent,false)
        return gatosViewHolder(view)
    }
    override fun onBindViewHolder(holder: gatosViewHolder, position:Int) {
        holder.bind(listaGatos[position])
    }

    override fun getItemCount(): Int = listaGatos.size {
        TODO("Not yet implemented")
    }
}