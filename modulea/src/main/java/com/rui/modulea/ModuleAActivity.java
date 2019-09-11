package com.rui.modulea;

import android.app.Activity;
import android.os.Bundle;

import com.rui.spi.api.IModuleB;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 作者: zengqinrui on 19/9/11 17:00
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */
public class ModuleAActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulea);

        // 调用moduleB的业务接口
        ServiceLoader<IModuleB> moduleB = ServiceLoader.load(IModuleB.class);
        Iterator<IModuleB> iterator = moduleB.iterator();
        while (iterator.hasNext()) {
            IModuleB iModuleB = iterator.next();
            iModuleB.businessModuleB();
        }
    }
}
