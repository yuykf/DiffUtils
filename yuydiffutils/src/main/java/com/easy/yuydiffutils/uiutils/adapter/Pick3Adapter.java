package com.easy.yuydiffutils.uiutils.adapter;

import androidx.annotation.Nullable;


import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.easy.yuydiffutils.R;
import com.easy.yuydiffutils.uiutils.entity.PickEntity;

import java.util.List;

/**
 * Author: yuyang
 * Date:2019/6/20 15:37
 */
public class Pick3Adapter extends BaseQuickAdapter<PickEntity.RestbodyBean.Higher3LevelBean, BaseViewHolder> {

    public Pick3Adapter(@Nullable List data) {
        super(R.layout.item_pick, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, PickEntity.RestbodyBean.Higher3LevelBean data) {
        //将每一个需要赋值的id和对应的数据绑定
        helper.setText(R.id.cb_item_pick, data.getName());
        if(data.isChecked()){
            helper.setChecked(R.id.cb_item_pick,true);
        }else {
            helper.setChecked(R.id.cb_item_pick,false);
        }

        //设置title的点击监听
        helper.addOnClickListener(R.id.cb_item_pick);
    }
}
