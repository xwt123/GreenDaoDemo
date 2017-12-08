package com.android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //单个插入操作：
        /*mMeiziDaoUtils.insertMeizi(new Meizi(null, "Google",
                "http://7xi8d6.48096_n.jpg"));
        break;*/

        //批量插入操作：
        /*List<Meizi> meiziList = new ArrayList<>();
        meiziList.add(new Meizi(null, "HuaWei",
                "http://7xi8d648096_n.jpg"));
        meiziList.add(new Meizi(null, "Apple",
                "http://7xi8d648096_n.jpg"));
        meiziList.add(new Meizi(null, "MIUI",
                "http://7xi8d648096_n.jpg"));
        mMeiziDaoUtils.insertMultMeizi(meiziList);*/

        //单个更改操作：（其中原有的数据都不会保存，如果新建的对象有属性没有设置，则会为空，不为空的字段没有设置，则报错）
        /*Meizi meizi = new Meizi();
        meizi.set_id(1002l);
        meizi.setUrl("http://baidu.jpg");
        mMeiziDaoUtils.updateMeizi(meizi);*/

        //删除某条记录操作：
        /*Meizi meizi1 = new Meizi();
        meizi1.set_id(1002l);
        mMeiziDaoUtils.deleteMeizi(meizi1);*/

        //删除所有记录操作：
//        mMeiziDaoUtils.deleteAll();

        //查询所有记录：
        // Log.i(TAG, mMeiziDaoUtils.queryMeiziById(1008l).toString());

        //根据主键查询记录：
        /*List<Meizi> meiziList1 = mMeiziDaoUtils.queryAllMeizi();
        for (Meizi meizi2 : meiziList1) {
            Log.i(TAG, meizi2.toString());
        }*/

        //各种条件查询：
       /* String sql = "where _id > ?";
        String[] condition = new String[]{"1008"};
        List<Meizi> meiziList2 = mMeiziDaoUtils.queryMeiziByNativeSql(sql, condition);
        for (Meizi meizi2 : meiziList2) {
            Log.i(TAG, meizi2.toString());
        }*/
    }
}
