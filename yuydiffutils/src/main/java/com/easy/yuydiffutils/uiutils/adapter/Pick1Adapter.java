package com.easy.yuydiffutils.uiutils.adapter;



import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.easy.yuydiffutils.R;
import com.easy.yuydiffutils.uiutils.entity.PickEntity;

import java.util.List;

/**
 * Author: yuyang
 * Date:2019/6/20 15:15
 */
public class Pick1Adapter extends BaseQuickAdapter<PickEntity.RestbodyBean.Higher1LevelBean, BaseViewHolder> {

    public Pick1Adapter(List data){
        super(R.layout.item_pick, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, PickEntity.RestbodyBean.Higher1LevelBean item) {
        //将每一个需要赋值的id 和对应的数据绑定
        helper.setText(R.id.cb_item_pick, item.getName());

        if (item.isChecked()){
            helper.setChecked(R.id.cb_item_pick, true);
        }else {
            helper.setChecked(R.id.cb_item_pick, false);

        }

        //设置title 的点击监听
        helper.addOnClickListener(R.id.cb_item_pick);
    }
}
