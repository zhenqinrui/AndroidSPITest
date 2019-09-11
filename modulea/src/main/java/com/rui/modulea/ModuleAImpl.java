package com.rui.modulea;

import android.util.Log;

import com.rui.spi.api.IModuleA;

/**
 * 作者: zengqinrui on 19/9/11 16:53
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */
public class ModuleAImpl implements IModuleA {

    @Override
    public void businessModuleA() {
        Log.i("zqr", "businessModuleA invoke");
    }
}
