package com.bupt.route;

import com.bupt.controller.BuptclassController;
import com.bupt.model.Buptclass;
import com.jfinal.config.*;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;

/**
 * Created by jaf on 16/9/6.
 */
public class BuptclassConfig extends JFinalConfig {
    public void configConstant(Constants me) {
        me.setDevMode(true);
    }

    public void configRoute(Routes me) {
        me.add("/buptclass", BuptclassController.class);
    }

    public void configPlugin(Plugins me) {
        C3p0Plugin cp = new C3p0Plugin("", "", "");
        me.add(cp);
        ActiveRecordPlugin arp = new ActiveRecordPlugin(cp);
        me.add(arp);
        arp.addMapping("buptclass", Buptclass.class);
    }

    public void configInterceptor(Interceptors me) {
    }

    public void configHandler(Handlers me) {
    }
}
