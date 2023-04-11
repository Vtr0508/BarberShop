package br.com.victor.barbershop.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.victor.barbershop.databinding.ServicosItemBinding
import br.com.victor.barbershop.model.Servicos

class ServicosAdapter(
    private val context: Context,
    private val listaServicos: MutableList<Servicos>,
) : RecyclerView.Adapter<ServicosAdapter.ServicosViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServicosViewHolder {
        val itemLista = ServicosItemBinding.inflate(
            LayoutInflater.from(context),
            parent,
            false
        )
        return ServicosViewHolder(itemLista)
    }

    override fun getItemCount() = listaServicos.size


    override fun onBindViewHolder(holder: ServicosViewHolder, position: Int) {
        listaServicos[position].img?.let { holder.imgServico.setImageResource(it) }
        listaServicos[position].nome?.let { holder.txtServico.text = it }
    }

    inner class ServicosViewHolder(binding: ServicosItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        val imgServico = binding.imgServicos
        val txtServico = binding.txtServico

    }
}