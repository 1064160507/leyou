package com.leyou.item.service;

import com.leyou.common.pojo.PageResult;
import com.leyou.item.bo.SpuBo;
import com.leyou.item.pojo.Sku;
import com.leyou.item.pojo.SpuDetail;
import com.leyou.parameter.pojo.SpuQueryByPageParameter;

import java.util.List;

/**
 * @Description: <>
 * @Author: Mr_Z
 * @Date: 2018/11/16 9:27
 **/
public interface GoodsService {

    /**
     * 分页查询
     * @param spuQueryByPageParameter
     * @return
     */
    PageResult<SpuBo> querySpuByPageAndSort(SpuQueryByPageParameter spuQueryByPageParameter);

    /**
     * 保存商品
     * @param spu
     */
    void saveGoods(SpuBo spu);

    /**
     * 根据id查询商品信息
     * @param id
     * @return
     */
    SpuBo queryGoodsById(Long id);

    /**
     * 更新商品信息
     * @param spuBo
     */
    void updateGoods(SpuBo spuBo);

    /**
     * 商品下架
     * @param id
     */
    void goodsSoldOut(Long id);

    /**
     * 商品删除，单个多个二合一
     * @param id
     */
    void deleteGoods(long id);

    /**
     * 根据spu商品id查询详细信息
     * @param id
     * @return
     */
    SpuDetail querySpuDetailBySpuId(long id);

    /**
     * 根据Sku的id查询其下所有的sku
     * @param id
     * @return
     */
    List<Sku> querySkuBySpuId(Long id);

    /**
     * 发送校区到mq
     * @param id
     * @param type
     */
    void sendMessage(Long id,String type);

    /**
     * 查询sku根据id
     * @param id
     * @return
     */
    Sku querySkuById(Long id);
}

