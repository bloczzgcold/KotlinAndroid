package com.gfd.music.adapter

import android.content.Context
import android.widget.TextView
import com.gfd.common.ui.adapter.BaseAdapter
import com.gfd.common.ui.adapter.BaseViewHolder
import com.gfd.music.R
import com.google.android.flexbox.FlexboxLayoutManager

/**
 * @Author : 郭富东
 * @Date ：2018/8/18 - 11:01
 * @Email：878749089@qq.com
 * @description：
 */
class MvTagAdapter(val context: Context) : BaseAdapter<String>(context) {
    override fun getItemLayoutId(): Int = R.layout.music_item_mvdetail_tag

    override fun onBindView(holder: BaseViewHolder, position: Int) {
        holder.apply {
            setText(R.id.tv_item_tag, mData[position])
            val lp = getView<TextView>(R.id.tv_item_tag).layoutParams
            if (lp is FlexboxLayoutManager.LayoutParams) {
                lp.flexGrow = 1.0f
            }
        }
    }

}