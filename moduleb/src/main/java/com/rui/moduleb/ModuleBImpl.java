package com.rui.moduleb;

import android.util.Log;

import com.rui.spi.api.IModuleB;

/**
 * 作者: zengqinrui on 19/9/11 16:56
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */
public class ModuleBImpl implements IModuleB {

    @Override
    public void businessModuleB() {
        Log.i("zqr", "businessModuleB invoke");
    }
}
