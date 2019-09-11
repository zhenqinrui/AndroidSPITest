package com.rui.moduleb;

import android.app.Activity;
import android.os.Bundle;

import com.rui.spi.api.IModuleA;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 作者: zengqinrui on 19/9/11 17:06
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */
public class ModuleBActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moduleb);

        // 调用moduleA的业务接口
        ServiceLoader<IModuleA> moduleA = ServiceLoader.load(IModuleA.class);
        Iterator<IModuleA> iterator = moduleA.iterator();
        while (iterator.hasNext()) {
            IModuleA iModuleA = iterator.next();
            iModuleA.businessModuleA();
        }
    }
}
