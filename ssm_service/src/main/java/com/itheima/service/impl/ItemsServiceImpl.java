package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl {

    @Autowired
    private ItemsDao itemsDao;

    /***
     * 集合查询
     * @return
     */
    public List<Items>findAll(){
        return itemsDao.findAll();
    }

    /***
     * 增加商品测试事务
     * @param items
     * @return
     */
     public int save(Items items){
         int account=itemsDao.save(items);

         System.out.println("account = " + account);

         //测试事务，如果出错，是否回滚
         //int q=10/0;

         return account;
     }
}