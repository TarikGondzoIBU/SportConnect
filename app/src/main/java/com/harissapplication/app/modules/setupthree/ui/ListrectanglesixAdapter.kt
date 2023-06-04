package com.harissapplication.app.modules.setupthree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.harissapplication.app.R
import com.harissapplication.app.databinding.RowListrectanglesix1Binding
import com.harissapplication.app.modules.setupthree.`data`.model.Listrectanglesix1RowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglesixAdapter(
  var list: List<Listrectanglesix1RowModel>
) : RecyclerView.Adapter<ListrectanglesixAdapter.RowListrectanglesix1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglesix1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglesix1,parent,false)
    return RowListrectanglesix1VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglesix1VH, position: Int) {
    val listrectanglesix1RowModel = Listrectanglesix1RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglesix1RowModel = list[position]
    holder.binding.listrectanglesix1RowModel = listrectanglesix1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectanglesix1RowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: Listrectanglesix1RowModel
    ) {
    }
  }

  inner class RowListrectanglesix1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglesix1Binding = RowListrectanglesix1Binding.bind(itemView)
  }
}
