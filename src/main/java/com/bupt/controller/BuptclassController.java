package com.bupt.controller;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jaf on 16/9/7.
 */
public class BuptclassController extends Controller {

//    @Before(CacheInterceptor.class)
    public void index() {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd");
        String dateStr = dateFormat.format(now);
        System.out.println(dateStr);
        String lists = Db.queryStr("select content from buptclass where timestr=?", dateStr + "");
        System.out.println(lists);
        renderJson(lists);
    }
}
