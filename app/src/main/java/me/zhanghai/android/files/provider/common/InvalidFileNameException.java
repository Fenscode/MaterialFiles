/*
 * Copyright (c) 2019 Hai Zhang <dreaming.in.code.zh@gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.android.files.provider.common;

import androidx.annotation.Nullable;
import java8.nio.file.FileSystemException;

public class InvalidFileNameException extends FileSystemException {

    public InvalidFileNameException(@Nullable String file) {
        super(file);
    }

    public InvalidFileNameException(@Nullable String file, @Nullable String other,
                                    @Nullable String reason) {
        super(file, other, reason);
    }
}
