/*
 * Copyright (C) 2023 The PixelExperience Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.android.server.edoubleu;

import android.content.Context;
import com.android.server.SystemService;

import com.android.internal.util.edoubleu.DeviceConfigUtils;

public class EdoubleuDeviceConfigService extends SystemService {

    private static final String TAG = "EdoubleuDeviceConfigService";

    private final Context mContext;

    public EdoubleuDeviceConfigService(Context context) {
        super(context);
        mContext = context;
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onBootPhase(int phase) {
        if (phase == PHASE_BOOT_COMPLETED) {
            DeviceConfigUtils.setDefaultProperties(null, null);
        }
    }
}
